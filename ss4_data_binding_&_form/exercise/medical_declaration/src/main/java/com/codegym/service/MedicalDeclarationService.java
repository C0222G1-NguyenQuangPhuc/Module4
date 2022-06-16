package com.codegym.service;

import com.codegym.model.MedicalDeclaration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicalDeclarationService implements IMedicalDeclarationService{

    @Override
    public void create(MedicalDeclaration medicalDeclaration) {

    }

    @Override
    public void update(MedicalDeclaration medicalDeclaration) {

    }

    @Override
    public List<String> getBirthList() {
        List<String> listBirth = new ArrayList<>();
        listBirth.add("1990");
        listBirth.add("1991");
        listBirth.add("1992");
        listBirth.add("1993");
        listBirth.add("1994");
        listBirth.add("1995");
        listBirth.add("1996");
        listBirth.add("1997");
        listBirth.add("1998");
        listBirth.add("1999");
        listBirth.add("2000");
        return listBirth;
    }

    @Override
    public List<String> getGenderList() {
        List<String> listGender = new ArrayList<>();
        listGender.add("Nam");
        listGender.add("Nữ");
        listGender.add("Khác");
        return listGender;
    }

    @Override
    public List<String> getNationalityList() {
        List<String> listNationality = new ArrayList<>();
        listNationality.add("Việt Nam");
        listNationality.add("Nhật Bản");
        listNationality.add("Hàn Quốc");
        listNationality.add("Trung Quốc");
        listNationality.add("Thái Lan");
        listNationality.add("Lào");
        listNationality.add("Campuchia");
        return listNationality;
    }

    @Override
    public List<String> getVehicleList() {
        List<String> listVehicle = new ArrayList<>();
        listVehicle.add("Tàu bay");
        listVehicle.add("Tàu thuyền");
        listVehicle.add("Ô tô");
        listVehicle.add("Khác (Ghi rõ)");
        return listVehicle;
    }

    @Override
    public List<String> getDayList() {
        List<String> listDay = new ArrayList<>();
        listDay.add("1");
        listDay.add("2");
        listDay.add("3");
        listDay.add("4");
        listDay.add("5");
        listDay.add("6");
        listDay.add("7");
        listDay.add("8");
        listDay.add("9");
        listDay.add("10");
        listDay.add("11");
        listDay.add("12");
        listDay.add("13");
        listDay.add("14");
        listDay.add("15");
        listDay.add("16");
        listDay.add("17");
        listDay.add("18");
        listDay.add("19");
        listDay.add("20");
        listDay.add("21");
        listDay.add("22");
        listDay.add("23");
        listDay.add("24");
        listDay.add("25");
        listDay.add("26");
        listDay.add("27");
        listDay.add("28");
        listDay.add("29");
        listDay.add("30");
        return listDay;
    }

    @Override
    public List<String> getMonthList() {
        List<String> listMonth = new ArrayList<>();
        listMonth.add("1");
        listMonth.add("2");
        listMonth.add("3");
        listMonth.add("4");
        listMonth.add("5");
        listMonth.add("6");
        listMonth.add("7");
        listMonth.add("8");
        listMonth.add("9");
        listMonth.add("10");
        listMonth.add("11");
        listMonth.add("12");
        return listMonth;
    }

    @Override
    public List<String> getYearList() {
        List<String> listYear = new ArrayList<>();
        listYear.add("2019");
        listYear.add("2020");
        listYear.add("2021");
        listYear.add("2022");
        return listYear;
    }
}
