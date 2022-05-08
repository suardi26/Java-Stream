package com.practice;

/**
    - Salah satu fitur menarik di Java Stream adalah Stream dapat dijalankan secara parallel.
    - Parallel Programming (Multithreading Java) merupakan sebuah konsep untuk dapat menjalankan task atau tugas lebih dari satu
      secara paralel.
    - Secara garis besar, parallel artinya beberapa proses berjalan secara bersamaan, dimana jika secara default program akan
      berjalan secara sequential artinya satu per satu proses dijalankan dari atas ke bawah sehingga saling tunggu, namun
      ketika program dijalankan secara parallel maka dapat berjalan secara bersamaan tanpa saling menunggu.
    - Secara default, Parallel Stream akan dijalankan di ForkJoinPool, dimana akan di running secara default menggunakan Thread
      sejumlah maksimal total CPU kita. misalnya di CPU dengan core 12 maka parallel Stream dapat berjalan di 12 proses secara
      bersamaan.
    - untuk menjalankan sebuah stream secara parallel maka dapat menggunakan method '.parallel()', namun perlu berhati-hati
      menggunakan Parallel Stream dikarenakan proses tidak lagi saling menunggu melainkan berjalan secara bersanaan pada
      Thread-Thread yang berbeda sehingga pada saat melakukan operasi sorting kemudian melaklukan operasi selanjutnya,
      mungkin saja prosesnya tidak berjalan karena program tidak lagi berjalan terurut dari atas ke bawah (sequential)
      melainkan berjalan secara bersamaan dan ketika sebuah proses bisa berjalan ketika proses lainnya sudah berjalan,
      hal ini yang harus diperhatikan, dan parallel stream digunakan sesuai dengan kebutuhan misalnya data Stream sudah terlalu
      banyak dan ingin diproses secara cepat.
    - Misalnya ketika melakukan pengurutan/sorting ketika menggunakan Parallel Stream maka urutannya akan acak-acakan.
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
