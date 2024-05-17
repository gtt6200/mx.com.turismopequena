package mx.com.turismopequena.service.detail;

import mx.com.turismopequena.persistence.repository.detail.DetailDTO;

import java.util.List;

public interface DetailService {
    List<DetailDTO> findDetailDTO();
}
