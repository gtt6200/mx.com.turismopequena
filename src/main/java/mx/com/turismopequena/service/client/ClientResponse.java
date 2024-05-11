/**
 * @author alxy
 */
package mx.com.turismopequena.service.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import mx.com.turismopequena.persistence.entity.enums.ClientType;

/**
 * 
 */
@Data
@AllArgsConstructor
public class ClientResponse {
	
	private Long id;
	
	private String name;

	private String phone;

	private String email;

	private ClientType clientType;

}
