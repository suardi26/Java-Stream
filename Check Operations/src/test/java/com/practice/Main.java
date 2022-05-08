package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    @Test
    void testCheckOperations(){
        List<String> products = List.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia");

        // Check Operations 'anyMatch()'.
        boolean anyMatch = products.stream().anyMatch(value -> value.length() < 5);
        System.out.println(anyMatch + "\n- - - - - - -");

        // Check Operations 'allMatch()'.
        boolean allMatch = products.stream().allMatch(value -> !value.isBlank());
        System.out.println(anyMatch + "\n- - - - - - -");

        // Check Operations 'noneMatch'.
        boolean noneMatch = products.stream().noneMatch(value -> value.equals("NONE"));
        System.out.println(anyMatch + "\n- - - - - - -");
    }
}
