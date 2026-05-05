package latihan_pbo.Latihan_15_04_26;

public class Item extends Menu {

    private double jumlah;

    public Item(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotal() {
        return getHarga() * jumlah;
    }
}