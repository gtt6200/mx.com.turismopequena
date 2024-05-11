/**
 * @author alxy
 */
package mx.com.turismopequena.service.client;

import lombok.Data;
import mx.com.turismopequena.persistence.entity.enums.ClientType;

/**
 * 
 */
@Data
public class ClientRequest {
	
	private String email;
	
	private String name;
	
	private String phone;
	
	private ClientType clientType;
}
