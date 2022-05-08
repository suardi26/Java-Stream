package com.practice;

/**
    - Java Stream juga mendukung operasi untuk melakukan pengurutan data Stream-nya.
    - Secara default, data akan diurutkan mengikuti Comparable yang terdapat di data yang ada di Stream. misalnya data String,
      maka akan mengikuti comparable String, dll.
    - Jika ingin mengurutkan secara manual, kita dapat menggunakan Comparator sendiri.

    - Ada beberapa method yang digunakan untuk Ordering Operations :
        - sorted() digunakan untuk mengurutkan data Stream berdasarkan comparable data Stream.
        - sorted(Comparator) digunakan untuk mengurutkan berdasarkan comparator yang dibuat manual atau comparator bawaan dari
          java.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
