package AplikasiPenjualanKopi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author hadad
 */
public class FrameRiwayatPembayaran extends javax.swing.JInternalFrame {

    private DefaultTableModel Model;

    public FrameRiwayatPembayaran() {
        initComponents();

        CariNamaPemesanTxt.putClientProperty("JTextField.placeholderText", "Cari nama pembeli di sini...");

        jTableRiwayatBayar.setRowHeight(30); 
        jTableRiwayatBayar.setShowVerticalLines(false);

        Model = (DefaultTableModel) jTableRiwayatBayar.getModel();
        loadDataSudahBayar();
    }

    private void loadDataSudahBayar() {
        Model.setRowCount(0);
        try {
            Connection conn = Koneksidatabase.getConnection();
            String sql = "SELECT * FROM pesanan WHERE status_pembayaran = 'Sudah Bayar'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Model.addRow(new Object[]{
                    rs.getString("nama_pemesan"),
                    rs.getString("menu"),
                    rs.getString("harga"),
                    rs.getString("jumlah"),
                    rs.getString("total_bayar"),
                    rs.getString("metode_pembayaran"),
                    rs.getString("status_pembayaran")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data: " + e.getMessage());
        }
    }

    private void cariDataPemesan() {
        String keyword = CariNamaPemesanTxt.getText().trim();
        Model.setRowCount(0);
        try {
            Connection conn = Koneksidatabase.getConnection();
            String sql = "SELECT * FROM pesanan WHERE status_pembayaran = 'Sudah Bayar' AND nama_pemesan LIKE ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + keyword + "%");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Model.addRow(new Object[]{
                    rs.getString("nama_pemesan"),
                    rs.getString("menu"),
                    rs.getString("harga"),
                    rs.getString("jumlah"),
                    rs.getString("total_bayar"),
                    rs.getString("metode_pembayaran"),
                    rs.getString("status_pembayaran")
                });
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mencari data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableRiwayatBayar = new javax.swing.JTable();
        CariNamaPemesanTxt = new javax.swing.JTextField();
        CariButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();
        HapusButton = new javax.swing.JButton();
        KembaliButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RIWAYAT PEMESANAN");

        jTableRiwayatBayar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Nama Pembeli", "Menu Kopi", "Harga", "Jumlah", "Total Bayar", "Metode Pembayaran", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTableRiwayatBayar);

        CariButton.setBackground(new java.awt.Color(0, 204, 204));
        CariButton.setText("Cari");
        CariButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariButtonActionPerformed(evt);
            }
        });

        RefreshButton.setText("REFRESH");
        RefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshButtonActionPerformed(evt);
            }
        });

        HapusButton.setBackground(new java.awt.Color(255, 51, 51));
        HapusButton.setText("HAPUS");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });

        KembaliButton.setText("KEMBALI");
        KembaliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(HapusButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(KembaliButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RefreshButton)
                .addGap(26, 26, 26)
                .addComponent(CariNamaPemesanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(CariButton)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CariButton)
                    .addComponent(CariNamaPemesanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RefreshButton)
                    .addComponent(KembaliButton))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(HapusButton)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CariButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cariDataPemesan();
    }

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {
        loadDataSudahBayar();
        CariNamaPemesanTxt.setText("");
    }

    private void KembaliButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTableRiwayatBayar.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data!");
            return;
        }

        int konf = JOptionPane.showConfirmDialog(this, "Yakin hapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (konf == JOptionPane.YES_OPTION) {
            try {
                Connection conn = Koneksidatabase.getConnection();
                String sql = "DELETE FROM pesanan WHERE nama_pemesan=? AND total_bayar=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, jTableRiwayatBayar.getValueAt(selectedRow, 0).toString());
                pst.setString(2, jTableRiwayatBayar.getValueAt(selectedRow, 4).toString());
                pst.executeUpdate();
                loadDataSudahBayar();
                JOptionPane.showMessageDialog(this, "Dihapus!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Gagal: " + e.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CariButton;
    private javax.swing.JTextField CariNamaPemesanTxt;
    private javax.swing.JButton HapusButton;
    private javax.swing.JButton KembaliButton;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableRiwayatBayar;
    // End of variables declaration//GEN-END:variables
}