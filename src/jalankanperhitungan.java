package src;

public class jalankanperhitungan {
    public jalankanperhitungan() {
    }

    public static void main(String[] args) {
        src.model.Perhitungan p = new src.model.Perhitungan(4, 5, 0);
        p.PrintJudul();
        System.out.println("----------------------------");
        System.out.println("Hasil pertambahan :");
        int hasiltambahnya = p.hasiltambah(30, 2);
        System.out.println(hasiltambahnya);
        System.out.println("-----------------------------");
        System.out.println("Hasil Perkalian :");
        int hasilkalinya = p.hasilkali(45, 60);
        System.out.println(hasilkalinya);
    }
}