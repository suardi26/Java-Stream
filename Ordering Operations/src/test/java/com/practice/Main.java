package com.practice;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class Main {

    @Test
    void testOrderingOperations() {

        List<String> products = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia");

        // Sumber data dari List.
        products.stream().forEach(System.out::println);
        System.out.println("---------");

        // Ordering Operations Sorted().
        // Maka mengurutkan berdasarkan comparable data Stream, misalnya data Streamnya adalah String, sehingga mengakibatkan
        // data terurut ASC.
        products.stream().sorted().forEach(System.out::println);
        System.out.println("---------");

        // Ordering Operations Sorted(Comparator).
        // Maka mengurutkan berdasarkan comparator yang dibuat manual atau comparator bawaan dari java,
        // misalnya pada kasus ini membalikan urutan dari comparable data Stream yaitu String, jadi mengakibatkan data
        // terurut DESC.
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        products.stream().sorted(reverseComparator).forEach(System.out::println);
        System.out.println("---------");

    }

}
