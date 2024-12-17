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
public class Buku implements DataManajemen {
    private int idBuku;
    private String judulBuku;
    private String penulisBuku;
    private String genreBuku;
    private String bahasaBuku;
    private int jumlahBuku;
    KoneksiDB kdb = new KoneksiDB();

    public Buku() {
    }
    
    public Buku(String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku){
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.genreBuku = genreBuku;
        this.bahasaBuku = bahasaBuku;
        this.jumlahBuku = jumlahBuku;
    }

    public Buku(int idBuku, String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.genreBuku = genreBuku;
        this.bahasaBuku = bahasaBuku;
        this.jumlahBuku = jumlahBuku;
    }
    
    

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setPenulisBuku(String penulisBuku) {
        this.penulisBuku = penulisBuku;
    }

    public void setGenreBuku(String genreBuku) {
        this.genreBuku = genreBuku;
    }

    public void setBahasaBuku(String bahasaBuku) {
        this.bahasaBuku = bahasaBuku;
    }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPenulisBuku() {
        return penulisBuku;
    }

    public String getGenreBuku() {
        return genreBuku;
    }

    public String getBahasaBuku() {
        return bahasaBuku;
    }

    public int getJumlahBuku() {
        return jumlahBuku;
    }
    
    @Override  
    public int createData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        ResultSet generatedKeys = null;
        int rowAffect = 0;
        int generatedId = -1;
        
        String querySQL = "INSERT INTO buku(judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku) VALUES (?,?,?,?,?)";
        
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, this.judulBuku);
            ps.setString(2, this.penulisBuku);
            ps.setString(3, this.genreBuku);
            ps.setString(4, this.bahasaBuku);
            ps.setInt(5, this.jumlahBuku);
            
            rowAffect = ps.executeUpdate();

            if (rowAffect > 0) {
                generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    generatedId = generatedKeys.getInt(1);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (ps != null) ps.close();
            if (generatedKeys != null) generatedKeys.close();
        }
        return generatedId;
    }

    @Override
    public List<Object[]> readData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Object[]> dataList = new ArrayList<>();
        
        String querySQL = "SELECT * FROM buku";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                int idBuku = rs.getInt("idBuku");
                String judulBuku = rs.getString("judulBuku");
                String penulisBuku = rs.getString("penulisBuku");
                String genreBuku = rs.getString("genreBuku");
                String bahasaBuku = rs.getString("bahasaBuku");
                int jumlahBuku = rs.getInt("jumlahBuku");
                
                dataList.add(new Object[]{idBuku, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku});
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
        
        String querySQL = "UPDATE buku SET judulBuku = ?, penulisBuku = ?, genreBuku = ?, bahasaBuku = ?, jumlahBuku = ? WHERE idBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.judulBuku);
            ps.setString(2, this.penulisBuku);
            ps.setString(3, this.genreBuku);
            ps.setString(4, this.bahasaBuku);
            ps.setInt(5, this.jumlahBuku);
            ps.setInt(6, this.idBuku);
            
            rowAffect = ps.executeUpdate();
            System.out.println("test" + this.idBuku);
            
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
        
        String querySQL = "DELETE FROM buku WHERE idBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setInt(1, this.idBuku);
            
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
