/**
 * @author alxy
 */
package mx.com.turismopequena.service.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.turismopequena.persistence.entity.ClientEntity;
import mx.com.turismopequena.persistence.entity.enums.ClientType;
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
	
	public ClientResponse saveClient(CreateClientRequest clientToCreate) {
		final String name = clientToCreate.getName();
		final String phone = clientToCreate.getPhone();
		final String email = clientToCreate.getEmail();
		final ClientType type = clientToCreate.getType();
		
		ClientEntity client = new ClientEntity(null,name,phone,email,type);
		this.clientRepository.save(client);
		return new ClientResponse(
				client.getId(),
				client.getName(), 
				client.getPhone(), 
				client.getEmail(), 
				client.getType());
	}
	
	public boolean isExist(Long id) {
		return clientRepository.existsById(id);
	}
}
