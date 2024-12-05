/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiperpustakaan;

/**
 *
 * @author Tubagus Alta
 */
public class Buku extends DataManajemen {
    private String idBuku;
    private String judulBuku;
    private String penulis;
    private String genre;
    private String bahasa;
    private int jumlahBuku;
    
    public Buku(String idBuku, String judulBuku, String penulis, String genre, String bahasa, int jumlahBuku){
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.genre = genre;
        this.bahasa = bahasa;
        this.jumlahBuku = jumlahBuku;
    }

    @Override
    public void inputData() {
        
    }

    @Override
    public void hapusData() {
        
    }

    @Override
    public void updateData() {
        
    }
    
    
    
            
            
          
}
