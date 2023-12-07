package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CarsSalesService {
    private final CarsSalesRepository carsSalesRepository;
    private final CarsProfitableRepository carsProfitableRepository;
    @Autowired
    public CarsSalesService(CarsSalesRepository carsSalesRepository, CarsProfitableRepository carsProfitableRepository) {
        this.carsSalesRepository = carsSalesRepository;
        this.carsProfitableRepository = carsProfitableRepository;
    }


    public List<CarAttributes> getStatisticiMasina(String carModel) {
        return carsSalesRepository.getStatisticiMasina(carModel);
    }

    public List<String> getCarName() {
        return carsSalesRepository.getCarName();
    }

    public List<CarProfitable> getCarProfitableModelBy(int minYear, int maxYear){
        return carsProfitableRepository.getCarProfitableModelBy(minYear, maxYear);
    }

    public List<CarRentedCount> getRentedCarCount(){
        return carsProfitableRepository.getRentedCarCount();
    }

    public List<String> getRentedCarName(){
        return carsProfitableRepository.getRentedCarName();
    }

    public int getAllCarCount(){
        return carsProfitableRepository.getAllCarCount();
    }

    public List<CarPrices> getCarPrices(String carMake, String carModel){
        return carsProfitableRepository.getCarPrices(carMake, carModel);
    }
}
