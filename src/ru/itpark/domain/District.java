package ru.itpark.domain;

public class District {
    private String district1;
    private String district2;

    public District(String district1, String district2) {
        this.district1 = district1;
        this.district2 = district2;
    }

    public String getDistrict1() {
        return district1;
    }

    public void setDistrict1(String district1) {
        this.district1 = district1;
    }

    public String getDistrict2() {
        return district2;
    }

    public void setDistrict2(String district2) {
        this.district2 = district2;
    }

    @Override
    public String toString() {
        return "District{" +
                "district1='" + district1 + '\'' +
                ", district2='" + district2 + '\'' +
                '}';
    }
}
