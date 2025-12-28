package AplikasiPenjualanKopi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Hadad
 */
public class FrameMenungguPembayaran extends javax.swing.JInternalFrame {

    /**
     * Konstruktor Frame
     */
    public FrameMenungguPembayaran() {
        initComponents();
        loadDataBelumBayar();
    }

    /**
     * Menampilkan data dengan status 'Menunggu Pembayaran' ke tabel
     */
    private void loadDataBelumBayar() {
        DefaultTableModel model = (DefaultTableModel) jTableMenungguPembayaran.getModel();
        model.setRowCount(0);

        try {
            Connection conn = Koneksidatabase.getConnection();
            String sql = "SELECT * FROM pesanan WHERE status_pembayaran = 'Menunggu Pembayaran'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
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

    /**
     * Fungsi Cari Data 
     */
    private void cariDataPemesan() {
        String keyword = CariNamaPemesanTxt.getText().trim();
        DefaultTableModel model = (DefaultTableModel) jTableMenungguPembayaran.getModel();
        model.setRowCount(0);

        try {
            Connection conn = Koneksidatabase.getConnection();
            String sql = "SELECT * FROM pesanan WHERE status_pembayaran = 'Menunggu Pembayaran' AND nama_pemesan LIKE ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + keyword + "%");

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMenungguPembayaran = new javax.swing.JTable();
        KonfirmasiButton = new javax.swing.JButton();
        HapusButton = new javax.swing.JButton();
        CariNamaPemesanTxt = new javax.swing.JTextField();
        CariButton = new javax.swing.JButton();
        RefreshButton = new javax.swing.JButton();

        setClosable(true); 
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MENUNGGU PEMBAYARAN");

        jTableMenungguPembayaran.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nama Pembeli", "Menu Kopi", "Harga", "Jumlah", "Total Bayar", "Metode Pembayaran", "Status"
                }
        ));
        jScrollPane1.setViewportView(jTableMenungguPembayaran);

        KonfirmasiButton.setBackground(new java.awt.Color(102, 255, 102));
        KonfirmasiButton.setText("KONFIRMASI");
        KonfirmasiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonfirmasiButtonActionPerformed(evt);
            }
        });

        HapusButton.setBackground(new java.awt.Color(255, 51, 51));
        HapusButton.setText("HAPUS");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });

        CariButton.setBackground(new java.awt.Color(0, 204, 204));
        CariButton.setText("CARI");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(RefreshButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(CariNamaPemesanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(CariButton)
                                                .addGap(26, 26, 26))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(HapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(KonfirmasiButton)
                                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CariNamaPemesanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CariButton)
                                        .addComponent(RefreshButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(HapusButton)
                                        .addComponent(KonfirmasiButton))
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void KonfirmasiButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTableMenungguPembayaran.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin di Konfirmasi!");
            return;
        }

        String namaPemesan = jTableMenungguPembayaran.getValueAt(selectedRow, 0).toString();

        try {
            Connection conn = Koneksidatabase.getConnection();
            String sql = "UPDATE pesanan SET status_pembayaran = 'Sudah Bayar' WHERE nama_pemesan = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, namaPemesan);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Pembayaran Berhasil Dikonfirmasi!");
            loadDataBelumBayar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTableMenungguPembayaran.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data!");
            return;
        }

        int konfirmasi = JOptionPane.showConfirmDialog(this, "Yakin hapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (konfirmasi != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            Connection conn = Koneksidatabase.getConnection();
            String sql = "DELETE FROM pesanan WHERE nama_pemesan=? AND status_pembayaran='Menunggu Pembayaran'";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, jTableMenungguPembayaran.getValueAt(selectedRow, 0).toString());
            pst.executeUpdate();

            loadDataBelumBayar();
            JOptionPane.showMessageDialog(this, "Data dihapus!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void CariNamaPemesanTxtActionPerformed(java.awt.event.ActionEvent evt) {
        cariDataPemesan();
    }

    private void CariButtonActionPerformed(java.awt.event.ActionEvent evt) {
        cariDataPemesan();
    }

    private void RefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {
        loadDataBelumBayar();
        CariNamaPemesanTxt.setText("");
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CariButton;
    private javax.swing.JTextField CariNamaPemesanTxt;
    private javax.swing.JButton HapusButton;
    private javax.swing.JButton KonfirmasiButton;
    private javax.swing.JButton RefreshButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMenungguPembayaran;
    // End of variables declaration                   
}