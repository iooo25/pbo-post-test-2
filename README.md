<h1>DOKUMENTASI PROJECT POSTTEST 2 PBO</h1>

<P>Nama : Kalengkongan John Derby<br>NIM : 2209116061 <br>Kelas : Sistem Informasi B 2022</P>

<h2>A. Screenshot Source Code</h2>

<ol>
  <li>Class Main</li>

  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/1a3a7d25-27b5-4b41-8fab-a5c83f2e73f6)
  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/c87e17a7-aa1d-41e0-8c74-f441f45da4bf)
  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/9a1afc89-da1b-48ff-b62c-f3a171dbf139)
  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/f999bb8f-92b6-4588-8a81-6afece12b3f6)
  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/7c31e801-8ffd-423b-8a71-0f2773955b73)
  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/d8a84027-4b3e-4be0-934e-86eab33dc61f)
  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/52d63486-54aa-49f8-bd20-bc19ccb43d48)
  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/a9eaf212-6a6e-4706-b798-9bdd34691cb6)
  <li>Class Pakaian</li>

  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/a6577e97-13df-4ab3-bb8d-f4011be31686)
  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/f5eb9ccd-fa69-492d-8f00-a66f314f765c)
  <li>Class baju</li>

  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/4212e8f2-5ed1-45b3-b10f-07803b6c9977)
  <li>Class celana</li>

  ![image](https://github.com/iooo25/pbo-post-test-2/assets/128172248/1dd4d720-593d-4beb-ac51-b5140a22766b)
</ol>

<h2>B. Penjelasan Source Code</h2>

<ol>
  <li>Class Main</li>
  <ol>
    <li>Package dan Imports:</li>
    <p>Program ini menggunakan beberapa paket Java untuk mengatur dan mengimpor kelas-kelas yang diperlukan, yaitu (baju dan celana dari com.child, dan pakaian dari com.parent, dan juga ArrayList dan Scanner dari paket java.util.)</p>
    <li>Kelas Utama (Main):</li>
    <p>Kelas ini merupakan titik masuk program. Di dalamnya terdapat metode main yang akan dieksekusi pertama kali saat program dijalankan.</p>
    <li>Variabel dan Objek Statis:</li>
    <p></p>
    <li>Menu dan Switch Statement:</li>
    <p>Program ini memiliki variabel dan objek yang bersifat statis, artinya mereka terkait dengan kelas itu sendiri dan tidak bergantung pada objek spesifik dari kelas tersebut.</p>
    <li>Method nambahData(String choice):</li>
    <p>Metode ini pertama-tama memeriksa apakah arrayPakaian kosong atau tidak. Jika kosong, maka pengguna diminta untuk memasukkan ID dan detail pakaian. Jika tidak kosong, maka metode akan memeriksa apakah ID yang dimasukkan pengguna sudah ada di dalam koleksi atau tidak. Jika sudah ada, maka metode akan memberikan pesan bahwa ID tersebut sudah ada.
Jika ID belum ada di dalam koleksi, maka pengguna diminta untuk memasukkan detail pakaian dan pakaian baru akan ditambahkan ke dalam koleksi.</p>
    <li>Method menampilkanDataPakaian():</li>
    <p>Metode ini pertama-tama memeriksa apakah arrayPakaian kosong atau tidak. Jika kosong, maka akan diberikan pesan bahwa data pakaian masih kosong. Jika tidak kosong, maka metode akan melakukan iterasi melalui setiap objek pakaian dalam arrayPakaian dan memanggil metode showPakaian() untuk menampilkan detail pakaian.</p>
    <li>Method mengubahDataPakaian(String choice):</li>
    <p>Metode ini pertama-tama memeriksa apakah arrayPakaian kosong atau tidak. Jika kosong, maka akan diberikan pesan bahwa data pakaian masih kosong. Jika tidak kosong, maka metode akan meminta pengguna untuk memasukkan ID dari pakaian yang ingin diubah.
Setelah ID dimasukkan, metode akan melakukan iterasi melalui setiap objek pakaian dalam arrayPakaian dan memeriksa apakah objek tersebut adalah "Baju" atau "Celana". Jika objek adalah "Baju" dan memiliki ID yang sesuai, maka pengguna diminta untuk memasukkan detail baru untuk baju tersebut. Hal yang sama berlaku jika objek adalah "Celana".
Setelah detail baru dimasukkan, pakaian akan diperbarui dengan nilai-nilai baru.</p>
    <li>Method mengapusDataPakaian():</li>
    <p>Metode ini pertama-tama memeriksa apakah arrayPakaian kosong atau tidak. Jika kosong, maka akan diberikan pesan bahwa data pakaian masih kosong. Jika tidak kosong, maka metode akan meminta pengguna untuk memasukkan ID dari pakaian yang ingin dihapus.
Setelah ID dimasukkan, metode akan melakukan iterasi melalui setiap objek pakaian dalam arrayPakaian dan memeriksa apakah objek memiliki ID yang sesuai. Jika ditemukan pakaian dengan ID yang sesuai, maka pakaian tersebut akan dihapus dari koleksi.</p>
    <li>Penanganan Eksepsi:</li>
    <p>Program menggunakan mekanisme penanganan eksepsi untuk mengatasi situasi-situasi di mana input pengguna tidak sesuai dengan yang diharapkan. Ini membantu memastikan program tetap berjalan dengan benar meskipun ada kesalahan input.</p>
    <li>Penjelasan Umum:</li>
    <p>Program ini menyediakan antarmuka konsol sederhana untuk mengelola koleksi pakaian. Pengguna dapat menambahkan, menampilkan, mengubah, atau menghapus item pakaian dari koleksi.</p>
    <li>Keluar dari Program:</li>
    <p>Jika pengguna memilih opsi untuk keluar (biasanya opsi dengan nomor 5), program akan menutup objek Scanner dan keluar dari program.</p>
  </ol>
  <li>Class Pakaian</li>
  <li>Class baju</li>
  <li>Class celana</li>
</ol>

<h2>C. Penjelasan Output</h2>
<ol>
  <li>create</li>
  <li>read</li>
  <li>update</li>
  <li>delete</li>
  <li>EXIT</li>
</ol>
