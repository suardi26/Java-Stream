package com.practice;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main
{
    private Stream<String> getDataStream(){
        return Stream.of("Dettol", "Dettol", "Lux", "Biore", "Dove", "Daia");
    }

    @Test
    void testCollectorsCollections(){


        // menggunakan method 'collect(Collector)' dan menggunakan method static 'toSet()' sebagai parameter untuk mengubah
        // data Stream ke data Set.
        Set<String> dataSet = getDataStream().collect(Collectors.toSet());
        System.out.println(dataSet);

        // menggunakan method 'collect(Collector)' dan menggunakan method static 'toUnmodifiableSet()' sebagai parameter
        // untuk mengubah data Stream ke data immutable Set artinya data Set yang tidak bisa diubah/dihapus.
        Set<String> immutableSet = getDataStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        // menggunakan method 'collect(Collector)' dan menggunakan method static 'toList()' sebagai parameter untuk mengubah
        // data Stream ke data List.
        List<String> dataList = getDataStream().collect(Collectors.toList());
        System.out.println(dataList);

        // menggunakan method 'collect(Collector)' dan menggunakan method static 'toUnmodifiableList()' sebagai parameter
        // untuk mengubah data Stream ke data immutable List artinya data List yang tidak bisa diubah/dihapus.
        List<String> immutableList = getDataStream().collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList);

    }

    @Test
    void testCollectorsMap(){
        Map<String, String> dataMap = getDataStream().collect(Collectors.toMap(
                key -> key + new Random().nextInt(10),
                value -> value));
        System.out.println(dataMap);
    }
}
