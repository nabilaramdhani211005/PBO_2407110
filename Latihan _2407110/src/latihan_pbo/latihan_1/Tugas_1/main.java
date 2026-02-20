package latihan_pbo.latihan_1.Tugas_1;

import java.util.Scanner; // untuk input dari keyboard

// Class Cafe menggunakan konsep encapsulation
class Cafe {

    private String namaMinuman;
    private int Kopi;
    private int susu;
    private int foam;

    // ===== Getter & Setter =====
    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setKopi(int Kopi) {
        this.Kopi = Kopi;
    }

    public int getKopi() {
        return Kopi;
    }

    public void setSusu(int susu) {
        this.susu = susu;
    }

    public int getSusu() {
        return susu;
    }

    public void setFoam(int foam) {
        this.foam = foam;
    }

    public int getFoam() {
        return foam;
    }

    // Method untuk mencampur bahan
    public void mixDrink() {
        System.out.println("\n=== Komposisi Minuman ===");
        System.out.println("Minuman : " + namaMinuman);
        System.out.println("Kopi : " + Kopi + " shot");
        System.out.println("Susu     : " + susu + " shot");
        System.out.println("Foam     : " + foam + " shot");

        // Perbandingan bahan menggunakan IF ELSE
        if (Kopi > susu) {
            System.out.println("Rasa kopi lebih kuat nih.");
        } else if (Kopi < susu) {
            System.out.println("Rasa susu lebih dominan.");
        } else {
            System.out.println("Rasa kopi dan susu seimbang.");
        }
    }
}

// Class utama
public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cafe minum = new Cafe();

        // Input nama minuman
        System.out.print("Masukkan Nama Minuman: ");
        String nama = input.nextLine();
        minum.setNamaMinuman(nama);

        // Input jumlah shot
        System.out.print("Masukkan jumlah Kopi: ");
        int esp = input.nextInt();
        minum.setKopi(esp);

        System.out.print("Masukkan jumlah susu: ");
        int sus = input.nextInt();
        minum.setSusu(sus);

        System.out.print("Masukkan jumlah foam: ");
        int fo = input.nextInt();
        minum.setFoam(fo);

        // Tampilkan hasil campuran
        minum.mixDrink();

        input.close();
    }
}