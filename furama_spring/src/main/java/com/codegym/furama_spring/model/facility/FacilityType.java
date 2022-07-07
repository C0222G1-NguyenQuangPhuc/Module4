package com.codegym.furama_spring.model.facility;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity(name = "facility_type")
public class FacilityType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facility_type_id")
    private Integer facilityTypeId;

    @Column(name = "facility_type_name")
    private String facilityTypeName;

    @OneToMany(mappedBy = "facilityType")
    @JsonBackReference(value = "back_facility_type")
    private List<Facility> facilityList;

    public FacilityType() {
    }

    public FacilityType(Integer facilityTypeId, String facilityTypeName, List<Facility> facilityList) {
        this.facilityTypeId = facilityTypeId;
        this.facilityTypeName = facilityTypeName;
        this.facilityList = facilityList;
    }

    public Integer getFacilityTypeId() {
        return facilityTypeId;
    }

    public void setFacilityTypeId(Integer facilityTypeId) {
        this.facilityTypeId = facilityTypeId;
    }

    public String getFacilityTypeName() {
        return facilityTypeName;
    }

    public void setFacilityTypeName(String facilityTypeName) {
        this.facilityTypeName = facilityTypeName;
    }

    public List<Facility> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<Facility> facilityList) {
        this.facilityList = facilityList;
    }
}
