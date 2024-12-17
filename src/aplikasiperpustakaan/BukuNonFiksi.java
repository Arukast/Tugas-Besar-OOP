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
public class BukuNonFiksi extends Buku {
    private String topikBuku;
    
//    public BukuNonFiksi(String idBuku, String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku, String topikBuku){
//        super(judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
//        this.topikBuku = topikBuku;
//    }

    public void setTopikBuku(String topikBuku) {
        this.topikBuku = topikBuku;
    }

    public String getTopikBuku() {
        return topikBuku;
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
        
        String querySQL = "INSERT INTO bukuNonFiksi(idBuku, topikBuku) VALUES (?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, super.getIdBuku());
            ps.setString(2, this.topikBuku);
            
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
        super.readData("SELECT * FROM buku INNER JOIN bukuNonFiksi ON buku.idBuku = bukuNonFiksi.idBuku");
    }
    
    @Override
    public boolean updateData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "UPDATE bukuNonFiksi SET topikBuku = ? WHERE idBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.topikBuku);
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
