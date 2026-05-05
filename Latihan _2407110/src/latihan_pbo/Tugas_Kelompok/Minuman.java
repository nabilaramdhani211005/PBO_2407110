package latihan_pbo.Tugas_Kelompok;

public class Minuman extends menu {
      private String ukuran;

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    @Override
    public void detailMenu() {
        System.out.println("Minuman: " + getNama() +
                " | Harga: " + getHarga() +
                " | Ukuran: " + ukuran);
    }
}
