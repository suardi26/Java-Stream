package com.practice;


import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class Main
{
    @Test
    void testRetrievingOperation(){
        List<String> products = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia", "Giv");

        // Retrieving Operations 'limit(n)'
        products.stream()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("--------");

        // Retrieving Operations 'skip(n)'
        products.stream()
                .skip(4)
                .forEach(System.out::println);
        System.out.println("--------");

        // Retrieving Operations 'takeWhile(T -> Boolean)'
        products.stream()
                .takeWhile(product -> product.length() != 4)
                .forEach(System.out::println);
        System.out.println("--------");

        // Retrieving Operations 'dropWhile(T -> Boolean)'
        products.stream()
                .dropWhile(product -> product.length() != 3)
                .forEach(System.out::println);
    }

    @Test
    void testRetrievingSingleElementOperation(){
        List<String> products = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia", "Giv");

        // Retrieving Single Element 'findAny()'
        Optional<String> productRandom = products.stream().findAny();
        productRandom.ifPresent(System.out::println);

        // Retrieving Single Element 'findFirst()'
        Optional<String> firstProduct = products.stream().findFirst();
        firstProduct.ifPresent(System.out::println);
    }



}
