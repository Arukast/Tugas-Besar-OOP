/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

/**
 *
 * @author Tubagus Alta
 */
public abstract class Pengguna implements DataManajemen{
    private String nomorIdentifikasi;
    private String namaPengguna;
    private String kontakPengguna;
    
    public abstract void tampilkanDataPengguna();

    public Pengguna(String nomorIdentifikasi, String namaPengguna, String kontakPengguna) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.namaPengguna = namaPengguna;
        this.kontakPengguna = kontakPengguna;
    }

    public void setNomorIdentifikasi(String nomorIdentifikasi) {
        this.nomorIdentifikasi = nomorIdentifikasi;
    }

    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public void setKontakPengguna(String kontakPengguna) {
        this.kontakPengguna = kontakPengguna;
    }

    public String getNomorIdentifikasi() {
        return nomorIdentifikasi;
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public String getKontakPengguna() {
        return kontakPengguna;
    }

    @Override
    public void inputData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hapusData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
