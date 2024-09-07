/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertKetiga;

/**
 *
 * @author Salwa Faizah
 */
public class Utama {
    public static void main(String[] args) {
        PeralatanDapur wajan = new PeralatanDapur();
        System.out.println("Halo aku " +wajan.getNama()+ ", aku punya merk" 
                +wajan.getMerk()+ ", warnaku " +wajan.getWarna()+ ", aku memiliki fungsi " +wajan.getFungsi());
       
        System.out.println("");
        
        PeralatanSekolah bulpen = new PeralatanSekolah();
        System.out.println(" Halo aku " +bulpen.getNama()+ "  aku digunakan untuk " +bulpen.getFungsi());
        
        //overload
        bulpen.hargaBarang();
        bulpen.hargaBarang(5000);
        bulpen.hargaBarang("pilot");
    }
    
}
