/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

/**
 *
 * @author Tubagus Alta
 */
public class PinjamBuku implements DataManajemen {
    String idPinjamBuku;
    String tanggalPinjamBuku;
    String tenggatTanggalPengembalianBuku;
    boolean bukuSudahkembali;
    String tanggalPengembalianBuku;

    public PinjamBuku(String idPinjamBuku, String tanggalPinjamBuku, String tenggatTanggalPengembalianBuku, boolean bukuSudahkembali, String tanggalPengembalianBuku) {
        this.idPinjamBuku = idPinjamBuku;
        this.tanggalPinjamBuku = tanggalPinjamBuku;
        this.tenggatTanggalPengembalianBuku = tenggatTanggalPengembalianBuku;
        this.bukuSudahkembali = bukuSudahkembali;
        this.tanggalPengembalianBuku = tanggalPengembalianBuku;
    }

    public void setIdPinjamBuku(String idPinjamBuku) {
        this.idPinjamBuku = idPinjamBuku;
    }

    public void setTanggalPinjamBuku(String tanggalPinjamBuku) {
        this.tanggalPinjamBuku = tanggalPinjamBuku;
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

    public String getIdPinjamBuku() {
        return idPinjamBuku;
    }

    public String getTanggalPinjamBuku() {
        return tanggalPinjamBuku;
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
