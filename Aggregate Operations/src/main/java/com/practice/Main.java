package com.practice;

/**
    - Java Stream mendukung banyak operasi untuk melakukan proses aggregate.
    - Seperti menghitung jumlah data, menghitung data max dan menghitung data min.
    - Operator Aggregate tidak membuat Stram baru melainkan bagian dari terminal operator dimana akan mengeksekusi sebuah stream.
    - Ada beberapa method yang digunakan untuk Aggregate Operations :
         - max(Comparator) digunakan untuk mencari data max sesuai comparator.
         - min(Comparator) digunakan untuk mencari data min sesuai comparator.
         - count() menghitung total data.
    - Pada method min() dan max() memiliki return value Optional dikarenakan data Streamnya bisa saja empty, untuk itu memudahkan
      kita dalam menangani error NullPointerException, dan method count() memiliki return value long, dan pada saat data
      Streamnya kosong maka mengembalikan 0.
    - Pada method min() dan max() terdapat parameter Comparator, dikarenakan datanya adalah object dan tidak hanya angka.

    - Manual Aggregate menggunakan Reduce
        - Java Stream juga menyediakan sebuah operasi yang bernama reduce.
        - Reduce bisa digunakan untuk melakukan proses aggregate secara manual.
        - Misal data Stream adalah Integer dan ingin menjumlahkan seluruh anaka yang terdapat di Stream, kita bisa melakukan ini
          menggunakan reduce operator.
        - untuk method 'reduce()' digunakan menjumlahkan data Stream yang bertipe Integer dan return valuenya adalah Integer.
        - method 'reduce(0, BinaryOperator)'. misalnya kita ingin menjumlahkan seluruh data Stream (sum) :
          'List<Integer> numbers = List.of(1, 2, 3, 4, 5);'
          'Integer sum = numbers.stream().reduce(0, (result, item) -> result + item);'
          untuk parameter pertama adalah total pertama yaitu dapat di set 0 selanjutnya di jumlahkan antara total(result) dengan
          setiap element(item) yang ada pada data Stream menggunakan lambda dengan interface BinaryOperator.
                value pertama = 0;
                iterasi 1 => value = 0, item = 1 (value + item) = 1
                iterasi 2 => value = 1, item = 2 (value + item) = 3
                iterasi 3 => value = 3, item = 3 (value + item) = 6
                iterasi 4 => value = 6, item = 4 (value + item) = 10
                iterasi 5 => value = 10, item = 5 (value + item) = 15

        - di bahasa pemrograman lain seperti Kotlin, javascript dll, reduce mirip seperti operasi fold.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
