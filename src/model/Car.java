/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ms
 */
public class Car {
    private Integer idCar;
    private String registration;
    private Integer initialKm;
    private Integer yearOfProduction;
    private Integer carTypeId;

    public Car(String registration, Integer initialKm, Integer yearOfProduction, Integer carTypeId) {
        this.registration = registration;
        this.initialKm = initialKm;
        this.yearOfProduction = yearOfProduction;
        this.carTypeId = carTypeId;
    }

    public Integer getIdCar() {
        return idCar;
    }

    public String getRegistration() {
        return registration;
    }

    public Integer getInitialKm() {
        return initialKm;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Integer getCarTypeId() {
        return carTypeId;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setInitialKm(Integer initialKm) {
        this.initialKm = initialKm;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setCarTypeId(Integer carTypeId) {
        this.carTypeId = carTypeId;
    }

    @Override
    public String toString() {
        return "Car{" + "idCar=" + idCar + ", registration=" + registration + ", initialKm=" + initialKm + ", yearOfProduction=" + yearOfProduction + ", carTypeId=" + carTypeId + '}';
    }
}
