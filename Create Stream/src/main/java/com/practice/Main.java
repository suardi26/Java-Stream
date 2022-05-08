package com.practice;

/**
    - Ada Banyak cara untuk membuat Stream (Aliran Data) di Java.
    - Membuat Stream bisa langsung dari Array, atau dari Collection ataupun membuat Stream secara manual.

        - Membuat Stream dengan 1 nilai.
          'Stream<String> singleStream = Stream.of("Suardi");'
          Digunakan untuk mmebuat Stream dengan 1 nilai, ataupun memiliki beberapa nilai dikarenakan method 'Stream.of'
          parameternya adalah variabel argument artinya parameternya bisa lebih dari satu dan jumlahnya tidak pasti.
          'Stream<String> StreamValues = Stream.of("Suardi","Daud","Manda");'

        - Membuat empty Stream.
          Stream<String> emptyStream = Stream.empty();
          Digunakan untuk membuat empty Stream.

        - Membuat Stream tanpa nilai atau dengan nilai.
          Stream<String> emptyOrNotStream = Stream.ofNullable(null);
          Digunakan untuk membuat Stream tak bernilai (null) ataupun memiliki nilai, Kalau jika nilai Stream-nya null maka
          akan dikonversi menjadi empty Stream dengan method 'empty()'. method ini digunakan untuk membuat nilai stream,
          sekaligus melakukan pengecekan terhadap data Stream apakah null atau memiliki data.

        - Membuat Stream dari data Array.
          'Stream<String> streamArray = Arrays.stream(new String[]{"Suardi","Daud", "Manda"});'
          Digunakan untuk membuat Stream dari data Array dengan menggunakan method static dari class 'Arrays.stream()' untuk
          mengkonfersi data array ke stream.

        - Membuat Stream dari Collection.
          'Stream<String> stringStream = List.of("Java", "Kotlin", "Dart").stream();'
          Digunakan untuk membuat Stream dari data Collections ataupun class-class yang implementasi interface Collection dengan
          menggunakan method dari interface 'Collection.stream()' untuk mengkonversi data collection ke stream.

        - Membuat infinite Stream.
          Infite Stream adalah Stream yang tidak ada ujungnya. ada 2 method yang biasanya digunakan untuk membuat infinite Stream:

            - Stream.generate()
              Stream<String> stream1 = Stream.generate(() -> "Suardi");
              method ini memiliki parameter lambda/anonymous class dari interface Supplier untuk melakukan iterasi secara terus
              menerus dengan return value yang ditentukan.

            - Stream.iterate()
              Stream<Integer> stream2 = Stream.iterate(1, value -> value + 1);
              method ini memiliki paramter lambda/anonymous class dari interface UnaryOperator untuk melakukan iterasi secara
              terus menerus dimana return value akan mengirimkan ke iterasi selanjutnya sebagai parameter dan dapat dikalkulasi
              untuk return valuenya dan dikirimkan lagi pada parameter selanjutnya, begitu terus-menerus.


    - Menjalankan Stream.
        - Secara default, Stream itu bersifat Cold, artinya data di Stream tidak akan mengalir sampai ktia memintanya untuk
          dieksekusi/dialirkan.
        - Ada banyak cara untuk meminta Stream mulai mengalirkan datanya, hal ini dapat secara detailnya dapat dilihat pada
          project Stream Operations.
        - Namun pada saat ini, salah satu method yang bisa kita gunakan agar aliran data di Stream mengalir adalah menggunakan
          method forEach.
        - Method forEach digunakan untuk mengiterasi satu per satu data di dalam stream.
        - Stream hanya bisa dieksekusi sekali, mirip seperti aliran Sungai, setelah mengalir dari hulu ke hilir air tidak dapat
          kembali lagi ke hulu, begitu juga dengan Stream (aliran data) ketika data selesai di eksekusi maka tidak bisa
          diulang lagi dari awal ke akhir, maka pada saat ingin megulang stream maka kita harus membuat stream baru.

 */
public class Main {
    public static void main(String args){

    }
}
