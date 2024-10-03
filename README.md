# Pemrograman Berbasis Obyek - Pertemuan Ketiga
Tugas Pemrograman Berbasis Objek (PBO) pertemuan 3 ini yaitu mengimplementasikan class abstract, override, dan overload. 

---
## Daftar Isi
- [Abstract Class](https://github.com/salwafz/Tugas-ketiga-PBO-/blob/main/Perabotan.java)
- [Overriding](https://github.com/salwafz/Tugas-ketiga-PBO-/blob/main/Peralatan.java)
- [Overloading](https://github.com/salwafz/Tugas-ketiga-PBO-/blob/main/PeralatanSekolah.java)
  
---
## Abstract Class
### Pengertian
Kelas abstract adalah kelas yang tidak dapat diinstansiasi secara langsung. Kelas ini mendefinisikan sifat-sifat umum yang akan dimiliki oleh kelas-kelas turunannya. Namun, kelas abstrak tidak bisa langsung digunakan, kita harus membuat kelas turunannya terlebih dahulu untuk dapat mengimplementasikan kelas ini.
### Contoh
```` java
public abstract class Perabotan {
    abstract void macamMacam();
}
````
abstract void `macamMacam()` Ini adalah method abstrak yang dideklarasikan tanpa implementasi. Dimana kelas-kelas yang mewarisi Perabotan harus mengimplementasikan metode ini.

---
## Overriding
### Pengertian
Overriding dapat mengganti implementasi pada method yang sudah ada di Super Class, menjadi implementasi yang berbeda di SubClass. Jadi, kelas turunan bisa "mewarisi" method dari kelas induk, tapi juga bisa mengubahnya sesuai kebutuhan.
### Contoh
````java
public class Peralatan extends Perabotan {

    private String nama;
    private String fungsi;
    
    @Override
    void macamMacam() {
        System.out.println("aku punya macam macam jenis");
    }
````
Method `macamMacam()` merupakan method milik super class (Perabotan). Ini berarti kita akan memberikan implementasi yang berbeda untuk method tersebut pada kelas Peralatan.

---
## Overloading
### Pengertian
Overloading adalah sebuah konsep di mana kita dapat memiliki beberapa method dengan nama yang sama dalam satu kelas, tetapi dengan parameter yang berbeda.
### Contoh
````java
public void hargaBarang(){
        System.out.println("harganya adaalahh");
    }
    
    public void hargaBarang(int jumlah){
        System.out.println("jumlah bulpennya ada " +jumlah);
    }
    public void hargaBarang(String merk){
        System.out.println("bulpenku ber merk " +merk);
    }
````
- public void `hargaBarang()`: Ini adalah method tanpa parameter. Ketika method ini dipanggil, ia akan mencetak pesan "harganya adalahh".
- public void `hargaBarang(int jumlah)`: Ini adalah metode dengan satu parameter bertipe int. Metode ini mencetak jumlah bulpen yang ada. Jika dipanggil, misalnya dengan hargaBarang(5), maka outputnya akan menjadi "jumlah bulpenya ada 5".
- public void `hargaBarang(String merk)`: Ini adalah metode dengan satu parameter bertipe String. Metode ini mencetak merk dari bulpen. Jika dipanggil, misalnya dengan hargaBarang("Pilot"), maka outputnya akan menjadi "bulpenku ber merk Pilot".

---

Sekian dari saya, semoga penjelasan diatas dapat membantuu!!!
