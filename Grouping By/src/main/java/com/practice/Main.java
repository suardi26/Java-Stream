package com.practice;

/**
    - Collectors juga bisa digunakan untuk melakukan grouping by sebuah Stream.
    - Hasil dari Grouping by adalah 'Map<Group,List<Value>>', dimana 'Group' adalah group key-nya dan 'List<Value>' adalah List
      of value yang kita group, misalnya kita mempunyai data Stream product dan akan digroup berdasarkan kategorinya jadi
      'Map<Kategori Product, ListOfProduct yang ada di kategori tersebut>.
    - untuk melakukan grouping by dapat menggunakan method static 'groupingBy()' dari class Collector, dan untuk menentukan
      group key nya dapat menggunakan lambda dengan interface Function.
    - Grouping by bisa dilakukan untuk membagi data stream menjadi lebih dari 2 data list, bisa banyak data list.

    - Contoh : List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10)
      Dan ketika data dibagi menjadi dua data List yaitu data List ganjil & genap dengan menggunakan method 'groupingBy()' dengan
      parameter menggunakan lambda dengan interface Function maka hasilnya data List menjadi 2 bagian yaitu :
            '{Genap=[2, 4, 6, 8, 10], Ganjil=[1, 3, 5, 7, 9]}'

    - Partitioning By
        - Selain Grouping by, Collectors juga bisa digunakan untuk Partitioning by.
        - Hanya saja hasil dari Partitioning by hanyalah 2 buah group boolean(true, false).
        - Hal ini berarti Partitioning by hanya akan menghasilkan Map<Boolean, List<Value>>.
        - Partitioning by digunakan untuk membagi data straem menjadi 2 bagian.
        - untuk melakukan Partitioning by dapat menggunakan method static 'partitioningBy()' dari class Collector, dan untuk
          Membagi 2 data Stream dapat menggunakan lambda dengan interface Predicate.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
