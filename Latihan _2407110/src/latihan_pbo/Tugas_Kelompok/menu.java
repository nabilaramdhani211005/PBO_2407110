package latihan_pbo.Tugas_Kelompok;

public class menu {
    private String nama;
    private double harga;

    // Constructor (Overloading)
    public menu() {}

    public menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method
    public void detailMenu() {
        System.out.println("Menu: " + nama + " | Harga: " + harga);
    }
}

