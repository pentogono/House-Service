package ru.itpark.domain;

public class House {
    private int id;
    private int price;
    private String adress;
    private String floor;
    private int apartmentArea;
    private String apartmentDescription;

    public House(int id, int price, String adress, String floor, int apartmentArea, String apartmentDescription) {
        this.id = id;
        this.price = price;
        this.adress = adress;
        this.floor = floor;
        this.apartmentArea = apartmentArea;
        this.apartmentDescription = apartmentDescription;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", price=" + price +
                ", adress='" + adress + '\'' +
                ", floor='" + floor + '\'' +
                ", apartmentArea=" + apartmentArea +
                ", apartmentDescription='" + apartmentDescription + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getApartmentArea() {
        return apartmentArea;
    }

    public void setApartmentArea(int apartmentArea) {
        this.apartmentArea = apartmentArea;
    }

    public String getApartmentDescription() {
        return apartmentDescription;
    }

    public void setApartmentDescription(String apartmentDescription) {
        this.apartmentDescription = apartmentDescription;
    }
}
