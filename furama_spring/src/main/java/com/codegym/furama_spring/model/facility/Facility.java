package com.codegym.furama_spring.model.facility;

import com.codegym.furama_spring.model.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity(name = "facility")
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facility_id")
    private Integer facilityId;

    @Column(name = "facility_name")
    private String facilityName;

    @Column(name = "facility_area")
    private Integer facilityArea;

    @Column(name = "facility_cost")
    private Double facilityCost;

    @Column(name = "max_people")
    private Integer maxPeople;

    @ManyToOne
    @JoinColumn(name = "rent_type_id")
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "facility_type_id", referencedColumnName = "facility_type_id")
    private FacilityType facilityType;

    @Column(name = "standard_room")
    private String standardRoom = "Không";

    private String description = "Không";

    @Column(name = "pool_area")
    private Double poolArea = 0.0;

    @Column(name = "number_of_floor")
    private Integer numberOfFloor = 0;

    @Column(name = "facility_free")
    private String facilityFree = "Không";

    @Column(name = "status_delete")
    private Integer statusDelete = 0;

    @OneToMany(mappedBy = "facility")
    @JsonBackReference
    private List<Contract> contractList;

    public Facility() {
    }

    public Facility(Integer facilityId, String facilityName, Integer facilityArea, Double facilityCost, Integer maxPeople, RentType rentType, FacilityType facilityType, String standardRoom, String description, Double poolArea, Integer numberOfFloor, String facilityFree, Integer statusDelete) {
        this.facilityId = facilityId;
        this.facilityName = facilityName;
        this.facilityArea = facilityArea;
        this.facilityCost = facilityCost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.facilityType = facilityType;
        this.standardRoom = standardRoom;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloor = numberOfFloor;
        this.facilityFree = facilityFree;
        this.statusDelete = statusDelete;
    }

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public Integer getFacilityArea() {
        return facilityArea;
    }

    public void setFacilityArea(Integer facilityArea) {
        this.facilityArea = facilityArea;
    }

    public Double getFacilityCost() {
        return facilityCost;
    }

    public void setFacilityCost(Double facilityCost) {
        this.facilityCost = facilityCost;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Double poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }

    public Integer getStatusDelete() {
        return statusDelete;
    }

    public void setStatusDelete(Integer statusDelete) {
        this.statusDelete = statusDelete;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }
}
