package com.practice;
/**
    - Ada Banyak Stream Operations di Java Stream, misalnya Transformation Operations.
    - Transformation Operations adalah operasi yang digunakan untuk mengubah bentuk data dari Stream,
      misalnya data dari Int ke String.
    - Ada banyak function yang dapat digunakan untuk mengubah bentuk Stream menjadi sebuah Stream baru, contohnya map dan flatMap.

        - Method map(T -> U) digunakan untuk mengubah Data Stream T menjadi Data Stream U.
        - Method flatMap(T -> Stream<U> Digunakan untuk mengubah Stream T menjadi U, misalnya T adalah tiap data di dalam stream
          dan juga dapat mengembalikan data Stream yang lain misalnya U (Return Value) dan nantinya karena tiap data di jadikan
          Stream lain maka akan di merge menjadi satu. dan pada flatMap harus mengembalikan stream lagi entah itu stream kosong
          atau 1, atau bahkan lebih dari 1 data stream.
*/
public class Main {

}
