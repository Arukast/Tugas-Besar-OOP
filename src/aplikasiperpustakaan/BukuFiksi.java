/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tubagus Alta
 */
public class BukuFiksi extends Buku {
    private String subGenreBuku;
//    KoneksiDB kdb = new KoneksiDB();

    
    public BukuFiksi(String idBuku, String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku, String subGenreBuku){
        super(judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
        this.subGenreBuku = subGenreBuku;
    }

    public void setSubGenreBuku(String subGenreBuku) {
        this.subGenreBuku = subGenreBuku;
    }

    public String getSubGenreBuku() {
        return subGenreBuku;
    }
    
    public void tampilkanDetailBukuFiksi()throws SQLException {
                // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String querySQL = "";
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
    public boolean createData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO bukuFiksi(idBuku, subGenreBuku) VALUES (?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, super.getIdBuku());
            ps.setString(2, this.subGenreBuku);
            
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
        super.readData("SELECT * FROM buku INNER JOIN bukuFiksi ON buku.idBuku = bukuFiksi.idBuku");
    }
    
    @Override
    public boolean updateData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "UPDATE bukuFiksi SET subGenreBuku = ? WHERE idBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.subGenreBuku);
            ps.setString(2, super.getIdBuku());
            
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
