package mx.com.turismopequena.persistence.repository.detail;

import mx.com.turismopequena.persistence.entity.DetalleEntity;
import mx.com.turismopequena.persistence.projection.interfacebased.detail.closed.DetailClosedView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailRepository extends JpaRepository<DetalleEntity, Long> {
    // closed view interface based
    List<DetailClosedView> findBy();
}
