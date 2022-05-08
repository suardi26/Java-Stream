package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    @Test
    void testStreamPipeline(){
        List<String> list = List.of("Suardi", "Daud", "Manda");

        // Mengelolah Stream dengan cara manual.
        Stream<String> stream = list.stream();
        Stream<String> streamUpper = stream.map(upper -> upper.toUpperCase());
        Stream<String> streamName = streamUpper.map(name -> "Name : "+name);
        streamName.forEach(value -> System.out.println(value));

        // Mengelolah Stream menggunakan Stream Pipeline.
        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Name : " + upper)
                .forEach(System.out::println);

    }
}
