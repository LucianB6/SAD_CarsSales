package org.example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CarsSalesRepository extends JpaRepository<CarsModel, Long>{
    /*
    determining the link between various attributes and
    features (ABS, CA, consumption, engine power
    and torque, &so on) and car prices, car classes and
    subclasses;
     */
    @Query("SELECT new org.example.CarAttributes(carModel, maxTorqueNp, maxTorqueRpm, maxPowerBhp, maxPowerRpm ,engineDisplacement, minimumPrice, endingPrice) " +
            "FROM CarsModel  " +
            "WHERE carModel = :carModelParam " +
            "GROUP BY carModel, maxTorqueNp, maxTorqueRpm, maxPowerBhp, maxPowerRpm ,engineDisplacement, minimumPrice, endingPrice ")

    List<CarAttributes> getStatisticiMasina(@Param("carModelParam") String carModel);

    /*
    Query pentru a putea lua toate masinile din baza de date.
     */
    @Query("SELECT carModel " +
            "FROM CarsModel group by carModel" )
    List<String> getCarName();

    /*
    Evidentierea celei mai profitabile/neprofitabile clase de masini intr-o perioada data
     */


}
