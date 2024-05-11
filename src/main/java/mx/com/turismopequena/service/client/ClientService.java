/**
 * @author alxy
 */
package mx.com.turismopequena.service.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.turismopequena.persistence.entity.ClientEntity;
import mx.com.turismopequena.persistence.repository.ClientRepository;

/**
 * 
 */
@Service
public class ClientService {

	@Autowired
	private final ClientRepository clientRepository;

	public ClientService(ClientRepository clientReposoitory) {
		this.clientRepository = clientReposoitory;
	}
	
	public List<ClientResponse> getAll() {
        return clientRepository.findAll()
                .stream()
                .map(client -> new ClientResponse(
                		client.getId(), 
                		client.getName(), 
                		client.getPhone(), 
                		client.getEmail(),
                		client.getType()))
                .toList();
    }
	public List<ClientNameIdResponse> getAllNameId(){
		return clientRepository.findAll()
				.stream()
				.map(client -> new ClientNameIdResponse(
						client.getId(), 
		                client.getName()
						)).toList();
	}
//		List<ClientEntity> entities = this.clientRepository.findAll();
//		List<ClientResponse> clientResponse = new ArrayList<>();
//		ClientResponse auxResponse = new ClientResponse();
//		for(ClientEntity client : entities) {
//			auxResponse.setId(client.getId());
//			auxResponse.setName(client.getName());
//			auxResponse.setPhone(client.getPhone());
//			auxResponse.setEmail(client.getEmail());
//			clientResponse.add(auxResponse);
//		}
//		return clientResponse;
	
}
