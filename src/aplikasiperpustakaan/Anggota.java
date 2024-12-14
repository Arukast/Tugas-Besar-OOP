/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Tubagus Alta
 */
public class Anggota extends Pengguna{
    private String idAnggota;
    private boolean statusAnggota;

    public Anggota(String idAnggota, boolean statusAnggota, String nomorIdentifikasi, String namaPengguna, String kontakPengguna) {
        super(nomorIdentifikasi, namaPengguna, kontakPengguna);
        this.idAnggota = idAnggota;
        this.statusAnggota = statusAnggota;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public void setStatusAnggota(boolean statusAnggota) {
        this.statusAnggota = statusAnggota;
    }

    public String getIdAnggota() {
        return idAnggota;
    }
    
    public boolean getStatusAnggota() {
        return statusAnggota;
    }

    @Override
    public void tampilkanDataPengguna() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNomorIdentifikasiPengguna(String nomorIdentifikasi) {
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
    public String getNomorIdentifikasiPengguna() {
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
    public boolean createData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO anggota(idAnggota, statusAnggota) VALUES (?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.idAnggota);
            ps.setBoolean(2, this.statusAnggota);

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
        super.readData("SELECT * FROM pengguna INNER JOIN anggota ON pengguna.nomorIdentifikasiPengguna = anggota.nomorIdentifikasiPengguna");
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
            ps.setBoolean(1, this.statusAnggota);
            ps.setString(2, this.idAnggota);
                        
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
