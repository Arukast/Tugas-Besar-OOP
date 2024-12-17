/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tubagus Alta
 */
public abstract class Pengguna implements DataManajemen{
    private int nomorIdentifikasiPengguna;
    private String namaPengguna;
    private String kontakPengguna;
    KoneksiDB kdb = new KoneksiDB();

    
    public abstract void tampilkanDataPengguna();
    
    public Pengguna(){
    }

    public Pengguna(String namaPengguna, String kontakPengguna) {
        this.namaPengguna = namaPengguna;
        this.kontakPengguna = kontakPengguna;
    }

    public void setNomorIdentifikasiPengguna(int nomorIdentifikasiPengguna) {
        this.nomorIdentifikasiPengguna = nomorIdentifikasiPengguna;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public void setKontakPengguna(String kontakPengguna) {
        this.kontakPengguna = kontakPengguna;
    }

    public int getNomorIdentifikasiPengguna() {
        return nomorIdentifikasiPengguna;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public String getKontakPengguna() {
        return kontakPengguna;
    }

    @Override
    public int createData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        ResultSet generatedKeys = null;
        int generatedId = -1;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO pengguna(namaPengguna, kontakPengguna) VALUES (?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, this.namaPengguna);
            ps.setString(2, this.kontakPengguna);

            rowAffect = ps.executeUpdate();
            generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                generatedId = generatedKeys.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (ps != null) ps.close();
            if (generatedKeys != null) generatedKeys.close();
        }
        
//        if (rowAffect > 0) {
//            return generatedId;
//        } else {
//            return 0;
//        }
        return generatedId;
    }
    @Override
    public List<Object[]> readData() throws SQLException {
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
        return null;
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
            ps.setInt(3, this.nomorIdentifikasiPengguna);
            
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
        
        String querySQL = "DELETE FROM pengguna WHERE nomorIdentifikasiPengguna = ";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setInt(1, this.nomorIdentifikasiPengguna);
            
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
