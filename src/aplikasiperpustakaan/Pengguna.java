/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Tubagus Alta
 */
public abstract class Pengguna implements DataManajemen{
    private String nomorIdentifikasiPengguna;
    private String namaPengguna;
    private String kontakPengguna;
    KoneksiDB kdb = new KoneksiDB();

    
    public abstract void tampilkanDataPengguna();

    public Pengguna(String nomorIdentifikasi, String namaPengguna, String kontakPengguna) {
        this.nomorIdentifikasiPengguna = nomorIdentifikasi;
        this.namaPengguna = namaPengguna;
        this.kontakPengguna = kontakPengguna;
    }

    public void setNomorIdentifikasiPengguna(String nomorIdentifikasiPengguna) {
        this.nomorIdentifikasiPengguna = nomorIdentifikasiPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public void setKontakPengguna(String kontakPengguna) {
        this.kontakPengguna = kontakPengguna;
    }

    public String getNomorIdentifikasiPengguna() {
        return nomorIdentifikasiPengguna;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public String getKontakPengguna() {
        return kontakPengguna;
    }

    @Override
    public boolean createData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO pengguna(nomorIdentifikasiPengguna, namaPengguna, kontakPengguna) VALUES (?,?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.nomorIdentifikasiPengguna);
            ps.setString(2, this.namaPengguna);
            ps.setString(3, this.kontakPengguna);

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
    public void readData(String query) throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String querySQL = query;
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            rs = ps.executeQuery();
            
            //TODO: Ada lanjutan
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
    }


    public void readData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String querySQL = "SELECT * FROM pengguna";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            rs = ps.executeQuery();
            
            //TODO: Ada lanjutan
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
    }
  
    @Override
    public boolean updateData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "UPDATE pengguna SET namaPengguna = ?, kontakPengguna = ? WHERE nomorIdentifikasiPengguna = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.namaPengguna);
            ps.setString(2, this.kontakPengguna);
            ps.setString(3, this.nomorIdentifikasiPengguna);
            
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
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "DELETE FROM pengguna WHERE nomorIdentifikasiPengguna = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.nomorIdentifikasiPengguna);
            
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
}
