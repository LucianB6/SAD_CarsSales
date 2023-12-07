package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarsProfitableRepository extends JpaRepository<CarProfitableModel, Long> {

    @Query("SELECT new org.example.CarProfitable(carModel, carMake, max(profit), carYear) FROM CarProfitableModel" +
            " WHERE carYear >= :minYear and carYear <= :maxYear" +
            " GROUP BY carModel, carMake, carYear" +
            " ORDER BY max(profit) DESC" +
            " LIMIT 3")

    List<CarProfitable> getCarProfitableModelBy(@Param("minYear") int minimumYear, @Param("maxYear") int maximumYear);

    /*
    Evidentierea ponderii fiecarui tip/subtip de masina in total inchirieri
    */

    @Query("SELECT new org.example.CarRentedCount(carMake, carModel, count(carModel)) from CarProfitableModel group by carMake, carModel")
    List<CarRentedCount> getRentedCarCount();

    @Query("SELECT DISTINCT carMake, carModel " +
            "FROM CarProfitableModel group by carMake, carModel" )
    List<String> getRentedCarName();

    @Query("SELECT count(carMake) from CarProfitableModel")
    int getAllCarCount();

    @Query("SELECT new org.example.CarPrices(cpm.carModel, cpm.carMake, AVG(cpm.carPrice), cpm.carYear) FROM CarProfitableModel cpm " +
            "WHERE cpm.carModel = :carModel and cpm.carMake = :carMake and cpm.carYear IN (" +
            "  SELECT cpm2.carYear FROM CarProfitableModel cpm2 " +
            "  WHERE cpm2.carModel = :carModel and cpm2.carMake = :carMake" +
            "  GROUP BY cpm2.carYear" +
            ") " +
            "GROUP BY cpm.carModel, cpm.carMake, cpm.carYear" +
            " order by cpm.carYear")

    List<CarPrices> getCarPrices(@Param("carMake") String carMakeParam, @Param("carModel") String carModelParam);
}
