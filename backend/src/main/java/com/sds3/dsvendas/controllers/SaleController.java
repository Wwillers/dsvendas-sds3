package com.sds3.dsvendas.controllers;

import com.sds3.dsvendas.dto.SaleDTO;
import com.sds3.dsvendas.dto.SaleSuccessDTO;
import com.sds3.dsvendas.dto.SaleSumDTO;
import com.sds3.dsvendas.dto.SellerDTO;
import com.sds3.dsvendas.services.SaleService;
import com.sds3.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        Page<SaleDTO> list = saleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller() {
        List<SaleSumDTO> list = saleService.amountGroupBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller() {
        List<SaleSuccessDTO> list = saleService.successGroupBySeller();
        return ResponseEntity.ok(list);
    }
}
