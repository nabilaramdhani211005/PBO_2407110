package latihan_pbo.Tugas_Kelompok;
import java.util.Scanner;
public class main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cafe cafe = new Cafe("DOMO CAFE");

        // Makanan
        cafe.tambahMenu(new Makanan("Plain Croissant", 23000, "Pastry"));
        cafe.tambahMenu(new Makanan("Chocolate Croissant", 26000, "Pastry"));
        cafe.tambahMenu(new Makanan("Cheese Croissant", 26000, "Pastry"));
        cafe.tambahMenu(new Makanan("Double Cheese Beef", 32000, "Pastry"));

        // Minuman
        cafe.tambahMenu(new Minuman("Green Tea", 22000, "Large"));
        cafe.tambahMenu(new Minuman("Chocolate", 22000, "Large"));
        cafe.tambahMenu(new Minuman("Americano", 18000, "Medium"));
        cafe.tambahMenu(new Minuman("Cafe Latte", 20000, "Medium"));

        cafe.tampilkanMenu();

        double total = 0;
        char lagi;

        do {
            System.out.print("\nPilih menu (1-" + cafe.getJumlahMenu() + "): ");
            int pilih = input.nextInt();

            if (pilih >= 1 && pilih <= cafe.getJumlahMenu()) {
                menu m = cafe.getMenu(pilih - 1);
                total += m.getHarga();
                System.out.println("Ditambahkan: " + m.getNama());
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            System.out.print("Tambah lagi? (y/n): ");
            lagi = input.next().charAt(0);

        } while (lagi == 'y' || lagi == 'Y');

        System.out.println("\nTotal bayar: " + total);
    }
}

