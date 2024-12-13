/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

/**
 *
 * @author Tubagus Alta
 */
public class BukuFiksi extends Buku {
    private String subGenreBuku;
    
    public BukuFiksi(String idBuku, String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku, String subGenreBuku){
        super(idBuku, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
        this.subGenreBuku = subGenreBuku;
    }

    public void setSubGenreBuku(String subGenreBuku) {
        this.subGenreBuku = subGenreBuku;
    }

    public String getSubGenreBuku() {
        return subGenreBuku;
    }
    
    @Override
    public void inputData() {
        // input data ke database
        System.out.println("test");
    }

    @Override
    public void hapusData() {
        // input data ke database
        System.out.println("test");

    }

    @Override
    public void updateData() {
        // input data ke database        
        System.out.println("test");
    }
}
