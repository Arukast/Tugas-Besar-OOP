/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

/**
 *
 * @author Tubagus Alta
 */
public class Buku implements DataManajemen {
    private String idBuku;
    private String judulBuku;
    private String penulisBuku;
    private String genreBuku;
    private String bahasaBuku;
    private int jumlahBuku;
    
    public Buku(String idBuku, String judulBuku, String penulisBuku, String genreBuku, String bahasaBuku, int jumlahBuku){
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.penulisBuku = penulisBuku;
        this.genreBuku = genreBuku;
        this.bahasaBuku = bahasaBuku;
        this.jumlahBuku = jumlahBuku;
    }

    public void setIdBuku(String idBuku) {
        this.idBuku = idBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public void setPenulisBuku(String penulisBuku) {
        this.penulisBuku = penulisBuku;
    }

    public void setGenreBuku(String genreBuku) {
        this.genreBuku = genreBuku;
    }

    public void setBahasaBuku(String bahasaBuku) {
        this.bahasaBuku = bahasaBuku;
    }

    public void setJumlahBuku(int jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPenulisBuku() {
        return penulisBuku;
    }

    public String getGenreBuku() {
        return genreBuku;
    }

    public String getBahasaBuku() {
        return bahasaBuku;
    }

    public int getJumlahBuku() {
        return jumlahBuku;
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
