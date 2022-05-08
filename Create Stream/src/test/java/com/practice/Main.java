package com.practice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

@DisplayName("Create Stream")
public class Main {

    @Test
    void testCreateEmptyOrSingleStreamOrMany(){

        // Digunakan untuk mmebuat Stream dengan 1 nilai ataupun lebih yang jumlahnya tidak pasti karena method static
        // 'Stream.of()', parameternya adalah variabel argument.
        Stream<String> singleStream = Stream.of("Suardi");
        Stream<String> streamValues = Stream.of("Suardi", "Daud", "Manda");
        Stream<Integer> streamInteger = Stream.of(1,2,3,4,5,6,7,8,9,10);
        streamValues.forEach(value -> System.out.println(value));

        // Digunakan untuk membuat empty Stream.
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(value -> System.out.println(value));

        // Digunakan untuk membuat Stream tak bernilai (null) ataupun memiliki nilai, Kalau jika nilai Stream-nya null maka
        // akan dikonversi menjadi empty Stream dengan method 'empty()'. method ini digunakan untuk membuat nilai stream,
        // sekaligus melakukan pengecekan terhadap data Stream apakah null atau memiliki data.
        Stream<String> emptyOrNotStream = Stream.ofNullable(null);
        emptyOrNotStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromArray(){
        // Membuat Stream dari data Array.
        Stream<String> streamArray = Arrays.stream(new String[]{"Suardi", "Daud", "Manda"});

        // mengiterasi satu per satu data di dalam stream menggunakan method forEach();
        streamArray.forEach(data -> {
            System.out.println(data);
        });
    }

    @Test
    void testCreateStreamFromCollection(){

        // Membuat Stream dari data Collection.
        Stream<String> stringStream = List.of("Java", "Kotlin", "Dart").stream();
        stringStream.forEach(System.out::println);

        // stringStream.forEach(System.out::println); // Akan error pada saat di running karena Stream hanya dapat dieksekusi/
        // dijalankan sekali. sehingga ketika ingin mengulang sebuah stream maka harus membuat stream baru.
        Stream<String> stringStream2 = List.of("Java", "Kotlin", "Dart").stream();
        stringStream2.forEach(System.out::println);


    }

    @Test
    void testCreateInfiniteStream(){

//        Stream<String> stream1 = Stream.generate(() -> "Suardi");
//        stream1.forEach(System.out::println);
//        membuat infinite stream dengan method Stream.generate() dimana melakukan iterasi secara terus menerus
//        dengan value yang sama dari awal hingga akhir.

//        Stream<Integer> stream2 = Stream.iterate(1, value -> value + 1);
//        stream2.forEach(System.out::println);
//        membuat infinite stream dengan method Stream.iterate() dimana melakukan iterasi secara terus menerus
//        dimana return value dari iterasi pertama dikirim sebagai parameter di iterasi selanjutnya dan dikalkulasi
//        lagi untuk iterasi selanjutnya, begitu terus menerus.

    }
}
