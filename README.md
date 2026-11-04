# Tugas 2: Praktikum Pemrograman Berorientasi Objek

* **Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek
* **Kelas:** A
* **Nama Lengkap:** Nayli Itqiyana
* **NPM:** 250810701100025
* **Tautan Repository:** https://github.com/NayliItqiyana/Tugas2_Inherit-polymorph-2525.git
  
---

## Deskripsi Singkat

Repository ini berisi penyelesaian Tugas 2 Praktikum Pemrograman Berorientasi Objek yang mencakup empat soal utama. Tugas ini melatih pemahaman konsep *inheritance*, *protected access*, *constructor chaining*, *composition* (*has-a*), *polimorfisme* (*overriding*, *upcasting*, *downcasting* aman), serta penanganan *exception* dalam bahasa Java.

---

## Fitur Utama

* **Soal 1 (Hierarki Perangkat Elektronik):** Menjalankan pewarisan bertingkat (*multi-level inheritance*) pada perangkat, laptop, ponsel, serta laptop gaming, dilengkapi validasi ketat dan perhitungan pajak serta harga promo.
* **Soal 2 (Analisis Output, Error, dan Polimorfisme):** Mengevaluasi urutan eksekusi constructor, *dynamic method dispatch* pada *overriding*, serta penanganan *ClassCastException* menggunakan `instanceof`.
* **Soal 3 (Titik dan Garis):** Mengimplementasikan relasi *composition* (*has-a*) antara garis dan titik, *method overloading* pada constructor, serta pencegahan efek samping *aliasing* melalui *defensive copy*.
* **Soal 4 (Mini Project Toko Digital):** Menggabungkan konsep polimorfisme penuh pada keranjang belanja untuk mencetak struk dan melakukan rekapitulasi jumlah produk per jenis secara aman.

---

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan (Kelas / Method) | Alasan Pemilihan |
| :--- | :--- | :--- |
| **Inheritance** | `Laptop` extends `Perangkat` | Mewarisi atribut dasar perangkat tanpa duplikasi kode. |
| **Protected Access** | Atribut `harga` di kelas `Perangkat`| Memungkinkan subclass mengakses langsung variabel harga untuk kalkulasi promo. |
| **Method Overriding** | Method `infoSingkat()` di setiap subclass | Menyesuaikan format informasi spesifik tiap jenis perangkat. |
| **Composition (Has-A)** | Kelas `Garis` memiliki atribut `Titik awal` & `Titik akhir` | Menyatakan relasi bagian-utuh secara modular pada geometri. |
| **Polimorfisme** | `Keranjang.cetakStruk()` & `hitungTotal()` | Memungkinkan pemanggilan method `hitungHargaAkhir()` secara dinamis sesuai objek aslinya. |

---

## Struktur Project

```text
Tugas2_Inherit-polymorph-2525/
│
├── src/
│   ├── soal1/
│   │   ├── Perangkat.java
│   │   ├── Laptop.java
│   │   ├── Ponsel.java
│   │   ├── LaptopGaming.java
│   │   └── TesSoal1.java
│   │
│   ├── soal2/
│   │   ├── Hewan.java
│   │   ├── Kucing.java
│   │   ├── A.java
│   │   ├── B.java
│   │   ├── Lingkaran.java
│   │   ├── Titik.java
│   │   └── TesSoal2.java
│   │
│   ├── soal3/
│   │   ├── Titik.java
│   │   ├── Garis.java
│   │   └── TesSoal3.java
│   │
│   └── soal4/
│       ├── Produk.java
│       ├── ProdukFisik.java
│       ├── ProdukDigital.java
│       ├── Langganan.java
│       ├── Keranjang.java
│       └── TesSoal4.java
│
├── .gitignore
└── README.md
```

---

## Prasyarat

* **Java Development Kit (JDK):** Versi 17 atau yang terbaru.
* **IDE Disarankan:** IntelliJ IDEA atau Visual Studio Code dengan ekstensi Java.

---

## Cara Menjalankan Program

### 1. Melalui IntelliJ IDEA
1. Buka folder *project* sebagai root project di IntelliJ.
2. Pastikan folder `src` ditandai sebagai *Sources Root*.
3. Buka file pengujian (`TesSoal1.java`, `TesSoal2.java`, `TesSoal3.java`, atau `TesSoal4.java`), klik ikon *Run* di samping method `main`.

### 2. Melalui Command Line (Terminal)
Buka terminal pada direktori root *project*, lalu jalankan perintah berikut (contoh untuk Soal 1):
```bash
javac src/soal1/*.java
java -cp src soal1.TesSoal1
```
---

## Contoh Output

### 1. Soal 1 (Hierarki Perangkat Elektronik)
```text
Asus | garansi 24 bulan | RAM 16 GB | layar 14.0 inci
Samsung | garansi 12 bulan | 128 GB | 3 kamera
MSI | garansi 18 bulan | RAM 32 GB | layar 15.6 inci | GPU RTX 4060
Pajak laptop: Rp800000
Promo laptop 10 persen: Rp7200000
```
### 2. Soal 2 (Analisis Output & Polimorfisme)
```text
--- Bagian A ---
Hewan dibuat: Tom
Kucing dibuat
Tom makan
meong
meong
Tom memanjat
Hewan dibuat: Generik
h2 bukan instance dari Kucing, downcasting dilewati dengan aman.
--- Bagian B ---
A dibuat
init B, nilai=0
B dibuat, nilai=5
--- Bagian C ---
78.53981633974483
0.0
0.0
```
### Soal 3 (Titik dan Garis)
```text
(0.0, 0.0)-(3.0, 4.0) panjang 5.0
(1.0, 1.0)-(5.0, 5.0)
```
### Soal 4 (Mini Project Toko Digital)
```text
F01 | Keyboard Mekanik | fisik 1.5 kg | Rp515000
D01 | Ebook Java | digital 20.0 MB | Rp90000
L01 | Kelas Online | langganan 12 bulan | Rp1440000
TOTAL: Rp2045000
Fisik: 1, Digital: 1, Langganan: 1
Gagal: Produk dengan kode F01 sudah ada di keranjang.
``` 
---

## Jawaban Soal dan Analisis Konsep

### 1. Pertanyaan Tambahan Soal 1
* **Pertanyaan:** Ubah harga menjadi private lalu kompilasi. Salin pesan error yang muncul dan jelaskan mengapa error tersebut muncul.
* **Jawaban:** 
Waktu atribut `harga` diubah jadi `private` di kelas `Perangkat`, muncul error terminal sama penjelasannya kayak gini:

```text
// PESAN ERROR TERMINAL:
Exception in thread "main" java.lang.Error: Unresolved compilation problems:
    The field Perangkat.harga is not visible
    The field Perangkat.harga is not visible

    at soall.Laptop.hitungHargaPromo(Laptop.java:26)
    at soall.TesSoall.main(TesSoall.java:16)
```
Kenapa error? Karena kalau udah `private`, variabel `harga` cuma bisa 
diakses di dalam kelas `Perangkat` doang. Kelas anak kayak `Laptop` 
jadi nggak bisa manggil atau ngitung harganya secara langsung (not visible). 
Makanya solusinya kita pake `protected` biar aman dan bisa diwarisin ke subclass.
 
---

### 2. Pertanyaan Soal 2 (Analisis Output, Error, dan Polimorfisme)
1. **Output lengkap program Bagian A:**
   Program bakal nge-print proses instansiasi constructor dari `Hewan` ke `Kucing`, terus manggil method `makan()` yang di dalamnya nge-trigger `suara()` milik `Kucing` (polimorfisme), manggil method `panjat()`, terus nge-print pembuatan `Hewan` generik, dan karena ada casting ke `h2` yang aslinya cuma objek `Hewan` biasa, bakal muncul exception kalau nggak dicek dulu pakai `instanceof`.
   ```text
   --- Bagian A ---
   Hewan dibuat: Tom
   Kucing dibuat
   Tom makan
   meong
   meong
   Tom memanjat
   Hewan dibuat: Generik
   Exception in thread "main" java.lang.ClassCastException: class soal2.Hewan cannot be cast to class soal2.Kucing
2. **Komentar `h.panjat()` dihapus:**
   Kalau dicoba dihapus komentarnya, errornya muncul pas **tahap kompilasi (compile-time error)**. Alasannya karena tipe statis dari variabel `h` itu `Hewan`. Walaupun waktu *runtime* isinya objek `Kucing`, compiler Java ngecek berdasarkan tipe statisnya. Karena di kelas `Hewan` nggak ada method `panjat()`, ya langsung di-reject sama compiler.
  ```text
  src\soal2\TesSoal2.java:10: error: cannot find symbol
    h.panjat(); // Error kompilasi jika dibuka, karena tipe statis 'Hewan' tidak memiliki method panjat()
    ^
  symbol:   method panjat()
  location: variable h of type Hewan
  1 error
  ```
3. **Baris penyebab `ClassCastException` dan perbaikannya:**
   Baris yang bikin jebol itu `Kucing k2 = (Kucing) h2;` karena `h2` itu dibikin pakai `new Hewan("Generik")`, jadi nggak ada hubungan keturunan langsung sebagai kucing di memori saat di-cast paksa. Biar aman tanpa ngerubah tipe `h2`, kita akalin pakai `instanceof` kayak gini:
   ```java
   if (h2 instanceof Kucing) {
       Kucing k2 = (Kucing) h2;
       k2.panjat();
   } else {
       System.out.println("h2 bukan kucing, aman nggak di-cast paksa!");
   }
4. **Method `suara()` pada `h.makan()`:**
   Walaupun method `makan()` ditulis di kelas `Hewan`, pas `h.suara()` jalan, yang dipanggil itu method `suara()` milik **`Kucing`**. Ini namanya *dynamic method dispatch*. Jadi Java ngecek objek aslinya pas *runtime* (tipe dinamisnya `Kucing`), bukan cuma nengok tipe pas dideklarasikannya (tipe statisnya `Hewan`).

5. **Prediksi Output Bagian B (`new B();`) & Risiko Method di Constructor:**
   * Prediksi outputnya bakal nge-print `"A dibuat"`, terus `"init B, nilai=0"`, baru terakhir `"B dibuat, nilai=5"`.
   * Kenapa pas di `"init B"` nilainya malah `0` bukan `5`? Karena pas constructor `B` jalan, dia manggil `super()` duluan yang lari ke constructor `A`. Di constructor `A`, dia manggil method `init()`. Nah, si Java bakal ngejalanin method `init()` milik `B` yang udah di-override, tapi di titik itu variabel `nilai` di `B` belum sempat di-assign angka `5` (masih default int yaitu `0`). Makanya bahaya banget manggil method yang bisa dioverride dari dalam constructor karena bisa bikin variabel di subclass terbaca *null* atau *default* sebelum diinisialisasi.

6. **Analisis Kelas `Lingkaran` dan `Titik` (Bagian C):**
   * `l3.luas()` bisa ngeluarin hasil `0.0` karena variabelnya tipe `Lingkaran` tapi objek aslinya `Titik` yang method `luas()`-nya udah di-override jadi 0.
   * Kalau ditanya apakah akal sehat kalau "Titik adalah sebuah Lingkaran" (*is-a*)? Jawabannya **nggak masuk akal** secara logika geometri, karena titik itu cuma koordinat (0 dimensi/posisi doang), sedangkan lingkaran punya luas dan jari-jari. Kalau dipaksain *extends*, akibatnya prinsip *Liskov Substitution* bakal rusak parah kalau ada method lain yang ngarepin lingkaran beneran tapi malah dikasih titik yang luasnya nol.

---

### 3. Pertanyaan dan Tugas Soal 3 (Titik dan Garis)
1. **Prediksi Baris Kedua:**
   Mencetak koordinat garis baru yang dibikin dari objek titik `t` yang tadinya bernilai `(1, 1)` sampai `(5, 5)`.

2. **Setelah Perubahan *Defensive Copy*:**
   Pas atribut di constructor `Garis` kita-ubah jadi *defensive copy* (bikin *new instance* titik baru), pas objek `t` di luar diubah jadi `t.setX(100)`, garisnya **tetap aman dan nggak berubah** jadi 100, alias tetep sesuai nilai awalnya.

3. **Kapan Perilaku Sebelum/Sesudah Dipakai?**
   * *Sesudah defensive copy:* Dipakai kalau kita mau data di dalam kelas itu aman dari intervensi atau perubahan tak terduga dari luar (*immutable-like*).
   * *Sebelum defensive copy:* Dipakai kalau kita emang sengaja pengen objeknya *shared reference* supaya kalau ada update data di luar, komponen di dalam kelasnya ikut ke-update secara *real-time*.

4. **Kenapa Desain `Garis extends Titik` Itu Salah?**
   Ditinjau dari konsep OOP, garis itu *has-a* (punya titik awal dan titik akhir), bukan *is-a* (garis adalah sebuah titik). Kalau dipaksa *extends*, secara logika struktur data jadi ngaco karena garis butuh dua titik, sementara titik cuma nampung satu koordinat `(x, y)`.

---

### 4. Analisis Konsep:
1. **Perbedaan Method Overriding dan Method Overloading serta Kaitannya:**
   * **Method Overriding:** Terjadi ketika subclass menulis ulang method yang sama persis dari superclass-nya, biasanya digunakan untuk **polimorfisme** (contohnya method `infoSingkat()` di `Perangkat` yang dicustom ulang di kelas `Laptop`):
     ```java
     // Di kelas Perangkat (Superclass)
     public void infoSingkat() {
         System.out.println(merk + " garansi " + garansiBulan + " bulan");
     }

     // Di kelas Laptop (Subclass - Overriding)
     @Override
     public void infoSingkat() {
         System.out.println(merk + " garansi " + garansiBulan + " bulan | RAM " + ramGb + " GB");
     }
     ```
   * **Method Overloading:** Terjadi saat kita membuat beberapa method dengan nama yang sama di dalam satu kelas yang sama, tetapi parameternya berbeda (jumlah, tipe, atau urutannya), tidak bergantung pada *inheritance* (contohnya constructor `Garis`):
     ```java
     public Garis(Titik awal, Titik akhir) {
         this.awal = new Titik(awal);
         this.akhir = new Titik(akhir);
     }
     public Garis(double x1, double y1, double x2, double y2) {
         this.awal = new Titik(x1, y1);
         this.akhir = new Titik(x2, y2);
     }
     ```

2. **Memilih Antara *Inheritance* vs *Composition*:**
   * Kita pakai **Inheritance** kalau beneran ada hubungan hierarki *is-a* yang jelas, contohnya `LaptopGaming` adalah sebuah `Laptop`.
   * Kita pakai **Composition** kalau suatu kelas cuma "memiliki" komponen kelas lain sebagai bagian darinya (*has-a*), contohnya kelas `Garis` yang punya komponen `Titik awal` dan `Titik akhir`.

3. **Kenapa `cetakStruk()` Tanpa `instanceof` tapi `hitungPerJenis()` Pakai `instanceof` di Soal 4?**
   * Di `cetakStruk()`, kita manfaatin **polimorfisme murni**. Setiap objek produk udah punya method `deskripsi()` dan `hitungHargaAkhir()` sendiri-sendiri, jadi sistem tinggal manggil aja secara dinamis tanpa peduli dia fisik, digital, atau langganan.
   * Sebaliknya, `hitungPerJenis()` butuh `instanceof` karena tugasnya menghitung rekapitulasi jumlah per kategori secara eksplisit. *Downcasting* dibutuhkan untuk mengecek tipe spesifiknya secara aman agar tidak terjadi *ClassCastException*.
