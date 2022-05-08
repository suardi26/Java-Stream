package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    // Contoh method 'map()'.
    // Menerima data Stream yang bertipe data String diubah menjadi data Stream bertipe data Integer dengan method map().
    @Test
    void testMapOperation(){
        List.of("Suardi","Daud","Manda").stream()

                // data String "name" ke data String "name.toUpperCase()".
                .map(name -> name.toUpperCase())

                // data String "upperName" ke data Integer "upperName.length()".
                .map(upperName -> upperName.length())
                .forEach(System.out::println);
    }

    // Contoh method 'flatMap()'.
    // Ketika method map merubah suatu data ke data yang lain maka method flatMap mengubah suatu data ke Stream yang lain.
    // dan ketika pada flatMap, mengembalikan beberapa data Stream maka nantinya akan di merge datanya menjadi satu oleh
    // java Stream.
    @Test
    void testFlatMapOperation(){
        List.of("Suardi", "Daud", "Manda").stream()
                .map(name -> name.toUpperCase())

                // flatMap harus mengembalikan stream lagi entah itu stream kosong
                // atau bahkan lebih dari 1 data stream.
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value, value, value))
                .forEach(x -> System.out.println(x));
    }
}
