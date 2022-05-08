package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    @Test
    void testSequential(){
        List<Integer> numbersPar = List.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> parallelStream = numbersPar.stream();

        // Untuk Melakukan test urutan data running Sequential(berurut).
        // parallelStream.forEach(System.out::println);

        parallelStream.forEach(number -> {
            System.out.println(Thread.currentThread().getName() + " : " +number);
        });

    }

    @Test
    void testParallelStream(){
        List<Integer> numbersPar = List.of(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> parallelStream = numbersPar.stream().parallel();

        // Untuk Melakukan test urutan data running ParallelStream(acak-acakan).
        // parallelStream.forEach(System.out::println);

        parallelStream.forEach(number -> {
            System.out.println(Thread.currentThread().getName() + " : " +number);
        });
    }
}
