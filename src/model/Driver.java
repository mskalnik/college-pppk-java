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
public class Driver {
    private Integer idDriver;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String driversLicenceNumber;

    public Driver(String firstName, String lastName, String phoneNumber, String driversLicenceNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.driversLicenceNumber = driversLicenceNumber;
    }

    public Integer getIdDriver() {
        return idDriver;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDriversLicenceNumber() {
        return driversLicenceNumber;
    }

    public void setIdDriver(Integer idDriver) {
        this.idDriver = idDriver;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDriversLicenceNumber(String driversLicenceNumber) {
        this.driversLicenceNumber = driversLicenceNumber;
    }

    @Override
    public String toString() {
        return "Driver{" + "idDriver=" + idDriver + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", driversLicenceNumber=" + driversLicenceNumber + '}';
    }

    
}
