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
import javax.swing.JOptionPane;
/**
 *
 * @author Tubagus Alta
 */
public class Petugas extends Pengguna{
    private int idPetugas;
    private String passwordPetugas;
    
    public Petugas(){
    }

    
    public Petugas(String passwordPetugas, String namaPengguna, String kontakPengguna) {
        super(namaPengguna, kontakPengguna);
        this.idPetugas = idPetugas;
        this.passwordPetugas = passwordPetugas;
    }
    

    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }

    public void setPasswordPetugas(String passwordPetugas) {
        this.passwordPetugas = passwordPetugas;
    }

    public int getIdPetugas() {
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
    public void setNomorIdentifikasiPengguna(int nomorIdentifikasi) {
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
    public int getNomorIdentifikasiPengguna() {
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

    public boolean loginPetugas(int idPetugas, String password) throws SQLException{
        Connection dbConnection = null;
        PreparedStatement ps = null;
        boolean flag = false;
        String querySQL = "SELECT * FROM petugas WHERE idPetugas = ? AND passwordPetugas = ?";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setInt(1, idPetugas);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                flag = true;
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        return flag;
    }
    
    @Override
    public int createData() throws SQLException {
        // input data ke database
        super.createData();
        Connection dbConnection = null;
        PreparedStatement ps = null;
        int rowAffect = 0;
        
        String querySQL = "INSERT INTO petugas(idPetugas, passwordPetugas) VALUES (?,?)";
        try {
            kdb.bukaKoneksi();
            dbConnection = kdb.getConnection();
                    
            ps = dbConnection.prepareStatement(querySQL);
            ps.setInt(1, this.idPetugas);
            ps.setString(2, this.passwordPetugas);

            rowAffect = ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ps.close();
        }
        
        if (rowAffect > 0) {
            return 1;
        } else {
            return 1;
        }
    }

    @Override
    public List<Object[]> readData() throws SQLException {
        return super.readData(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
//    @Override
//    public void readData(String query) throws SQLException {
//        super.readData("SELECT * FROM pengguna INNER JOIN petugas ON pengguna.nomorIdentifikasiPengguna = petugas.nomorIdentifikasiPengguna");
//    }
  
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
            ps.setInt(2, this.idPetugas);
                        
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
