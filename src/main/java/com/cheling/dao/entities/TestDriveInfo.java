package com.cheling.dao.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "test_drive_info")
public class TestDriveInfo {

    private int id;

    private String firstName;
    private String lastName;
    private String callName;
    private String email;
    private String tel;
    private String province;
    private String city;
    private boolean isPushEmail;
    private boolean isContacted;
    private boolean hasDriven;
    private Date testDriveTime;

    public TestDriveInfo(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name="first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Basic
    @Column(name="last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "call_name")
    public String getCallName() {
        return callName;
    }

    public void setCallName(String callName) {
        this.callName = callName;
    }
    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Basic
    @Column(name = "tel", nullable = false)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Basic
    @Column(name = "isPushEmail")
    public int getIsPushEmail() {
        return isPushEmail ? 1 : 0;
    }

    public void setIsPushEmail(int isPushEmail) {
        if(isPushEmail == 0){
            this.isPushEmail = false;
        }else this.isPushEmail = true;
    }
    @Basic
    @Column(name = "isContacted")
    public int getIsContacted() {
        return isContacted ? 1 : 0;
    }

    public void setIsContacted(int isContacted) {
        if(isContacted == 0){
            this.isContacted = false;
        }else this.isContacted = true;
    }
    @Basic
    @Column(name = "hasDriven")
    public int getHasDriven() {
        return hasDriven ? 1 : 0;
    }

    public void setHasDriven(int hasDriven) {
        if(hasDriven == 0){
            this.hasDriven = false;
        }else this.hasDriven = true;
    }
    @Basic
    @Column(name = "testDriveTime")
    public Date getTestDriveTime() {
        return testDriveTime;
    }

    public void setTestDriveTime(Date testDriveTime) {
        this.testDriveTime = testDriveTime;
    }

    @Override
    public String toString() {
        return "TestDriveInfo{" +
                "callName='" + callName + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", isPushEmail=" + isPushEmail +
                ", isContacted=" + isContacted +
                ", hasDriven=" + hasDriven +
                ", testDriveTime=" + testDriveTime +
                '}';
    }
}
