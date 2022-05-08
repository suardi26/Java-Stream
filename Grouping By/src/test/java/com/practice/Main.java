package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    @Test
    void testCollectorGroupingBy(){

        // Grouping By. contoh 1
            List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

            Map<String, List<Integer>> dataMapNumbers = numbers.stream()
                    .collect(Collectors.groupingBy(integer -> integer % 2 == 0 ? "Genap" : "Ganjil"));
            System.out.print(dataMapNumbers);

        // Grouping By. contoh 2
            List<String> products = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia");
            Map<String, List<String>> dataMapString = products.stream()
                    .collect(Collectors.groupingBy(product -> product.length() > 4 ? "Panjang" : "Pendek"));
            System.out.println("\n"+dataMapString);



        // Partitioning By. contoh 1
        List<Integer> numbersPar = List.of(1,2,3,4,5,6,7,8,9,10);
        Map<Boolean, List<Integer>> dataMapNumbersPar = numbersPar.stream()
                .collect(Collectors.partitioningBy(integer -> integer % 2 == 0 ));
        System.out.print(dataMapNumbersPar);

        // Partitioning By. contoh 2
        List<String> productsPar = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia");
        Map<Boolean, List<String>> dataMapStringPar = productsPar.stream()
                .collect(Collectors.partitioningBy(new Predicate<String>() {
                    @Override
                    public boolean test(String product) {
                        return product.length() > 4;
                    }
                }));
        System.out.println("\n"+dataMapStringPar);
    }
}
