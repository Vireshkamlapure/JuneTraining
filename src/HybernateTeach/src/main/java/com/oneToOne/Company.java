package com.oneToOne;

import javax.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int companyId;
    private String companyName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gstId")
    private GSTRegistration gstInfo;

    public Company(){

    }

    public Company(int companyId, String companyName, GSTRegistration gstInfo) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.gstInfo = gstInfo;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public GSTRegistration getGstInfo() {
        return gstInfo;
    }

    public void setGstInfo(GSTRegistration gstInfo) {
        this.gstInfo = gstInfo;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
