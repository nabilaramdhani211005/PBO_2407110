package latihan_pbo.Tugas_Kelompok;

import java.util.ArrayList;

public class Cafe {
    private String namaCafe;
    private ArrayList<menu> daftarMenu;

    public Cafe(String namaCafe) {
        this.namaCafe = namaCafe;
        daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(menu m) {
        daftarMenu.add(m);
    }

    public void tampilkanMenu() {
        System.out.println("\n=== MENU " + namaCafe + " ===");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarMenu.get(i).detailMenu();
        }
    }

    public menu getMenu(int index) {
        return daftarMenu.get(index);
    }

    public int getJumlahMenu() {
        return daftarMenu.size();
    }
}

