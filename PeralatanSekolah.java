/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertKetiga;

/**
 *
 * @author Salwa Faizah
 */
public class PeralatanSekolah extends Peralatan{
    //buku dan bulpen
    private String jenisPeralatan;
    
    public PeralatanSekolah() {
        System.out.println("aku peralatan sekolah");
        super.setNama("Bulpen");
        this.setJenisPeralatan("Ini peralatan menulis");
        super.macamMacam();
        super.macam();
        
    }
    
    //ini overload
    public void hargaBarang(){
        System.out.println("harganya adaalahh");
    }
    
    public void hargaBarang(int jumlah){
        System.out.println("jumlah bulpennya ada " +jumlah);
    }
    public void hargaBarang(String merk){
        System.out.println("bulpenku ber merk " +merk);
    }
 
    
    @Override
    public void harga(){
        System.out.println("total harganya");
            }

    /**
     * @return the jenisPeralatan
     */
    public String getJenisPeralatan() {
        return jenisPeralatan;
    }

    /**
     * @param jenisPeralatan the jenisPeralatan to set
     */
    public void setJenisPeralatan(String jenisPeralatan) {
        this.jenisPeralatan = jenisPeralatan;
    }
}
