package com.practice;

/**
    - Untuk mengiterasi data satu persatu, dapat menggunakan operasi/method forEach, dimana method ini adalah terminal
      operation.
    - Selain forEach, ada juga method untuk melakukan forEach, tanpa harus melakukan terminal operation artinya tanpa
      menjalankan/mengeksekusi stream.
    - Ada beberapa method yang digunakan untuk Check Operations :
        - forEach(T -> void) digunakan untuk melakukan iterasi satu per satu data di Stream. dan method ini adalah terminal
          operation. Serta tiap datanya (T) dimasukan satu per satu menggunakan lambda dengan interface Consumer.
        - peek(T -> void) digunakan untuk melakukan iterasi satu per satu data di Stream, namun mengembalikan Stream lagi, dan
          method ini bukanlah terminal operation Melainkan intermediate operation. Serta tiap datanya (T) dimasukan
          satu per satu menggunakan lambda dengan interface Consumer.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
