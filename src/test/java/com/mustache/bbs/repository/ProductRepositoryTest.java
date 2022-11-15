package com.mustache.bbs.repository;

import com.mustache.bbs.domain.entity.Hospital;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {
    @Autowired
    HospitalRepository hospitalRepository;

    @Test
    @DisplayName("BusinessTypeName이 보건소 보건지소 보건진료소인 데이터가 잘 나오는지")
    void findByBusinessTypeNameIn() {
        List<String> inClues = new ArrayList<>();
        inClues.add("보건소");
        inClues.add("보건진료소");
        inClues.add("보건지소");
        List<Hospital> hospitals = hospitalRepository.findByBusinessTypeNameInAndRoadNameAddressLike(inClues, "%광진구%");
        for (var hospital : hospitals
        ) {
            System.out.println(hospital.getHospitalName());
        }
    }
}
