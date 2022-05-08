package com.practice;
/**
    - Filtering operations adalah operasi yang digunakan untuk melakukan filter terhadap data Stream, artinya memilih-milih data
      mana yang akan digunakan.
    - Contohnya : misalnya kita punya Stream data dari 1-10, dan kita hanya ingin menggunakan data yang ganjil atau genap saja
      maka kita dapat menggunakan operasi filtering. jadi kita dapat memasukan kondisi filteringnya sesuai dengan keinginan kita.
    - Ada beberapa method yang digunakan untuk filtering Operations :

        - filter(U -> Boolean) digunakan untuk mengambil data yang masuk kriteria filter, dimana U adalah tiap data di dalam
          stream dan return-nya adalah boolean ketika true maka data tersebut akan dimasukan di dalam stream selanjutnya, akan
          tetapi ketika false maka data tersebut tidak dimasukan pada stream selanjutnya.
        - distinct() digunakan untuk menghapus semua data duplikat.
 */

public class Main {
}
