package latihan_pbo.Latihan_3;

public class Lingkaran extends BangunDatar {

    public double hitungLuas() {
        return Math.PI * getjari() * getjari();
    }

    public double hitungKeliling() {
        return 2 * Math.PI * getjari();
    }
}
