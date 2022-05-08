package com.practice;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Main {

    @Test
    void testAggregateOperations() {
        List<String> products = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia");

        // Sumber data dari List.
        products.stream().forEach(System.out::println);
        System.out.println("---------");


        // Aggregate Operations max(Comparator)
        // Dimana menggunakan comparator bawaan dari java yaitu 'Comparator.naturalOrder()' yang berfungsi untuk mengurutkan
        // data Stream secara ASC.
        // dan method 'max(Comparator)' akan mencari nilai maksimumnya, dimana data diatas ketika selesai diurutkan secara ASC,
        // maka data 'Lux' lah yang terakhir/max.
        Optional<String> max = products.stream().max(Comparator.naturalOrder());
        max.ifPresent(System.out::println);
        System.out.println("---------");

        // Aggregate Operations min(Comparator)
        // Dimana menggunakan comparator bawaan dari java yaitu 'Comparator.naturalOrder()' yang berfungsi untuk mengurutkan
        // data Stream secara ASC.
        // dan method 'min(Comparator)' akan mencari nilai Minimunnya, dimana data diatas ketika selesai diurutkan secara ASC,
        // maka data 'Biore' lah yang pertama/min.
        Optional<String> min = products.stream().min(Comparator.naturalOrder());
        min.ifPresent(System.out::println);
        System.out.println("---------");

        // Aggregate Operations count().
        long count = products.stream().count();
        System.out.println(count);
        System.out.println("---------");

        // Manual Aggregate (Sum) menggunakan method 'reduce(0, BinaryOperator)'
        // value pertama = 0;
        // iterasi 1 => value = 0, item = 1 (value + item) = 1
        // iterasi 2 => value = 1, item = 2 (value + item) = 3
        // iterasi 3 => value = 3, item = 3 (value + item) = 6
        // iterasi 4 => value = 6, item = 4 (value + item) = 10
        // iterasi 5 => value = 10, item = 5 (value + item) = 15
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (result, item) -> result + item);
        System.out.println(sum);
        System.out.println("---------");

        // Contoh Lain : Manual Aggregate (Faktorial) menggunakan method 'reduce(0, BinaryOperator)'
        // value pertama = 1;
        // iterasi 1 => value = 1, item = 1 (value * item) = 1
        // iterasi 2 => value = 1, item = 2 (value * item) = 2
        // iterasi 3 => value = 2, item = 3 (value * item) = 6
        // iterasi 4 => value = 6, item = 4 (value * item) = 24
        // iterasi 5 => value = 24, item = 5 (value * item) = 15
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        int faktorial = numbers1.stream().reduce(1, (result, item) -> result * item);
        System.out.println(faktorial);
        System.out.println("---------");
    }
}
