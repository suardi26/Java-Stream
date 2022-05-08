package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    @Test
    void testMapStream(){
        List<String> products = List.of("Dettol","Lux","Biore");
        Stream<String> streamProducts = products.stream();

        // 'map()' method ini digunakan untuk merubah data didalam stream menjadi data baru.
        Stream<String> streamUpper = streamProducts.map(String::toUpperCase);
        streamUpper.forEach(System.out::println);
        products.forEach(System.out::println);

    }
}
