/**
 * @author alxy
 */
package mx.com.turismopequena.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import mx.com.turismopequena.persistence.entity.UserEntity;

/**
 * 
 */

public interface UserRepository extends ListCrudRepository<UserEntity, Long>{

}
