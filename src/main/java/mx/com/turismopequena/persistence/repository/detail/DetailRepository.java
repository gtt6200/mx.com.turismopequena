package mx.com.turismopequena.persistence.repository.detail;

import mx.com.turismopequena.persistence.entity.DetalleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailRepository extends JpaRepository<DetalleEntity, Long> {
    @Query("""
            SELECT new mx.com.turismopequena.persistence.repository.detail.DetailDTO(
                    c.id, c.travelId.destination.city,
                     c.userId.name, c.clientId.name, c.people, c.board)
                FROM DetalleEntity c
            """)
    List<DetailDTO> findDetailDTO();

}
