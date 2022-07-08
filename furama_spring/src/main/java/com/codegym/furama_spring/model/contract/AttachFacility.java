package com.codegym.furama_spring.model.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class AttachFacility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer attachFacilityId;
    private String attachFacilityName;
    private Double attachFacilityCost;
    private String attachFacilityUnit;

    @OneToMany(mappedBy = "attactFacility")
    @JsonBackReference(value = "back_attach")
    private List<ContractDetail> contractDetailList;
    private String status;

    public AttachFacility() {
    }

    public Integer getAttachFacilityId() {
        return attachFacilityId;
    }

    public void setAttachFacilityId(Integer attachFacilityId) {
        this.attachFacilityId = attachFacilityId;
    }

    public String getAttachFacilityName() {
        return attachFacilityName;
    }

    public void setAttachFacilityName(String attactFacilityName) {
        this.attachFacilityName = attactFacilityName;
    }

    public Double getAttachFacilityCost() {
        return attachFacilityCost;
    }

    public void setAttachFacilityCost(Double attactFacilityCost) {
        this.attachFacilityCost = attactFacilityCost;
    }

    public String getAttachFacilityUnit() {
        return attachFacilityUnit;
    }

    public void setAttachFacilityUnit(String attactFacilityUnit) {
        this.attachFacilityUnit = attactFacilityUnit;
    }

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
