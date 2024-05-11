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
public class CreateClientRequest {
	
	private final String name;
	
	private final String email;
	
	private final String phone;
	
	private final ClientType type;
}
