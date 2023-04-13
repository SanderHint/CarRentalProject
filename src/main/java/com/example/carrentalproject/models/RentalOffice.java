package com.example.carrentalproject.models;

public class RentalOffice {

    private String OfficeName;
    private String internetDomain;
    private String contactAddress;
    private String owner;
    private String logoType;

    public RentalOffice(String officeName, String internetDomain, String contactAddress, String owner, String logoType) {
        OfficeName = officeName;
        this.internetDomain = internetDomain;
        this.contactAddress = contactAddress;
        this.owner = owner;
        this.logoType = logoType;
    }

    public String getOfficeName() {
        return OfficeName;
    }

    public void setOfficeName(String officeName) {
        OfficeName = officeName;
    }

    public String getInternetDomain() {
        return internetDomain;
    }

    public void setInternetDomain(String internetDomain) {
        this.internetDomain = internetDomain;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLogoType() {
        return logoType;
    }

    public void setLogoType(String logoType) {
        this.logoType = logoType;
    }
}
