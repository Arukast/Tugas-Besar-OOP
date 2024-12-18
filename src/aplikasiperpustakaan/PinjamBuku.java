/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tubagus Alta
 */
public class PinjamBuku implements DataManajemen {
    private int idPeminjamanBuku;
    private String tanggalPeminjamanBuku;
    private String tenggatTanggalPengembalianBuku;
    private String tanggalPengembalianBuku;
    Anggota anggota = new Anggota();
    Buku buku = new Buku();
    Petugas petugas = new Petugas();
    KoneksiDB kdb = new KoneksiDB();

    public PinjamBuku() {
    }

    public PinjamBuku(String tanggalPengembalianBuku, int idAnggota, int idBuku, int idPetugas) {
        anggota.setIdAnggota(idAnggota);
        buku.setIdBuku(idBuku);
        petugas.setIdPetugas(idPetugas);
        this.tanggalPengembalianBuku = tanggalPengembalianBuku;
    }

    public void setIdPeminjamanBuku(int idPeminjamanBuku) {
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

    public int getIdPeminjamanBuku() {
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

    @Override
    public int createData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO pinjamBuku(idAnggota, idBuku, idPetugas, tanggalPeminjamanBuku, tenggatTanggalPengembalianBuku, tanggalPengembalianBuku) VALUES (?,?,?,?,?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setInt(1, anggota.getIdAnggota());
            System.out.println(anggota.getIdAnggota());
            ps.setInt(2, buku.getIdBuku());
            System.out.println(buku.getIdBuku());
            ps.setInt(3, petugas.getIdPetugas());
            ps.setDate(4, Date.valueOf(LocalDate.now()));
            ps.setDate(5, Date.valueOf(LocalDate.now().plusDays(7)));
            ps.setDate(6, Date.valueOf(LocalDate.parse(this.tanggalPengembalianBuku)));

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
        
        String querySQL = "UPDATE pinjamBuku SET idAnggota = ?, idBuku = ?, idPetugas = ?, tanggalPengembalianBuku = ? WHERE idPeminjamanBuku = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.tanggalPeminjamanBuku);
            ps.setString(2, this.tenggatTanggalPengembalianBuku);
            ps.setString(3, this.tanggalPengembalianBuku);
            ps.setInt(4, this.idPeminjamanBuku);
            
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
            ps.setInt(1, this.idPeminjamanBuku);
            
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
