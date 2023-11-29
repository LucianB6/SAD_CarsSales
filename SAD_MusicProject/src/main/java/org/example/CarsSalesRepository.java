package org.example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CarsSalesRepository extends JpaRepository<CarsModel, Long> {
    /*
    Cerinta:

    Sa se evidentieze vanzarile de masini in functie de:
     - tipul
     - transmisiunea
     - review-uri
     */
    @Query("SELECT new org.example.CarsSales(cs.carModel, cs.bodyType, cs.transmissionType, cs.reviewsCount) " +
            "FROM CarsModel cs " +
            "WHERE cs.carModel = :carModelParam " +
            "GROUP BY cs.carModel, cs.bodyType, cs.transmissionType, cs.reviewsCount")
    List<CarsSales> getStatisticiMasina(@Param("carModelParam") String carModel);
}
