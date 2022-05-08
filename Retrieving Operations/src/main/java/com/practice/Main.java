package com.practice;

/**
    - Retrieving Operations adalah operasi pada Stream untuk melakukan pengambilan sebagian data Stream.
    - Secara garis besar, cara kerjanya hampir mirip dengan Filtering namum sebenarnya tidak sama.
    - Ada banyak method yang digunakan untuk Retrieving Operations, berikut beberapa contohnya :

        - limit(n) digunakan untuk mengambil sejumlah n data pertama dan menghiraukan data selanjutnya.
        - skip(n) digunakan untuk menghiraukan sejumlah n data pertama dan mengambil data selanjutnya sampai data terakhir.
        - takeWhile(T -> Boolean) digunakan untuk mengambil dari data pertama serta data selanjutnya, selama kondisi true,
                                  namun pada saat kondisi false maka berhenti mengambil data-data selanjutnya.
        - dropWhile(T -> Boolean) digunakan untuk menghiraukan data pertama serta data selanjutnya, selama kondisi true,
                                  namun pada saat kondisi false maka baru akan mengambil data hingga data terakhir.

    - Perbedaan Filtering Operations dengan Retrieving Operations method 'takeWhile(T -> Boolean)' adalah jika method pada
      Filtering Operations melakukan cek satu per satu data streamnya sedangkan method 'takeWhile' pada Retrieving Operations
      mengecek jika kondisi datanya true maka diambil sedangkan ketika kondisi datanya false maka akan berhenti mengambil data
      seterusnya meskipun ada data selanjutnya yang memenuhi kondisi yang ditentukan, data tersebut tetap akan diskip.

    - Retrieving Single Element.
        - Stream juga memiliki kemampuan untuk mengambil satu element saja.
        - Ketika ingin mengambil 1 element data stream maka dapat menggunakan Retrieving Single Element.
        - namun operasi jenis ini merupakan operasi terminal dan bukan lagi operasi intermediate, sehingga akan secara otomatis
          menjalankan aliran data di Stream.
        - Ada beberapa method yang digunakan untuk Retrieving Single Element :
            - findAny() digunakan untuk mengambil satu element secara random.
            - findFirst() digunakan untuk mengambil element pertama.
        - Kedua method tersebut memiliki return value Optional maka datanya bisa ada, bisa juga tidak.

*/
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
