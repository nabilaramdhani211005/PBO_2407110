package latihan_pbo.Tugas_06_04_26;

public class bangunDatar {

    private int panjang;
    private int lebar;

    public bangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuas() {
        return panjang * lebar * 2;
    }

    public int hitungVolume() {
        return 0;
    }
}