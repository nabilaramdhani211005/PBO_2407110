package latihan_pbo.Tugas_Kelompok;

public class Makanan extends menu {
     private String jenis;

    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    @Override
    public void detailMenu() {
        System.out.println("Makanan: " + getNama() +
                " | Harga: " + getHarga() +
                " | Jenis: " + jenis);
    }
}

