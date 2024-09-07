package TugasPertKetiga;

/**
 *
 * @author Salwa Faizah
 */
public class Peralatan extends Perabotan {

    private String nama;
    private String fungsi;
    
    public void harga(){
        System.out.println("harga ");
    }
    
    @Override
    void macamMacam() {
        System.out.println("aku punya macam macam jenis");
    }
    
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the fungsi
     */
    public String getFungsi() {
        return fungsi;
    }

    /**
     * @param fungsi the fungsi to set
     */
    public void setFungsi(String fungsi) {
        this.fungsi = fungsi;
    }

}
