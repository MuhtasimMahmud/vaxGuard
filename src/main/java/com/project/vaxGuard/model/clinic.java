package com.project.vaxGuard.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class clinic extends User{

    private String name;
    @Column(unique = true)
    private String registrationNumber;
    @OneToMany
    private List<clinicVaccines> vaccinesList;
    @OneToMany
    private List<vaccineCandidate> records;
    @OneToMany
    private List<vaccineCandidate> requests;

    public clinic(){
        //Default Constructor
    }

    public clinic(String role, String emailId, String password, String name, String registrationNumber, List<clinicVaccines> vaccinesList, List<vaccineCandidate> records, List<vaccineCandidate> requests) {
        super.setRole(role);
        super.setEmailId(emailId);
        super.setPassword(password);
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.vaccinesList = vaccinesList;
        this.records = records;
        this.requests = requests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public List<clinicVaccines> getVaccinesList() {
        return vaccinesList;
    }

    public void setVaccinesList(List<clinicVaccines> vaccinesList) {
        this.vaccinesList = vaccinesList;
    }

    public List<vaccineCandidate> getRecords() {
        return records;
    }

    public void setRecords(List<vaccineCandidate> records) {
        this.records = records;
    }

    public List<vaccineCandidate> getRequests() {
        return requests;
    }

    public void setRequests(List<vaccineCandidate> requests) {
        this.requests = requests;
    }
}
