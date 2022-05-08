package com.practice;

/**
    - Pada saat membuat Stream biasanya kita akan melakukan banyak operasi terhadap Stream tersebut, artinya kita banyak
      menggunakan Stream operations terhadap sebuah stream, dan biasanya kita membuat Stream pipeline.
    - Stream pipeline adalah kumpulan beberapa operasi terhadap sebuah stream.
    - Stream pipeline terdiri dari sumber stream (Array, Collections dan lain-lain), lalu diikuti dengan kosong atau lebih
      stream operations, bisa 0 atau 1 ataupun lebih dari 1 stream operations dan diakhiri dengan operasi akhir, misalnya
      menggunakan forEach. Jadi satu kesatuan ini disebut Stream Pipeline.
    - Pada saat menggunakan Stream, hampir kebanyakan kita pasti akan membuat sebuah Stream Pipeline. Stream pipeline dibuat
      chaining menjadi satu kesatuan artinya  sumber data Streamnya, operator-operator stream serta operasi akhir disambung
      satu sama lain menggunakan tanda (.).

 */
public class Main
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
    }
}
