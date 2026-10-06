1. Di dalam class Pegawai, Pasien, dan Konsultasi, terdapat method setter dan getter
untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ?
Jawaban :
Getter itu digunakan untuk mengambil atau membaca nilai atribut, sedangkan setter digunakan untuk mengubah atau memberikan nilai baru pada atribut. Setter dan getter digunakan agar atribut yang bersifat private tetap dapat diakses melalui method. 

2. Di dalam class Konsultasi tidak secara eksplisit terdapat constructor dengan 
parameter. Apakah ini berarti class Konsultasi tidak memiliki constructor?
Jawaban :
Class Konsultasi tetap memiliki constructor. Karena tidak dibuat constructor secara eksplisit, Java menyediakan default constructor secara otomatis. Constructor tersebut tidak memiliki parameter.

3. Perhatikan class Konsultasi, atribut mana saja yang bertipe object?
Jawaban :
private Pegawai dokter;
private Pegawai perawat;
Atribut dokter dan perawat bertipe object karena keduanya menggunakan tipe class Pegawai. Sedangkan tanggal menggunakan tipe LocalDate.

4. Perhatikan class Konsultasi, pada baris manakah yang menunjukan bahwa class
Konsultasi memiliki relasi dengan class Pegawai?
Jawab ;
Relasi ditunjukkan oleh atribut dokter dan perawat yang bertipe Pegawai. Artinya objek Konsultasi menyimpan objek dari class Pegawai.

5. Perhatikan pada class Pasien, apa yang dilakukan oleh kode konsultasi.getInfo()?
Jawab :
konsultasi.getInfo() memanggil method getInfo() milik objek Konsultasi untuk mendapatkan informasi konsultasi, yaitu tanggal, dokter, dan perawat.

6. Pada method getInfo() dalam class Pasien, terdapat baris kode:
if (!riwayatKonsultasi.isEmpty())
Apakah yang dilakukan oleh baris tersebut?

jawab :
Kode tersebut mengecek apakah riwayatKonsultasi tidak kosong. Jika terdapat riwayat konsultasi, maka daftar konsultasi akan ditampilkan. Jika kosong, program menampilkan pesan bahwa belum ada riwayat konsultasi.

7. Pada constructor class Pasien, terdapat baris kode:
this.riwayatKonsultasi = new ArrayList<>();
Apakah yang dilakukan oleh baris tersebut? Apakah yang terjadi jika baris tersebut 
dihilangkan?
Jawab :
Kode tersebut membuat objek ArrayList baru dan menyimpannya ke atribut riwayatKonsultasi. Dengan begitu, ArrayList siap digunakan untuk menyimpan objek Konsultasi.
Jika baris tersebut dihilangkan, riwayatKonsultasi tidak diinisialisasi sehingga nilainya null. Ketika program mencoba melakukan add() atau isEmpty(), dapat terjadi NullPointerException.