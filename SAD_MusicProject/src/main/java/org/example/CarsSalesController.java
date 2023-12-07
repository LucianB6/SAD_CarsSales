package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("/api/vanzari-masini")
public class CarsSalesController {

    private final CarsSalesService carsSalesService;
    private final CarsProfitableRepository carsProfitableRepository;

    @Autowired
    public CarsSalesController(CarsSalesService carsSalesService, CarsProfitableRepository carsProfitableRepository) {
        this.carsSalesService = carsSalesService;
        this.carsProfitableRepository = carsProfitableRepository;
    }

    @GetMapping("/statistici/{carModel}")
    public List<CarAttributes> getStatisticiMasina(@PathVariable String carModel) {

        return carsSalesService.getStatisticiMasina(carModel);
    }

    @GetMapping("/statistici/{minYear}/{maxYear}")
    public List<CarProfitable> getCarProfitableModelBy(@PathVariable int minYear, @PathVariable int maxYear) {

        return carsProfitableRepository.getCarProfitableModelBy(minYear, maxYear);
    }

    @GetMapping("/statistici/name")
    public List<String> getCarName() {
        return carsSalesService.getCarName();
    }

    @GetMapping("/statistici/masini_inchiriate/allRentedCars")
    public List<CarRentedCount> getRentedCarCount(){
        return carsSalesService.getRentedCarCount();
    }

    @GetMapping("/statistici/masini_inchiriate/allCarsName")
    public List<String> getRentedCarName(){
        return carsSalesService.getRentedCarName();
    }

    @GetMapping("/statistici/masini_inchiriate/allCarsCount")
    public int getCarCount(){
        return carsSalesService.getAllCarCount();
    }

    @GetMapping("/statistici/masini_inchiriate/{carMake}/{carModel}")
    public List<CarPrices> getCarPrices(@PathVariable String carMake, @PathVariable String carModel){
        return carsSalesService.getCarPrices(carMake, carModel);
    }
}
