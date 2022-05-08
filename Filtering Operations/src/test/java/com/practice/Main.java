package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Main {
    @Test
    void testFilteringOperation(){
        List<String> products = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia");

        // Filtering Operations filter(U -> Boolean)
        products.stream().filter(name -> name.length() < 5).forEach(System.out::println);
        System.out.println("--------");

        // Contoh lain Operations filter(U -> Boolean)
        List.of(1,2,3,4,5,6).stream().filter(value -> value % 2 == 0).forEach(System.out::println);
        System.out.println("--------");

        // Filtering Operations distinct()
        products.stream().distinct().forEach(System.out::println);
        System.out.println("--------");

        // Sumber data dari List tidak berubah.
        products.stream().forEach(System.out::println);
    }
}
