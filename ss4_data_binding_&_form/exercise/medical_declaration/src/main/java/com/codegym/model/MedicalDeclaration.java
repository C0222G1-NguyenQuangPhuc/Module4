package com.codegym.model;

public class MedicalDeclaration {

    private String name;
    private String dateOfBirth;
    private String gender;
    private String nationality;
    private String idCard;
    private String vehicles;
    private String numberVehicle;
    private String seats;
    private String dayStart;
    private String monthStart;
    private String yearStart;
    private String dayEnd;
    private String monthEnd;
    private String yearEnd;
    private String itinerary;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String name,
                              String dateOfBirth,
                              String gender,
                              String nationality,
                              String idCard,
                              String vehicles,
                              String numberVehicle,
                              String seats,
                              String dayStart,
                              String monthStart,
                              String yearStart,
                              String dayEnd,
                              String monthEnd,
                              String yearEnd,
                              String itinerary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.idCard = idCard;
        this.vehicles = vehicles;
        this.numberVehicle = numberVehicle;
        this.seats = seats;
        this.dayStart = dayStart;
        this.monthStart = monthStart;
        this.yearStart = yearStart;
        this.dayEnd = dayEnd;
        this.monthEnd = monthEnd;
        this.yearEnd = yearEnd;
        this.itinerary = itinerary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getVehicles() {
        return vehicles;
    }

    public void setVehicles(String vehicles) {
        this.vehicles = vehicles;
    }

    public String getNumberVehicle() {
        return numberVehicle;
    }

    public void setNumberVehicle(String numberVehicle) {
        this.numberVehicle = numberVehicle;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getMonthStart() {
        return monthStart;
    }

    public void setMonthStart(String monthStart) {
        this.monthStart = monthStart;
    }

    public String getYearStart() {
        return yearStart;
    }

    public void setYearStart(String yearStart) {
        this.yearStart = yearStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getMonthEnd() {
        return monthEnd;
    }

    public void setMonthEnd(String monthEnd) {
        this.monthEnd = monthEnd;
    }

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getItinerary() {
        return itinerary;
    }

    public void setItinerary(String itinerary) {
        this.itinerary = itinerary;
    }
}
