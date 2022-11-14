package com.mustache.bbs.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "nation_wide_hospitals")
@Getter
public class Hospital {

    @Id
    private Integer id;
//    private String openServiceName;
//    private Integer openLocalGovernmentCode;
//    private String managementNumber;
//    private LocalDateTime licenseDate;
//    private Integer businessStatus;
//    private Integer businessStatusCode;
//    private String phone;
//    private String fullAddress;
    @Column(name = "road_name_address")
    private String roadNameAddress;

    @Column(name = "hospital_name")
    private String hospitalName;
//    private String businessTypeName;
//    private Integer healthcareProviderCount;
//    private Integer patientRoomCount;
//    private Integer totalNumberOfBeds;
//    private float totalAreaSize;

}
