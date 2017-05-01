package com.apps.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    
    @Column(name="first_name", nullable = true)
    private String firstName;
    
    @Column(name="sub_division", nullable = true)
    private String subDivision;
    
    @Column(name="last_name", nullable = true)
    private String lastName;
    
    @Column(name="status", nullable = true)
    private String status;
    
    @Column(name="gender", nullable = true)
    private String gender;
    
    @Column(name="suspend_date", nullable = true)
    private Date suspendDate;
    
    @Column(name="dob", nullable = true)
    private Date dob;
    
    @Column(name="hired_date", nullable = true)
    private Date hiredDate;
    
    @Column(name="nationality", nullable = true)
    private String nationality;
    
    @Column(name="grade", nullable = true)
    private String grade;
    
    @Column(name="marital_status", nullable = true)
    private String maritalStatus;
    
    @Column(name="division", nullable = true)
    private String division;
    
    @Column(name="phone", nullable = true)
    private String phone;
    
    @Column(name="email", nullable = true)
    private String email;
    
    @ManyToOne
    @JoinColumn(name="locationId", nullable = true)
    private Location location;
    
    @Column(name="image_path", nullable = true)
    private String imagePath;
    
    public Employee(){}

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSubDivision() {
        return subDivision;
    }

    public void setSubDivision(String subDivision) {
        this.subDivision = subDivision;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getSuspendDate() {
        return suspendDate;
    }

    public void setSuspendDate(Date suspendDate) {
        this.suspendDate = suspendDate;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    
    
}
