package com.practice;

import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
    - Stream memiliki sebuah operator bernama collect(Collector), functions ini biasanya digunakan untuk meng-collect/mengambil
      data Stream dan diubah menjadi struktur data yang kita inginkan, biasanya kebanyakan developer menggunakan operator collect() untuk
      mengubah Stream menjadi Collection.
    - Operator collect() membutuhkan perameter Collector, namun biasanya kita jarang sekali membuat implementasi interface
      Collector, karena terlalu kompleks.
    - Untuk dokumentasi dari Interface Collector dapat mengunjungi halaman web 'https://docs.oracle.com/' pada bagian Collector.
    - Untungnya Java Stream sudah menyediakan sebuah class helper untuk membuat Collector, bernama Collectors.
    - Class Collectors merupakan implementasi dari interface Collector.

    - Class Collectors.
        - Collectors adalah class helper yang bisa digunakan untuk membuat Collector.
        - Ini mempermudah kita ketika ingin melakukan operasi collect() terhadap sebuah Stream.
        - Ada banyak sekali static method yang terdapat pada class Collectors,
        - Untuk dokumentasi dari class Collectors dapat mengunjungi halaman web 'https://docs.oracle.com/' pada bagian Collectors.

    - Membuat Map dengan Collectors.
        - Selain mengkonversi dari data Stream ke data Collection, kita juga dapat membuat data Map dari data Stream menggunakan
          class Collectors.
        - Yang membedakan dengan data collections, kita harus tentukan function untuk membuat Key dan value, jika kita membuat Map,
          dikarenakan Map isinya adalah key & value sedangkan data Stream isinya cuma satu, jadi setiap data Stream harus
          ditentukan key-nya beserta value-nya.
        - Ada Banyak function yang bisa kita gunakan, seperti :
            - Collectors.toMap(...) -> method static ini digunakan untuk mengubah data Stream menjadi data Map.
            - Collectors.toConcurrentMap(...) -> method static ini digunakan digunakan untuk mengubah data Stream menjadi
              data Map yang dapat diakses secara pararel oleh beberapa proses (MultiThreading).
            - Collectors.toUnmodifiableMap(...) -> method static ini digunakan untuk mengubah data Stream ke data immutable Map
              artinya data Map yang tidak bisa diubah/dihapus.

 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
