package latihan_pbo.Tugas_2407110;

public class Lingkaran {


    private int jariJari;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public int hitungLuas() {
        return 3 * jariJari * jariJari;
    }

    public int hitungKeliling() {
        return 2 * 3 * jariJari;
    }
}

