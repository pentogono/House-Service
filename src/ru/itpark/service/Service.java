package ru.itpark.service;

import ru.itpark.domain.House;
import ru.itpark.repository.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Service {
    private Repository repository;

    //int minPrice = 10_000;
    //int maxPrice = 20_000;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void add(House house) {
                repository.add(house);
    }

    public List<House> getAll() {
        return repository.getAll();
    }

    //public List
   // priceSearchHouse(List<House> flats) {

      //  List
         //       result = new ArrayList<>();

      //  for (House flat : flats) {
       //     if (flat.getPrice()>=minPrice&&flat.getPrice()<=maxPrice) {
       //         result.add(flat);
       //     }
      //  }
      //  return result;
    //}


    public List<House> getSorted(Comparator<House> comparator) {
        List<House> result = repository.getAll();
        result.sort(comparator);
        return result;

}}
