package latihan_pbo.Tugas_06_04_26;

public class bangunDatar {
    // atribut (private = enkapsulasi)
    private int panjang;
    private int lebar;

    // constructor
    public bangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // getter (biar bisa diakses turunan)
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    // method hitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }
}

