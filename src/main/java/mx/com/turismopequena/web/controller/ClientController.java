/**
 * @author alxy
 */
package mx.com.turismopequena.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.turismopequena.service.client.ClientNameIdResponse;
import mx.com.turismopequena.service.client.ClientResponse;
import mx.com.turismopequena.service.client.ClientService;

/**
 * 
 */
@RestController
@RequestMapping("turismo/clientes")
public class ClientController {
	
	@Autowired
	private final ClientService clientService;
	

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}


	@GetMapping
	public ResponseEntity<List<ClientResponse>> getAlL(){
		return ResponseEntity.ok(this.clientService.getAll());
	}
	
	@GetMapping("name")
	public ResponseEntity<List<ClientNameIdResponse>> getNameId(){
		return ResponseEntity.ok(this.clientService.getAllNameId());
	}
}
