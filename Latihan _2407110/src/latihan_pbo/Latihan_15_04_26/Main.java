package latihan_pbo.Latihan_15_04_26;

public class Main {

    public static void main(String[] args) {

        Item menu1 = new Item("Mie Gacoan",15000,2);
        Item menu2 = new Item("Mie Kuah",12000,1);
        Item menu3 = new Item("Air putih",5000,3);

        menu1.tampilkan();
        System.out.println("Total : " + menu1.hitungTotal());

        menu2.tampilkan();
        System.out.println("Total : " + menu2.hitungTotal());

        menu3.tampilkan();
        System.out.println("Total : " + menu3.hitungTotal());

        double totalSemua = menu1.hitungTotal() + menu2.hitungTotal();
        System.out.println("\nTotal Semua: " + totalSemua);
    }
}
