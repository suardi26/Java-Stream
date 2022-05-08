package com.practice;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.function.IntFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    @Test
    void testCreatePrimitiveStream(){

        // Memasukan data Primitive pada Primitive Stream int menggunakan method static 'of()' dan tinggal memasukan valuenya.
        IntStream intStream = IntStream.of(1,2,3,4,5);
        intStream.forEach(System.out::println);
        System.out.println("_ _ _ _ _ _ ");

        // Memasukan data Primitive pada Primmitive Stream int dengan method static 'range()' dan method ini memasukan data dari
        // parameter pertama ke parameter kedua. misalnya : 'IntStream.range(10,16);' maka datanya : 10,11,12,13,14,15.
        IntStream range = IntStream.range(10,16);
        range.forEach(System.out::println);
        System.out.println("_ _ _ _ _ _ ");

        // Menggunakan builder() dan menambahkan data Primitive pada Primitive Stream int.
        IntStream intBuilder = IntStream.builder().add(5).add(15).add(20).build();
        intBuilder.forEach(System.out::println);
        System.out.println("_ _ _ _ _ _ ");

        // Memasukan data Primitive pada Primmitive Stream Long menggunakan method static 'of()' dan tinggal memasukan valuenya.
        LongStream longStream = LongStream.of(1,2,3,4,5);

        // Memasukan data Primitive pada Primmitive Stream Double menggunakan method static 'of()' dan tinggal memasukan
        // valuenya.
        DoubleStream doubleStream = DoubleStream.of(1,2,3,4,5);

        // Menggunakan method average() yang tidak terdapat pada generic class Stream<T>, method ini digunakan untuk menghitung
        // rata-rate di primitive stream.
        IntStream intStreamAverage = IntStream.range(10,16);
        OptionalDouble optionalDouble = intStreamAverage.average();
        optionalDouble.ifPresent(System.out::println);
        System.out.println("_ _ _ _ _ _ ");

        // konversi data primitive stream ke generic class Stream<T> (tipa data object) dapat menggunakan method
        // 'mapToObj(number -> String.valueOf(number));'
        Stream<String> stream = IntStream.range(1,6).mapToObj(value -> "Number : "+value);
        stream.forEach(System.out::println);
    }
}
