
package latihan_pbo.Latihan_15_04_26; 

public class Menu { 

    // atribut / variabel milik class
    private String nama;
    private double harga; 
    // variabel untuk menyimpan harga menu

    // constructor
    public Menu(String nama, double harga) { 
    // constructor digunakan untuk memberi nilai awal saat object dibuat
        this.nama = nama; 
        this.harga = harga; 
        // memberi nilai harga pada atribut harga
    }

    // getter untuk mengambil nilai nama
    public String getNama() { 
        return nama; 
        // mengembalikan nilai dari variabel nama
    }

    // getter untuk mengambil nilai harga
    public double getHarga() { 
        return harga; 
        // mengembalikan nilai dari variabel harga
    }

    // method untuk menghitung total harga
    public double hitungTotal() { 
        return harga; 
        // method ini mengembalikan nilai harga
        // nanti method ini bisa dioverride oleh class turunan
    }

    // method untuk menampilkan data menu
    public void tampilkan() { 
        System.out.println("Nama Menu : " + nama); 
        // menampilkan nama menu

        System.out.println("Harga : " + harga); 
        // menampilkan harga menu
    }
}

