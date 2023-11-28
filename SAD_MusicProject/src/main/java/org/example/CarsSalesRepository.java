package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarsSalesRepository extends JpaRepository<CarsSales, Long> {

    @Query("SELECT cs.carModel, cs.bodyType, cs.transmissionType, cs.reviewsCount " +
            "FROM CarsSales cs " +
            "WHERE cs.carModel = :carModelParam " +
            "GROUP BY cs.carModel, cs.bodyType, cs.transmissionType, cs.reviewsCount")
    List<Object[]> getStatisticiMasina(@Param("carModelParam") String carModel);
}
