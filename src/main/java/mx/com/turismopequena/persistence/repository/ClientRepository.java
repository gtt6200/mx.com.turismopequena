/**
 * @author alxy
 */
package mx.com.turismopequena.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import mx.com.turismopequena.persistence.entity.ClientEntity;

/**
 * 
 */
public interface ClientRepository extends ListCrudRepository<ClientEntity, Long>{

}
