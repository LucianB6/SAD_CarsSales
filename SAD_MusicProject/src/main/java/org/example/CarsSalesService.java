package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsSalesService {
    private final CarsSalesRepository carsSalesRepository;

    @Autowired
    public CarsSalesService(CarsSalesRepository carsSalesRepository) {
        this.carsSalesRepository = carsSalesRepository;
    }

    public List<CarsSales> getStatisticiMasina(String carModel) {
        return carsSalesRepository.getStatisticiMasina(carModel);
    }
}
