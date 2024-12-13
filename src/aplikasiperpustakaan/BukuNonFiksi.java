/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

/**
 *
 * @author Tubagus Alta
 */
public class BukuNonFiksi extends Buku {
    private String topikBuku;
    
    public BukuNonFiksi(String idBuku, String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku, String topikBuku){
        super(idBuku, judulBuku, penulisBuku, genreBuku, bahasaBuku, jumlahBuku);
        this.topikBuku = topikBuku;
    }

    public void setTopikBuku(String topikBuku) {
        this.topikBuku = topikBuku;
    }

    public String getTopikBuku() {
        return topikBuku;
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
