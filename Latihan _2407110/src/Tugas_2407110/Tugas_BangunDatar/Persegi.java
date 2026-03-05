package latihan_pbo.Tugas_2407110;

public class Persegi {
    

    private int sisi;   // PRIVATE (disembunyikan)

    public Persegi(int sisi) {   // PUBLIC constructor
        this.sisi = sisi;
    }

    public int hitungLuas() {    // PUBLIC method
        return sisi * sisi;
    }

    public int hitungKeliling() {
        return 4 * sisi;
    }

    // Getter
    public int getSisi() {
        return sisi;
    }

    // Setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
}
