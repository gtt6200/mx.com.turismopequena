package mx.com.turismopequena.service.detail;

import mx.com.turismopequena.persistence.projection.interfacebased.detail.closed.DetailClosedView;
import mx.com.turismopequena.persistence.repository.detail.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetailServiceImpl implements DetailService{
    @Autowired
    private DetailRepository detailRepository;
    @Override
    public List<DetailClosedView> findBy() {
        try {
            var detalle = detailRepository.findBy();
            return detalle;
        }catch(Exception e) {
            System.out.println("error presentado: " + e.getMessage());
        }
        return null;
    }
}
