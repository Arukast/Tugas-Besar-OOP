/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tubagus Alta
 */
public class Anggota extends Pengguna{
    private int idAnggota;
    private String statusAnggota = "Aktif";

    public Anggota() {
    }
    
    public Anggota(String namaPengguna, String kontakPengguna) {
        super(namaPengguna, kontakPengguna);
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public void setStatusAnggota(String statusAnggota) {
        this.statusAnggota = statusAnggota;
    }

    public int getIdAnggota() {
        return idAnggota;
    }
    
    public String getStatusAnggota() {
        return statusAnggota;
    }

    @Override
    public void tampilkanDataPengguna() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNomorIdentifikasiPengguna(int nomorIdentifikasi) {
        super.setNomorIdentifikasiPengguna(nomorIdentifikasi);
    }

    @Override
    public void setNamaPengguna(String namaPengguna) {
        super.setNamaPengguna(namaPengguna);
    }

    @Override
    public void setKontakPengguna(String kontakPengguna) {
        super.setKontakPengguna(kontakPengguna);
    }

    @Override
    public int getNomorIdentifikasiPengguna() {
        return super.getNomorIdentifikasiPengguna();
    }

    @Override
    public String getNamaPengguna() {
        return super.getNamaPengguna(); 
    }

    @Override
    public String getKontakPengguna() {
        return super.getKontakPengguna();
    }

    @Override
    public int createData() throws SQLException {
        // input data ke database
        super.createData();
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO anggota(statusAnggota, nomorIdentifikasiPengguna) VALUES (?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.statusAnggota);
            ps.setInt(2, super.getNomorIdentifikasiPengguna());

            rowAffect = ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        
        if (rowAffect > 0) {
            return 1;
        } else {
            return 1;
        }
    }

    @Override
    public List<Object[]> readData() throws SQLException {
        Connection dbConnection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Object[]> dataList = new ArrayList<>();
        
        String querySQL = "SELECT * FROM pengguna INNER JOIN anggota ON pengguna.nomorIdentifikasiPengguna = anggota.nomorIdentifikasiPengguna";
        
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                String namaPengguna = rs.getString("namaPengguna");
                String kontakPengguna = rs.getString("kontakPengguna");
                String statusAnggota = rs.getString("statusAnggota");
                
                dataList.add(new Object[]{namaPengguna, kontakPengguna, statusAnggota});
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        return dataList;
    }


  
    @Override
    public boolean updateData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "UPDATE anggota SET statusAnggota = ? WHERE idAnggota = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.statusAnggota);
            ps.setInt(2, this.idAnggota);
                        
            rowAffect = ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        
        if (rowAffect > 0) {
            return true;
        } else {
            return false;
        }       
    }
    
    @Override
    public boolean deleteData() throws SQLException {
        return super.deleteData();
    }
}
