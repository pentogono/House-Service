package ru.itpark.comparator;

import ru.itpark.domain.House;

import java.util.Comparator;

public class PriceComparator implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        int minPrice = 10_000;
        int maxPrice = 20_000;
        if (o2.getPrice()>=maxPrice&&o1.getPrice()<=minPrice) {
            return 0;
        }
        return o1.getPrice()-o2.getPrice();
    }
}
