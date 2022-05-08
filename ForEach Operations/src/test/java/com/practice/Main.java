package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {

    @Test
    void testForEachOperationsNonPeek(){
        List<String> products = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia");

        // ForEach Operations tanpa menggunakan method 'peek(T -> void)'
        products.stream().map(product -> {
            System.out.println("Lowwercase Name : " + product);
            String upperCase = product.toUpperCase();
            System.out.println("Uppercase Name : " + upperCase);
            return "Final Name : "+upperCase+"\n";
        }).forEach(System.out::println);
    }

    @Test
    void testForEachOperationsWithPeek(){
        List<String> products = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia");

        // ForEach Operations 'peek(T -> void)' dan 'forEach(T -> void)'.
        products.stream()
                .peek(name -> System.out.println("Lowwercase Name : " + name))
                .map(String::toUpperCase)
                .peek(upper -> System.out.println("Upper Name : " + upper))
                .forEach(value -> System.out.println("Final Name : "+value+"\n"));

    }
}
