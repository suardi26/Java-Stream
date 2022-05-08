package com.practice;

/**
    - Pada saat ingin membuat Stream secara manual, misalnya menambah data ke Stream secara manual, maka java menyediakan
      StreamBuilder untuk membuat Stream secara manual, dan kita dapat menggunakannya seperti layaknya Collection, kita dapat
      membuat Stream Builder, menambahkan data ke Stream Builder, dan setelah selesai, baru kita dapat mengkonversi datanya
      dari Stream builder ke Stream.
    - Untuk dokumentasi lengkap dari Stream Builder dapat mengujungi 'https://docs.oracle.com'.

    - Untuk menambahkan data pada Stream Builder dapat menggunakan 2 method yaitu :

        - method accept() dimana method ini digunakan untuk menambahkan data dan tidak memiliki return value (void).
            'builder.accept("Suardi");'

        - method add() dimana method ini digunakan untuk menambahkan data dan memiliki return value builder itu sendiri serta
          dapat di-chaining artinya dapat disambung dengan lebih dari satu method 'add()' menggunakan '.' .
             'builder.add("Daud").add("Manda");'

    - Untuk mengkonversi dari Stream Builder ke Stream dapat menggunakan method 'build()'.
        'Stream<String> stream = builder.build();'
 */
public class Main {
}
