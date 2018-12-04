package ru.itpark.service;

import ru.itpark.domain.House;
import ru.itpark.repository.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Service {
    private Repository repository;

    int minPrice = 10_000;
    int maxPrice = 20_000;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void add(House house) {
                repository.add(house);
    }

    public List<House> getAll() {
        return repository.getAll();
    }



    public List<House> getSorted(Comparator<House> comparator) {
        List<House> result = repository.getAll();
        result.sort(comparator);
        return result;
    }


    public List<House> searchHouseByPrice(List<House> houses) {
        List<House> result = new ArrayList<>();
        for (House house : houses) {
            if (house.getPrice()<=maxPrice && house.getPrice()>=minPrice ) {
                result.add(house);
            }
        }
        return result;
    }

    public List<House> searchHouseByDistrict(List<House> houseList) {

        List districts = new ArrayList();
                districts.add()
        List<House> results = new ArrayList<>();
        for (House house : houseList) {
            if (house.getAdress() .contains(districts)){
                results.add(house);
            }
        }
             return results;
    }
    }



}

