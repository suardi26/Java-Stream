package com.practice;

/**
    - Implementasi Stream di Java adalah Class java.util.stream.Stream<T>, dimana Stream<T> adalah generic class artinya
      kita hanya dapat memasukan data Object ke dalam sebuah Stream.
    - Namun bagaimana jika kita ingin melakukan stream terhadap data primitive seperti int, long atau double harus terlebih
      dahulu mengkonversi tipe data primitive misalnya int, long, dll ke tipe data Objectnya Misalnya Integer, Long, dll.
    - Karena untuk Generic hanya bisa menampung tipe data Object, maka di Java Stream, dibuat implementasi Stream khusus  untuk
      tipe data primitive.
    - Ada beberapa Primitive Stream Interface yang digunakan untuk tipe data Primitive :
        - java.util.stream.IntStream => Interface ini digunakan untuk membuat Stream dengan menampung data primitive int.
        - java.util.stream.LongStream => Interface ini digunakan untuk membuat Stream dengan menampung data primitive long.
        - java.util.stream.DoubleStream => Interface ini digunakan untuk membuat Stream dengan menampung data primitive double.
    - Hampir semua Stream operator yang ada pada generic class Stream<T>, ada juga di primitive stream class.
    - Bahkan ada beberapa operator yang lebih sederhana, seperti untuk 'aggregate', kita tidak perlu menggunakan comparator lagi,
      bahkan ada operator tambahan seperti average() untuk menghitung rata-rate di primitive stream dan method ini memiliki
      return value yaitu 'OptionalDouble' dikarenakan data stream bisa ada dan bisa juga tidak, hal ini untuk menangani
      error NullPointerException.
    - Dan Untuk melakukan konversi data primitive stream ke generic class Stream<T> dapat menggunakan method
        'mapToObj(number -> String.valueOf(number));'
    - Cara Pembuatan primitive stream pun hampir mirip dengan generic class Stream<T>, kita dapat menggunakan static method
      di classnya, misalnya IntStream.off(...), IntStream.builder(), dll.

 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

    }
}
