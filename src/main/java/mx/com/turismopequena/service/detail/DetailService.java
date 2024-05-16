package mx.com.turismopequena.service.detail;

import mx.com.turismopequena.persistence.entity.DetalleEntity;
import mx.com.turismopequena.persistence.projection.interfacebased.detail.closed.DetailClosedView;

import java.util.List;

public interface DetailService {
    List<DetailClosedView> findBy();
}
