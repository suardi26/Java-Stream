package com.practice;

/**
    - Stream Secara default adalah lazy / cold artinya secara default Stream itu tidak mengalir atau tidak dieksekusi datanya
      sampai kita ingin mengeksekusi atau mengalirkan data di dalam stream.
    - Jadi Stream tidak akan mengalirkan data jika belum menggunakan terminal operation.
    - Terminal Operation adalah operasi yang digunakan untuk men-trigger sebuah stream sehingga datanya mengalir atau dieksekusi.
    - Selain itu, data hanya akan dialirkan seperlunya saja, tergantung terminal operation-nya.

    - Di dalam Stream Operations terdapat 2 jenis operations yaitu
        - Intermediate
          Intermadiate Operations merupakan lazy operation, dimana Stream tidak akan dieksekusi sampai memang dibutuhkan.

        - Terminal Operations
          Terminal Operations merupakan operasi yang men-trigger sebuah Stream berjalan.

    - Karena Intermediate Operations adalah lazy, maka secara garis besar semua Intermediate Operations akan mengembalikan
      Stream lagi.

 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
