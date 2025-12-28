    Coffee Shop (GRAVICOFFEE) Management System - Java Desktop App
Sistem Manajemen kedai kopi ini adalah aplikasi berbasis desktop yang dikembangkan untuk mengotomatisasi
proses transaksi dan pendataan penjualan. Proyek ini dibangun menggunakan Java NetBeans dengan fokus pada
kemudahan penggunaan bagi petugas kasir.

    Tampilan Aplikasinya:
Halaman Login - Akses masuk petugas kasir
![Login Page](Screenshot%20(1493).png)

Menu Utama & Pemesanan - Tampilan pemilihan menu kopi dan input jumlah pesanan
![Halaman Pemesanan](Screenshot%20(1494).png)

Menunggu Konfirmasi Pembayaran - Daftar transaksi yang sedang menunggu penyelesaian pembayaran
![Konfirmasi Pembayaran](Screenshot%20(1495).png)

Riwayat Transaksi - Laporan data seluruh pesanan yang telah dibayar
![Riwayat Pembayaran](Screenshot%20(1496).png)

Pengelolaan Database - Tampilan pengelolaan data transaksi
![Struktur Database](Screenshot%20(1497).png)

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


Developed by: Hadad Al Tami
