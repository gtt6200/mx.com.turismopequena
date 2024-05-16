package mx.com.turismopequena.persistence.repository;

import mx.com.turismopequena.persistence.entity.ClientEntity;
import mx.com.turismopequena.persistence.repository.dto.ClientResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientQueryRepository extends JpaRepository<ClientEntity, Long> {
    @Query("""
            SELECT new mx.com.turismopequena.persistence.repository.dto.ClientResponseDTO(c.name, c.phone, c.email, c.type) FROM ClientEntity c
            """)
//    @Query("""
//            SELECT c.id, c.name, c.phone, c.email, c.clientType
//            FROM ClientEntity c
//            """)
    List<ClientResponseDTO> findAllRegisterDTO();
}
