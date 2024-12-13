/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setNomorIdentifikasi(String nomorIdentifikasi) {
        super.setNomorIdentifikasi(nomorIdentifikasi); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setNamaPengguna(String namaPengguna) {
        super.setNamaPengguna(namaPengguna); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setKontakPengguna(String kontakPengguna) {
        super.setKontakPengguna(kontakPengguna); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNomorIdentifikasi() {
        return super.getNomorIdentifikasi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getNamaPengguna() {
        return super.getNamaPengguna(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getKontakPengguna() {
        return super.getKontakPengguna(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void inputData() {
        super.inputData(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void hapusData() {
        super.hapusData(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void updateData() {
        super.updateData(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
