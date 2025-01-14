 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tubagus Alta
 */
public class PeminjamanBukuPage extends javax.swing.JFrame {
    PinjamBuku pinjamBuku = new PinjamBuku();
    App app = new App();
    int idPeminjaman;
    /**
     * Creates new form PeminjamanBukuPage
     */
    public PeminjamanBukuPage() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            tampilListBukuTable();
        } catch (SQLException ex) {
            Logger.getLogger(BukuPage.class.getName()).log(Level.SEVERE, null,ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPeminjamanBukuTable = new javax.swing.JTable();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tanggalKembaliTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idAnggotaTF = new javax.swing.JTextField();
        idPetugasTF = new javax.swing.JTextField();
        idBukuTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listPeminjamanBukuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Peminjaman", "Id Petugas", "Id Anggota", "Nama Anggota", "Id Buku", "Judul", "Tanggal Peminjaman", "Tanggal Batas", "Tanggal Kembali"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listPeminjamanBukuTable.setColumnSelectionAllowed(true);
        listPeminjamanBukuTable.getTableHeader().setReorderingAllowed(false);
        listPeminjamanBukuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPeminjamanBukuTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listPeminjamanBukuTable);
        listPeminjamanBukuTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Id Anggota");

        jLabel2.setText("Id Buku");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Tanggal Kembali");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Peminjaman Buku");

        jLabel7.setText("Id Petugas");

        idPetugasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPetugasTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backButton)
                .addGap(212, 212, 212)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(idPetugasTF, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(tanggalKembaliTF, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idAnggotaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(idBukuTF))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(87, 87, 87)))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(backButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idAnggotaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBukuTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalKembaliTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPetugasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(createButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listPeminjamanBukuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPeminjamanBukuTableMouseClicked
        // TODO add your handling code here:
        int row = listPeminjamanBukuTable.getSelectedRow();
        
        if (row >= 0) {
            int idPeminjaman = (int) listPeminjamanBukuTable.getValueAt(row, 0);
            int idAnggota = (int) listPeminjamanBukuTable.getValueAt(row, 2);
            int idBuku = (int) listPeminjamanBukuTable.getValueAt(row, 4);
            int idPetugas = (int) listPeminjamanBukuTable.getValueAt(row, 1);
            Object tanggalKembaliObj = listPeminjamanBukuTable.getValueAt(row, 8);
            if (tanggalKembaliObj != null && tanggalKembaliObj instanceof Date) {
                Date tanggalKembali = (Date) tanggalKembaliObj;

            // Format tanggal ke String
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String tanggalKembaliString = formatter.format(tanggalKembali);

            // Set nilai ke JTextField
                tanggalKembaliTF.setText(tanggalKembaliString);
            } else {
                tanggalKembaliTF.setText(""); // Kosongkan jika tidak ada nilai
            }
            
            idAnggotaTF.setText(String.valueOf(idAnggota));
            idBukuTF.setText(String.valueOf(idBuku));
            idPetugasTF.setText(String.valueOf(idPetugas));
            setIdPeminjaman(idPeminjaman);
        }
    }//GEN-LAST:event_listPeminjamanBukuTableMouseClicked

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        try {
            ArrayList<String> textFields = new ArrayList<>();
            String idAnggotaString = idAnggotaTF.getText();
            textFields.add(idAnggotaString);
            String idBukuString = idBukuTF.getText();
            textFields.add(idBukuString);
            String idPetugasString = idPetugasTF.getText();
            textFields.add(idPetugasString);

            if (App.areAnyFieldsEmpty(textFields)) {
                    JOptionPane.showMessageDialog(this, "Semua Field harus diisi kecuali Text Field Tanggal Kembali!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int idAnggota = Integer.parseInt(idAnggotaString);
                int idBuku = Integer.parseInt(idBukuString);
                int idPetugas = Integer.parseInt(idPetugasString);
                String tanggalKembali = tanggalKembaliTF.getText();

                PinjamBuku pinjamBuku = new PinjamBuku(idPeminjaman, tanggalKembali, idAnggota, idBuku, idPetugas);

                try {
                    if (pinjamBuku.createData() == 1) {
                        JOptionPane.showMessageDialog(this, "Peminjaman berhasil ditambahkan!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal menambahkan peminjaman! Pastikan semua Text Field terisi dengan benar dan format Tanggal adalah YYYY-MM-DD", "Error", JOptionPane.ERROR_MESSAGE);
                    }    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Gagal menambahkan peminjaman! Pastikan semua Text Field terisi dengan benar dan format Tanggal adalah YYYY-MM-DD", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(BukuPage.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    new PeminjamanBukuPage().setVisible(true);
                    dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tolong masukkan angka dalam Text Field Id Anggota, Id buku, Id Petugas, dan Tanggal Kembali!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        try {
            ArrayList<String> textFields = new ArrayList<>();
            String idAnggotaString = idAnggotaTF.getText();
            textFields.add(idAnggotaString);
            String idBukuString = idBukuTF.getText();
            textFields.add(idBukuString);
            String idPetugasString = idPetugasTF.getText();
            textFields.add(idPetugasString);

            if (App.areAnyFieldsEmpty(textFields)) {
                    JOptionPane.showMessageDialog(this, "Semua Field harus diisi kecuali Text Field Tanggal Kembali!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int idAnggota = Integer.parseInt(idAnggotaString);
                int idBuku = Integer.parseInt(idBukuString);
                int idPetugas = Integer.parseInt(idPetugasString);
                String tanggalKembali = tanggalKembaliTF.getText();

                PinjamBuku pinjamBuku = new PinjamBuku(idPeminjaman, tanggalKembali, idAnggota, idBuku, idPetugas);

                try {
                    if (pinjamBuku.updateData()) {
                        JOptionPane.showMessageDialog(this, "Peminjaman berhasil diupdate!");;
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal mengupdate peminjaman! Pastikan semua Text Field terisi dengan benar dan format Tanggal adalah YYYY-MM-DD", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Gagal mengupdate peminjaman! Pastikan semua Text Field terisi dengan benar dan format Tanggal adalah YYYY-MM-DD", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(BukuPage.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    new PeminjamanBukuPage().setVisible(true);
                    dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tolong masukkan angka dalam Text Field Id Anggota, Id buku, Id Petugas, dan Tanggal Kembali!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new MenuPilihanPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void idPetugasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPetugasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPetugasTFActionPerformed
    
    public void tampilListBukuTable() throws SQLException{
        DefaultTableModel modelTable = (DefaultTableModel) listPeminjamanBukuTable.getModel();
        modelTable.setRowCount(0);
        
        List<Object[]> dataList = pinjamBuku.readData();
        
        for (Object[] rowData : dataList) {
            modelTable.addRow(rowData);
        }
    }
    
    public void setIdPeminjaman(int idPeminjaman){
        this.idPeminjaman = idPeminjaman;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBukuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBukuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBukuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeminjamanBukuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeminjamanBukuPage().setVisible(true);
                new PeminjamanBukuPage().setUndecorated(true);
                new PeminjamanBukuPage().setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField idAnggotaTF;
    private javax.swing.JTextField idBukuTF;
    private javax.swing.JTextField idPetugasTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listPeminjamanBukuTable;
    private javax.swing.JTextField tanggalKembaliTF;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
