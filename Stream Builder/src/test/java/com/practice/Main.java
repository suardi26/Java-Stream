package com.practice;


import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class Main {

    @Test
    void testCreateStreamBuilderManual(){

        Stream.Builder<String> builder = Stream.builder();

        // method ini digunakan untuk menambahkan data dan tidak memiliki return value (void).
        builder.accept("Suardi");

        // Method ini digunakan untuk menambahkan data dan memiliki return value builder itu sendiri serta
        // dapat di-chaining artinya dapat disambung dengan lebih dari satu method 'add()' menggunakan '.' .
        builder.add("Daud").add("Manda");

        // Method 'build()' digunakan Untuk mengkonversi dari Stream Builder ke Stream.
        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);

    }

    @Test
    void testCreateStreamBuilderSimplify(){
        Stream<Object> dataStream =  Stream.builder()
                .add("Suardi")
                .add("Daud")
                .add("Manda")
                .build();
        dataStream.forEach(System.out::println);
    }
}
