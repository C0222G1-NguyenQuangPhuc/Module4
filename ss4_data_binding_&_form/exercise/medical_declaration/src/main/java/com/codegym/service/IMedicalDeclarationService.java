package com.codegym.service;

import com.codegym.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalDeclarationService {

    public void create(MedicalDeclaration medicalDeclaration);

    public void update(MedicalDeclaration medicalDeclaration);

    public List<String> getBirthList();

    public List<String> getGenderList();

    public List<String> getNationalityList();

    public List<String> getVehicleList();

    public List<String> getDayList();

    public List<String> getMonthList();

    public List<String> getYearList();

}
