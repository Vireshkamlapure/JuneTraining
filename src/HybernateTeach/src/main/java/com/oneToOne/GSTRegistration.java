package com.oneToOne;

import javax.persistence.*;

@Entity
public class GSTRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gstId;

    @Column(unique = true)
    private String gstRegNo;

    private String gstType;

    @OneToOne(mappedBy = "gstInfo")
    private Company company;

    public GSTRegistration(){

    }

    public GSTRegistration(int gstId, String gstRegNo, String gstType, Company company) {
        this.gstId = gstId;
        this.gstRegNo = gstRegNo;
        this.gstType = gstType;
        this.company = company;
    }

    public int getGstId() {
        return gstId;
    }

    public void setGstId(int gstId) {
        this.gstId = gstId;
    }

    public String getGstRegNo() {
        return gstRegNo;
    }

    public void setGstRegNo(String gstRegNo) {
        this.gstRegNo = gstRegNo;
    }

    public String getGstType() {
        return gstType;
    }

    public void setGstType(String gstType) {
        this.gstType = gstType;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "GSTRegistration{" +
                "gstId=" + gstId +
                ", gstRegNo='" + gstRegNo + '\'' +
                ", gstType='" + gstType + '\'' +
                '}';
    }
}
