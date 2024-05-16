package mx.com.turismopequena.web.controller;

import mx.com.turismopequena.persistence.entity.DetalleEntity;
import mx.com.turismopequena.persistence.projection.interfacebased.detail.closed.DetailClosedView;
import mx.com.turismopequena.service.detail.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/turismo/detalles")
public class DetailController {
    @Autowired
    private DetailService detailService;
    @GetMapping
    public List<DetailClosedView> findBy(){
        return detailService.findBy();
    }

}
