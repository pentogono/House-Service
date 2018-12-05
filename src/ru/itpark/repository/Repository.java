package ru.itpark.repository;

import ru.itpark.domain.House;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<House> apartments = new ArrayList<>();
    public  void add(House apartment){apartments.add(apartment);}
    public List<House> getAll() {return apartments;}



}
