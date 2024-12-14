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
public class PinjamBuku implements DataManajemen {
    private String idPeminjamanBuku;
    private String tanggalPeminjamanBuku;
    private String tenggatTanggalPengembalianBuku;
    private boolean bukuSudahkembali = false;
    private String tanggalPengembalianBuku;
    KoneksiDB kdb = new KoneksiDB();


    public PinjamBuku(String idPinjamBuku, String tanggalPinjamBuku, String tenggatTanggalPengembalianBuku, boolean bukuSudahkembali, String tanggalPengembalianBuku) {
        this.idPeminjamanBuku = idPinjamBuku;
        this.tanggalPeminjamanBuku = tanggalPinjamBuku;
        this.tenggatTanggalPengembalianBuku = tenggatTanggalPengembalianBuku;
        this.bukuSudahkembali = bukuSudahkembali;
        this.tanggalPengembalianBuku = tanggalPengembalianBuku;
    }

    public void setIdPeminjamanBuku(String idPeminjamanBuku) {
        this.idPeminjamanBuku = idPeminjamanBuku;
    }

    public void setTanggalPeminjamanBuku(String tanggalPeminjamanBuku) {
        this.tanggalPeminjamanBuku = tanggalPeminjamanBuku;
    }

    public void setTenggatTanggalPengembalianBuku(String tenggatTanggalPengembalianBuku) {
        this.tenggatTanggalPengembalianBuku = tenggatTanggalPengembalianBuku;
    }

    public void setTanggalPengembalianBuku(String tanggalPengembalianBuku) {
        this.tanggalPengembalianBuku = tanggalPengembalianBuku;
    }

    public void setBukuSudahkembali(boolean bukuSudahkembali) {
        this.bukuSudahkembali = bukuSudahkembali;
    }

    public String getIdPeminjamanBuku() {
        return idPeminjamanBuku;
    }

    public String getTanggalPeminjamanBuku() {
        return tanggalPeminjamanBuku;
    }

    public String getTenggatTanggalPengembalianBuku() {
        return tenggatTanggalPengembalianBuku;
    }

    public String getTanggalPengembalianBuku() {
        return tanggalPengembalianBuku;
    }
    
    public boolean getBukuSudahkembali() {
        return bukuSudahkembali;
    }

    @Override
    public boolean createData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO pinjamBuku(tanggalPeminjamanBuku, tenggatTanggalPengembalianBuku, bukuSudahKembali, tanggalPengembalianBuku) VALUES (?,?,?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.tanggalPeminjamanBuku);
            ps.setString(2, this.tenggatTanggalPengembalianBuku);
            ps.setBoolean(3, this.bukuSudahkembali);
            ps.setString(4, this.tanggalPengembalianBuku);

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
        
        String querySQL = "SELECT * FROM pinjamBuku";
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
        
        String querySQL = "UPDATE pinjamBuku SET tanggalPeminjamanBuku = ?, tenggatTanggalPengembalianBuku = ?, bukuSudahKembali = ?, tanggalPengembalianBuku = ? WHERE idPeminjamanBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.tanggalPeminjamanBuku);
            ps.setString(2, this.tenggatTanggalPengembalianBuku);
            ps.setBoolean(3, this.bukuSudahkembali);
            ps.setString(4, this.tanggalPengembalianBuku);
            ps.setString(5, this.idPeminjamanBuku);
            
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
        
        String querySQL = "DELETE FROM pinjamBuku WHERE idPeminjamanBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.idPeminjamanBuku);
            
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
