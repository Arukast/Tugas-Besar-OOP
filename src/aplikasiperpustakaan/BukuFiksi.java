/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

import com.mysql.cj.xdevapi.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tubagus Alta
 */
public class BukuFiksi extends Buku {
    private String subGenreBuku;

    public BukuFiksi() {
    }
    
    public BukuFiksi(String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku, String subGenreBuku){
        super(judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
        this.subGenreBuku = subGenreBuku;
    }

    public BukuFiksi(int idBuku, String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku, String subGenreBuku) {
        super(idBuku, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
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
    public int createData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO bukuFiksi(idBuku, subGenreBuku) VALUES (?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setInt(1, super.getIdBuku());
            ps.setString(2, this.subGenreBuku);
            
            rowAffect = ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        
        if (rowAffect > 0) {
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public List<Object[]> readData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Object[]> dataList = new ArrayList<>();
        
        String querySQL = "SELECT * FROM buku INNER JOIN bukufiksi ON buku.idBuku = bukuFiksi.idBuku";
        
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int idBuku = rs.getInt("idBuku");
                String judulBuku = rs.getString("judulBuku");
                String penulisBuku = rs.getString("penulisBuku");
                String bahasaBuku = rs.getString("bahasaBuku");
                String subGenrebuku = rs.getString("subGenreBuku");
                int jumlahBuku = rs.getInt("jumlahBuku");
                
                dataList.add(new Object[]{idBuku, judulBuku, penulisBuku, subGenrebuku, bahasaBuku, jumlahBuku});
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
        
        String querySQL = "UPDATE bukuFiksi SET subGenreBuku = ? WHERE idBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.subGenreBuku);
            ps.setInt(2, super.getIdBuku());
            
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
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "DELETE FROM bukufiksi WHERE idBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setInt(1, super.getIdBuku());
            
            rowAffect = ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        return super.deleteData();
    }
}
