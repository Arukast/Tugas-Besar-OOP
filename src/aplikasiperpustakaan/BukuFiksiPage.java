/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tubagus Alta
 */
public class BukuFiksiPage extends javax.swing.JFrame {
    BukuFiksi bukuFiksi = new BukuFiksi();
    App app = new App();
    int idBukuUpdate;
    /**
     * Creates new form BukuFiksiPage
     */
    public BukuFiksiPage() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            tampilListBukuTable();
        } catch (SQLException ex) {
            Logger.getLogger(BukuPage.class.getName()).log(Level.SEVERE, null,ex);
        }
        fiksiRB.setSelected(true);
        fiksiRB.setEnabled(false);
        nonFiksiRB.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genreButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listBukuFiksiTable = new javax.swing.JTable();
        tampilkanBukuButton = new javax.swing.JButton();
        tampilkanBukuNonFiksiButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        judulTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        penulisTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fiksiRB = new javax.swing.JRadioButton();
        nonFiksiRB = new javax.swing.JRadioButton();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bahasaTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jumlahTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        subGenreTopikTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listBukuFiksiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Buku", "Judul", "Penulis", "Sub Genre", "Bahasa", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listBukuFiksiTable.setColumnSelectionAllowed(true);
        listBukuFiksiTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listBukuFiksiTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listBukuFiksiTable);
        listBukuFiksiTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (listBukuFiksiTable.getColumnModel().getColumnCount() > 0) {
            listBukuFiksiTable.getColumnModel().getColumn(5).setMaxWidth(50);
        }

        tampilkanBukuButton.setText("Tampilkan Buku ");
        tampilkanBukuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilkanBukuButtonActionPerformed(evt);
            }
        });

        tampilkanBukuNonFiksiButton.setText("Tampilkan Buku Non-Fiksi");
        tampilkanBukuNonFiksiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilkanBukuNonFiksiButtonActionPerformed(evt);
            }
        });

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

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Judul");

        jLabel2.setText("Penulis");

        jLabel3.setText("Genre");

        genreButtonGroup.add(fiksiRB);
        fiksiRB.setText("Fiksi");

        genreButtonGroup.add(nonFiksiRB);
        nonFiksiRB.setText("Non-Fiksi");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Bahasa");

        jLabel5.setText("Data Menu Buku Fiksi");

        jLabel6.setText("Jumlah");

        jLabel7.setText("Sub Genre / Topik");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tampilkanBukuButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tampilkanBukuNonFiksiButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fiksiRB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nonFiksiRB))
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(penulisTF)
                                    .addComponent(judulTF))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel7)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bahasaTF)
                            .addComponent(jumlahTF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addGap(18, 18, 18)
                                .addComponent(updateButton)
                                .addGap(18, 18, 18)
                                .addComponent(createButton))
                            .addComponent(subGenreTopikTF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(tampilkanBukuNonFiksiButton)
                    .addComponent(tampilkanBukuButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(judulTF, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penulisTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiksiRB)
                            .addComponent(nonFiksiRB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subGenreTopikTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bahasaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jumlahTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createButton)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(deleteButton)
                                .addComponent(updateButton))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
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

    private void listBukuFiksiTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBukuFiksiTableMouseClicked
        // TODO add your handling code here:
        fiksiRB.setEnabled(true);
        nonFiksiRB.setEnabled(true);
        int row = listBukuFiksiTable.getSelectedRow();
        
        if (row >= 0) {
            int idBuku = (int) listBukuFiksiTable.getValueAt(row, 0);
            String judulBuku = listBukuFiksiTable.getValueAt(row, 1).toString();
            String penulisBuku = listBukuFiksiTable.getValueAt(row, 2).toString();
            String subGenreTopikBuku = listBukuFiksiTable.getValueAt(row, 3).toString();
            String bahasaBuku = listBukuFiksiTable.getValueAt(row, 4).toString();
            int jumlahBuku = (int) listBukuFiksiTable.getValueAt(row, 5);
            
            judulTF.setText(judulBuku);
            penulisTF.setText(penulisBuku);
            subGenreTopikTF.setText(subGenreTopikBuku);
            bahasaTF.setText(bahasaBuku);
            jumlahTF.setText(String.valueOf(jumlahBuku));
            setIdBuku(idBuku);
        }
    }//GEN-LAST:event_listBukuFiksiTableMouseClicked

    private void tampilkanBukuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilkanBukuButtonActionPerformed
        // TODO add your handling code here:
        new BukuPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_tampilkanBukuButtonActionPerformed

    private void tampilkanBukuNonFiksiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilkanBukuNonFiksiButtonActionPerformed
        // TODO add your handling code here:
        new BukuNonFiksiPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_tampilkanBukuNonFiksiButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new MenuPilihanPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String judulBuku = judulTF.getText();
        String penulisBuku = penulisTF.getText();
        String genreBuku = app.getSelectedButtonText(genreButtonGroup);
        String subGenreTopikBuku = subGenreTopikTF.getText();
        String bahasaBuku = bahasaTF.getText();
        int jumlahBuku = Integer.parseInt(jumlahTF.getText());

        Buku buku = new Buku(idBukuUpdate, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
        BukuFiksi bukuFiksi = new BukuFiksi(idBukuUpdate, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku, subGenreTopikBuku);

        try {
            bukuFiksi.deleteData();
            buku.deleteData();
            JOptionPane.showMessageDialog(this, "Buku berhasil dihapus!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal menghapus buku.", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(BukuPage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            new BukuFiksiPage().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        try {
            ArrayList<String> textFields = new ArrayList<>();
            String judulBuku = judulTF.getText();
            textFields.add(judulBuku);
            String penulisBuku = penulisTF.getText();
            textFields.add(penulisBuku);
            String genreBuku = app.getSelectedButtonText(genreButtonGroup);
            String subGenreTopikBuku = subGenreTopikTF.getText();
            textFields.add(subGenreTopikBuku);
            String bahasaBuku = bahasaTF.getText();
            textFields.add(bahasaBuku);
            String stringJumlahBuku = jumlahTF.getText();
            textFields.add(stringJumlahBuku);

            if (App.areAnyFieldsEmpty(textFields) || genreButtonGroup.getSelection() == null) {
                JOptionPane.showMessageDialog(this, "Semua Field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int jumlahBuku = Integer.parseInt(stringJumlahBuku);
                Buku buku = new Buku(idBukuUpdate, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
                BukuFiksi bukuFiksi = new BukuFiksi(idBukuUpdate, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku, subGenreTopikBuku);
                if (genreBuku == "Fiksi") {
                    try {
                        buku.updateData();
                        if (bukuFiksi.updateData()) {
                            JOptionPane.showMessageDialog(this, "Buku berhasil diupdate!");
                        } else {
                            JOptionPane.showMessageDialog(this, "Gagal mengupdate buku!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Gagal mengupdate buku.", "Error", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(BukuPage.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        new BukuFiksiPage().setVisible(true);
                        dispose();
                    }
                } else {
                    try {
                        buku.updateData();
                        BukuNonFiksi bukuNonFiksi = new BukuNonFiksi(idBukuUpdate, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku, subGenreTopikBuku);
                        if (bukuNonFiksi.createData() == 1) {
                            JOptionPane.showMessageDialog(this, "Buku berhasil diupdate!");
                            bukuFiksi.deleteData();
                        } else {
                            JOptionPane.showMessageDialog(this, "Gagal mengupdate buku!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Gagal mengupdate buku!", "Error", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(BukuPage.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        new BukuFiksiPage().setVisible(true);
                        dispose();
                    }
                }
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tolong masukkan angka dalam text field Jumlah Buku!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        try {
            ArrayList<String> textFields = new ArrayList<>();
            String judulBuku = judulTF.getText();
            textFields.add(judulBuku);
            String penulisBuku = penulisTF.getText();
            textFields.add(penulisBuku);
            String genreBuku = app.getSelectedButtonText(genreButtonGroup);
            String subGenreTopikBuku = subGenreTopikTF.getText();
            textFields.add(subGenreTopikBuku);
            String bahasaBuku = bahasaTF.getText();
            textFields.add(bahasaBuku);
            String stringJumlahBuku = jumlahTF.getText();
            textFields.add(stringJumlahBuku);

            if (App.areAnyFieldsEmpty(textFields) || genreButtonGroup.getSelection() == null) {
                JOptionPane.showMessageDialog(this, "Semua Field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int jumlahBuku = Integer.parseInt(stringJumlahBuku);
                Buku buku = new Buku(judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
                try {
                    int idBukuBaru = buku.createData();
                    if (idBukuBaru != -1) {
                        BukuFiksi bukuFiksi = new BukuFiksi(judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku, subGenreTopikBuku);
                        bukuFiksi.setIdBuku(idBukuBaru);
                        bukuFiksi.createData();

                        JOptionPane.showMessageDialog(this, "Buku berhasil ditambahkan!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal menambahkan buku!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BukuPage.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    new BukuFiksiPage().setVisible(true);
                    dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tolong masukkan angka dalam text field Jumlah Buku!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    public void tampilListBukuTable() throws SQLException{
        DefaultTableModel modelTable = (DefaultTableModel) listBukuFiksiTable.getModel();
        modelTable.setRowCount(0);
        
        List<Object[]> dataList = bukuFiksi.readData();
        
        for (Object[] rowData : dataList) {
            modelTable.addRow(rowData);
        }
    }
    
    public void setIdBuku(int idBukuInput){
        this.idBukuUpdate = idBukuInput;
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
            java.util.logging.Logger.getLogger(BukuFiksiPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BukuFiksiPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BukuFiksiPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BukuFiksiPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BukuFiksiPage().setVisible(true);
//                new BukuFiksiPage().setUndecorated(true);
//                new BukuFiksiPage().setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bahasaTF;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JRadioButton fiksiRB;
    private javax.swing.ButtonGroup genreButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judulTF;
    private javax.swing.JTextField jumlahTF;
    private javax.swing.JTable listBukuFiksiTable;
    private javax.swing.JRadioButton nonFiksiRB;
    private javax.swing.JTextField penulisTF;
    private javax.swing.JTextField subGenreTopikTF;
    private javax.swing.JButton tampilkanBukuButton;
    private javax.swing.JButton tampilkanBukuNonFiksiButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
