package latihan_pbo.Tugas_06_04_26;

public class bangunRuang extends bangunDatar {

    private int tinggi;

    // constructor
    public bangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // method override
    
    public int hitungVolume() {
        return hitungLuas() * tinggi;
    }
}