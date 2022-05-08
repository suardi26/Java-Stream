package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    @Test
    void testIntermediateOperations() {
        Stream<String> names = List.of("Suardi", "Daud", "Manda").stream();

        // Melakukan test Method 'map()' adalah bagian dari Intermediate Operations, karena 'map()' mengembalikan Stream lagi
        // dan 'map()' adalah lazy.
        // Ketika di running maka program tidak mengeluarkan output karena 'map()' adalah bagian dari Intermediate
        // Operations dimana tidak men-trigger sebuah stream untuk mengalir atau dieksekusi.
        Stream<String> upperCase = names.map(name -> {
            System.out.println("Merubah " + name + " to UPPERCASE");
            return name.toUpperCase();
        });
    }

    @Test
    void testTerminalOperation() {
        Stream<String> names = List.of("Suardi", "Daud", "Manda").stream();

        // Melakukan test Method 'forEach()' adalah bagian dari Terminal Operations karena 'forEach()' tidak mengembalikan
        // Stream lagi dan 'forEach()' dapat men-trigger sebuah stream untuk mengalir/berjalan.
        // Ketika di running maka program mengeluarkan output karena 'forEach()' adalah bagian dari Terminal Operations
        // dimana dapat men-trigger sebuah stream untuk mengalir atau dieksekusi.
           names.map(name -> {
                    System.out.println("Merubah " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .forEach(System.out::println);
    }
}

