package com.practice;


/**
    - Java Stream diperkenalkan pertama kali di Java versi 8 atau 1.8.
    - Java Stream adalah implementasi di Java untuk aliran data.
    - Java Steram erat kaitannya dengan Java Collection dan lambda Expression
    - Semua fitur Java Stream terdapat di package java.util.stream
    - Untuk dokumentasi dari Java Stream dapat mengunjungi situs web 'https://docs.oracle.com' ataupun membuka source code
      yang ada pada 'java.util.stream'.

    - Stream adalah aliran data sedangkan Array atau Collections adalah kumpulan data.
    - Jadi Stream adalah aliran data yang memiliki sumber dan tujuan. dimana sumbernya bebas, dapat berupa collections ataupun
      array dan memiliki tujuan, prinsip stream mirip seperti aliran sungai.
    - Biasannya dalam Array atau Collections, kita selalu fokus terhadap data, sedangkan dalam Stream, kita akan berfokus terhadap
      operasi apa yang akan dilakukan terhadap aliran data tersebut.

    - Prinsip stream mirip seperti aliran sungai, dimana aliran data dapat ditambahkan operator, dimana operatornya bebas
      misalnya merubah data ataupun sorting data dll. dimana stream hanya mengalir satu kali seperti aliran sungai, berbeda pada
      collections misalnya melakukan iterasi dengan for each maka prosesnya dapat melakukan berkali-kali untuk mengambil data-data.
      jadi pada stream data mengalir dari atas ke bawah, jadi ketika datanya sudah berada dibawah maka tidak dapat kembali lagi
      ke atas.

    - Java Stream diimplementasikan oleh sebuah class bernama 'Stream' yang ada pada package 'java.util.stream'
      'java.util.stream.Stream<T>'
    - Java Stream tidak sekompleks Java Collections, namun walapun sederhana, fitur Java Stream sangat powerfull.
    - Class Stream merupakan Generic Class, sehingga dapat membuat aliran data dengan tipe yang diinginkan misalnya seperti :
      membuat tipe aliran data String, Integer, Double, dll.

    - Meskipun java Collections dan java Stream berbeda namun keduanya saling mendukung, jadi java Stram mendukung java collections,
      sehingga kita dapat menggunakan java stream pada java collections yang telah dibuat.
 */
public class Main {
}
