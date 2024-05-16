/**
 * @author alxy
 */
package mx.com.turismopequena.web.controller;

import java.time.Duration;
import java.util.List;

import mx.com.turismopequena.persistence.entity.ClientEntity;
import mx.com.turismopequena.persistence.repository.ClientQueryRepository;
import mx.com.turismopequena.persistence.repository.dto.ClientResponseDTO;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.turismopequena.service.client.ClientNameIdResponse;
import mx.com.turismopequena.service.client.ClientResponse;
import mx.com.turismopequena.service.client.ClientService;
import mx.com.turismopequena.service.client.CreateClientRequest;

/**
 * 
 */
@RestController
@RequestMapping("turismo/clientes")
public class ClientController {
	
	@Autowired
	private final ClientService clientService;
	private final ClientQueryRepository cqr;

	public ClientController(ClientService clientService, ClientQueryRepository cqr) {
		this.clientService = clientService;
		this.cqr = cqr;
	}


	@GetMapping
	public ResponseEntity<List<ClientResponse>> getAlL(){
		return ResponseEntity.ok(this.clientService.getAll());
	}
	
	@GetMapping("name")
	public ResponseEntity<List<ClientNameIdResponse>> getNameId(){
		return ResponseEntity.ok(this.clientService.getAllNameId());
	}

	@GetMapping("name_dto")
	public List<ClientResponseDTO> findAllRegisterDTO(){
		long start = System.currentTimeMillis();
		var clients = this.cqr.findAllRegisterDTO();
		this.longDuration("findAllRegisterDTO",Duration.ofMillis(System.currentTimeMillis()-start),clients.size());
		return clients;
	}
	
	@PostMapping
	public ResponseEntity<ClientResponse> createClient(
			@RequestBody CreateClientRequest clientToCreate){
		ClientResponse response = clientService.saveClient(clientToCreate);
		return ResponseEntity.ok(response);
	}

	private void longDuration(String serviceName, Duration duration ,int size){
		System.out.printf("Service: %s took %d  ms to return %s  records",serviceName, duration.toMillis(), size);
	}
}
