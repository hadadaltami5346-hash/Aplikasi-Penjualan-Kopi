package AplikasiPenjualanKopi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Koneksidatabase {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                String url = "jdbc:sqlite:database_kopi.db";
                Class.forName("org.sqlite.JDBC");
                koneksi = DriverManager.getConnection(url);
                initTable();
            } catch (Exception e) {
                System.out.println("Gagal koneksi SQLite: " + e.getMessage());
            }
        }
        return koneksi;
    }

    private static void initTable() {
        try {
            Statement stmt = koneksi.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS pesanan (" +
                         "nama_pemesan TEXT, menu TEXT, harga TEXT, " +
                         "jumlah TEXT, total_bayar TEXT, metode_pembayaran TEXT, status_pembayaran TEXT)";
            stmt.execute(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}