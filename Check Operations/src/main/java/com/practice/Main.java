package com.practice;

/**
    - Check Operations adalah operasi yang digunakan untuk melakukan pengecekan data di dalam Stream.
    - Ada banyak sekali operasi yang bisa digunakan untuk melakukan pengecekan, dan hasil operasi check adalah boolean.
    - Dikarenakan return value dari Check Operations itu adalah boolean maka operasi ini termasuk terminal operator.
    - Ada beberapa method yang digunakan untuk Check Operations :
         - anyMatch(T -> Kondisi 'Boolean' ) digunakan untuk pengecekan Apakah ada salah satu data yang match dengan kondisi
           (Boolean). dan tiap datanya (T) dimasukan satu per satu menggunakan lambda dengan interface Predicate.
         - allMatch(T -> Kondisi 'Boolean') digunakan untuk pengecekan Apakah semua data match dengan kondisi dengan kondisi
           (Boolean). dan tiap datanya (T) dimasukan satu per satu menggunakan lambda dengan interface Predicate.
         - noneMatch(T -> Kondisi 'Boolean') digunakan untuk pengecekan Apakah semua data tidak match dengan kondisi (Boolean).
           dan tiap datanya (T) dimasukan satu per satu menggunakan lambda dengan interface Predicate.

 */
public class Main {
}
