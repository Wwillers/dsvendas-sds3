package com.sds3.dsvendas.repositories;

import com.sds3.dsvendas.dto.SaleSuccessDTO;
import com.sds3.dsvendas.dto.SaleSumDTO;
import com.sds3.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.sds3.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
       + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.sds3.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + " FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupBySeller();
}
