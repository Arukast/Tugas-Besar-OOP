/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tubagus Alta
 */
public class BukuNonFiksi extends Buku {
    private String topikBuku;

    public BukuNonFiksi() {
    }
    
    public BukuNonFiksi(String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku, String topikBuku){
        super(judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
        this.topikBuku = topikBuku;
    }

    public BukuNonFiksi(int idBuku, String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku, String topikBuku) {
        super(idBuku, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
        this.topikBuku = topikBuku;
    }
    
    

    public void setTopikBuku(String topikBuku) {
        this.topikBuku = topikBuku;
    }

    public String getTopikBuku() {
        return topikBuku;
    }
    
    @Override
    public int createData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO bukuNonFiksi(idBuku, topikBuku) VALUES (?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setInt(1, super.getIdBuku());
            ps.setString(2, this.topikBuku);
            
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
        Connection dbConnection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Object[]> dataList = new ArrayList<>();
        
        String querySQL = "SELECT * FROM buku INNER JOIN bukunonfiksi ON buku.idBuku = bukunonfiksi.idBuku";
        
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
                String topikBuku = rs.getString("topikBuku");
                int jumlahBuku = rs.getInt("jumlahBuku");
                
                dataList.add(new Object[]{idBuku, judulBuku, penulisBuku, topikBuku, bahasaBuku, jumlahBuku});
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
        
        String querySQL = "UPDATE bukuNonFiksi SET topikBuku = ? WHERE idBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.topikBuku);
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
        
        String querySQL = "DELETE FROM bukunonfiksi WHERE idBuku = ?";
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
