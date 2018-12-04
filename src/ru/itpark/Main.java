package ru.itpark;

import ru.itpark.comparator.PriceComparator;
import ru.itpark.domain.House;
import ru.itpark.repository.Repository;
import ru.itpark.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service(
                new Repository()
        );

        service.add(new House(1,15_000, "Казань, Вахитовский район ул.", "4/9", 40, "..."));
        service.add(new House(2,14_000, "Казань, Вахитовский район ул.", "5/9", 45, "..."));
        service.add(new House(3,12_500, "Казань, Кировкий район ул.", "4/5", 33, "..."));
        service.add(new House(4,22_500, "Казань, Приволжскийй район ул.", "9/12", 50, "..."));

        System.out.println(service.getSorted(new PriceComparator()));
        System.out.println(service.searchHouseByPrice(service.getSorted(new PriceComparator())));
        System.out.println(service.searchHouseByDistrict(service.getSorted(new PriceComparator())));
    }
}
