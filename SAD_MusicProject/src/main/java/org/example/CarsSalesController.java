package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vanzari-masini")
public class CarsSalesController {

    private final CarsSalesService carsSalesService;

    @Autowired
    public CarsSalesController(CarsSalesService carsSalesService) {
        this.carsSalesService = carsSalesService;
    }

    @GetMapping("/statistici/{carModel}")
    public List<CarsSales> getStatisticiMasina(@PathVariable String carModel) {

        List<CarsSales> result = carsSalesService.getStatisticiMasina(carModel);
        for (CarsSales car: result
             ) {
            System.out.println("Cars:" + car.toString());
        }
        return carsSalesService.getStatisticiMasina(carModel);
    }
}
