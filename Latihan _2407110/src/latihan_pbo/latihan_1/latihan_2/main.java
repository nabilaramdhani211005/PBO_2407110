
package latihan_pbo.latihan_1.latihan_2;
//class ini berada di dalam folder/package tersebut. Package dipakai untuk mengelompokkan kode supaya rapi.


// ENCAPUSLATION
// ACCESS MODIFIER (PUBLIC, PRIVATE, PROTECTED)

class PersegiPanjang {
//Ini adalah class yang merepresentasikan objek persegi panjang.
    private int panjang;
    private int lebar;

    //Variabel ini dibuat private, artinya tidak bisa diakses langsung dari luar class.
    //Ini inti dari encapsulation → data disembunyikan agar lebih aman.

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
        //Setter digunakan untuk mengisi nilai
    }

    public int getLebar() {
        return lebar;
        //Getter digunakan untuk mengambil nilai.
        //Jadi akses data harus lewat method, bukan langsung.
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public int getLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class main {
    //Ini class utama untuk menjalankan program.
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(9);
        pp.setLebar(10);

        //Artinya kita membuat objek bernama pp.
        //Nilai dimasukkan lewat setter ("Panjang: " + pp.getPanjang());
        System.out.println("Panjang: " + pp.getPanjang());
        System.out.println("Lebar: " + pp.getLebar());

        //Program menampilkan:
        //panjang
        //lebar
        //luas
        //keliling
        System.out.println("Luas: " + pp.getLuas());
        System.out.println("Keliling: " + pp.getKeliling());
    }
}