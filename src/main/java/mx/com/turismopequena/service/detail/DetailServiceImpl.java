package mx.com.turismopequena.service.detail;

import mx.com.turismopequena.persistence.repository.detail.DetailDTO;
import mx.com.turismopequena.persistence.repository.detail.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailServiceImpl implements DetailService{
    @Autowired
    private DetailRepository detailRepository;
    @Override
    public List<DetailDTO> findDetailDTO() {
        try {
            var detalle = detailRepository.findDetailDTO();
            return detalle;
        }catch(Exception e) {
            System.out.println("error presentado: " + e.getMessage());
        }
        return null;
    }
}
