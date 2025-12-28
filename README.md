    Coffee Shop (GRAVICOFFEE) Management System - Java Desktop App
Sistem Manajemen kedai kopi ini adalah aplikasi berbasis desktop yang dikembangkan untuk mengotomatisasi
proses transaksi dan pendataan penjualan. Proyek ini dibangun menggunakan Java NetBeans dengan fokus pada
kemudahan penggunaan bagi petugas kasir.

    Fitur
- Sistem Otentikasi
Fitur Login untuk memastikan keamanan akses aplikasi.
- Kasir Digital
Memfasilitasi pemilihan menu kopi (Caramel Latte, Amerricano, dsb.) dengan harga yang sudah terprogram.
- Kalkulasi Diskon Otomatis
Logika perhitungan otomatis untuk memberikan potongan harga (5% hingga 10%) berdasarkan ambang batas total belanja.
- Manajemen Status Transaksi
Membedakan antara pelanggan yang masih dalam antrean pembayaran dengan yang sudah menyelesaikan transaksi.
- Rekapitulasi Penjualan
Fitur melihat, mencari, dan mengelola data transaksi yang telah berhasil diproses.

    Teknologi & Library
Bahasa Pemrograman: Java Swing.
Database: SQLite dengan driver JDBC.
GUI: Java Swing dengan FlatLaf untuk memberikan nuansa tampilan yang modern dan bersih.
Tools: Netbeans IDE 25

    Login
untuk masuk ke dalam sistem, gunakan akun ini:
- Username: hadad
- Password: 123

    Cara Menjalankan Proyek
1. Buka Proyek melalui Netbeans IDE.
2. Pastikan driver sqlite-jdbc sudah ditambahkan ke dalam Libraries proyek agar koneksi database berjalan lancar.
3. Titik awal aplikasi dimulai dari file LoginFrame.java
4. Database lokal bernama database_kopi.db akan secara otomatis dibuat oleh sistem saat aplikasi dijalankan pertama kali.

    Struktur File
- LoginFrame.java: Menangani keamanan akses awal.
- MainFrame.java: Menu utama aplikasi menggunakan JDesktopPane.
- AplikasiKopi.java: Form utama untuk input pemesanan dan transaksi.
- Koneksidatabase.java: Pengaturan koneksi ke database SQLite.

    TAMPILAN APLIKASINYA:
<img width="513" height="541" alt="Screenshot (1493)" src="https://github.com/user-attachments/assets/643cbd0f-5020-458c-921a-c8eae6689d56" />
<img width="1220" height="971" alt="Screenshot (1494)" src="https://github.com/user-attachments/assets/ee8f5276-75fa-4222-8c4c-eb4fe29f9934" />
<img width="1144" height="1017" alt="Screenshot (1495)" src="https://github.com/user-attachments/assets/aa54e3d6-2177-4295-b323-a279b4973faa" />
<img width="1125" height="659" alt="Screenshot (1496)" src="https://github.com/user-attachments/assets/2522e82c-b227-4fe4-a31a-d57d53fbc263" />
<img width="1205" height="536" alt="Screenshot (1497)" src="https://github.com/user-attachments/assets/7e4bb466-795a-474e-b8a0-eb8df6707485" />







  

Developed by: Hadad Al Tami
