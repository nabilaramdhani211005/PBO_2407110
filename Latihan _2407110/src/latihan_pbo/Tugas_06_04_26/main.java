package latihan_pbo.Tugas_06_04_26;

public class main {
    public static void main(String[] args) {
        // data dari soal
        int panjang = 10;
        int lebar = 5;
        int tinggi = 4;

        bangunRuang br = new bangunRuang(panjang, lebar, tinggi);

        // output
        System.out.println("Luas alas: " + br.hitungLuas());
        System.out.println("Volume: " + br.hitungVolume());
    }
}
    
