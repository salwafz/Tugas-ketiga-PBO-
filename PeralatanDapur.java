/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertKetiga;

/**
 *
 * @author Salwa Faizah
 */
public class PeralatanDapur extends Peralatan {

    //kompor dan wajan
    private String warna;
    private String merk;

    public PeralatanDapur() {
        System.out.println("Aku adalah peralatan dapur");
        super.setNama("Wajan");
        super.setFungsi("menggoreng");
        this.setWarna("silver");
        this.setMerk("maxim");
        super.macamMacam();
        super.macam();
        
   
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }
}
