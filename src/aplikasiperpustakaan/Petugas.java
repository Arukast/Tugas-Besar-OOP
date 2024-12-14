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
public class Petugas extends Pengguna{
    private String idPetugas;
    private String passwordPetugas;

    public Petugas(String idPetugas, String passwordPetugas, String nomorIdentifikasiPengguna, String namaPengguna, String kontakPengguna) {
        super(nomorIdentifikasiPengguna, namaPengguna, kontakPengguna);
        this.idPetugas = idPetugas;
        this.passwordPetugas = passwordPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public void setPasswordPetugas(String passwordPetugas) {
        this.passwordPetugas = passwordPetugas;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public String getPasswordPetugas() {
        return passwordPetugas;
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
        
        String querySQL = "INSERT INTO petugas(idPetugas, passwordPetugas) VALUES (?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.idPetugas);
            ps.setString(2, this.passwordPetugas);

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
        super.readData("SELECT * FROM pengguna INNER JOIN petugas ON pengguna.nomorIdentifikasiPengguna = petugas.nomorIdentifikasiPengguna");
    }
  
    @Override
    public boolean updateData() throws SQLException {
        // input data ke database
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "UPDATE petugas SET passwordPetugas = ? WHERE idPetugas = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setString(1, this.passwordPetugas);
            ps.setString(2, this.idPetugas);
                        
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
