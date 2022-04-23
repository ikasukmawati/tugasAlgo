package src.model;

import src.Interfaces.interfaces;

public class Perhitungan implements interfaces {
    public int x;
    private int y;
    private int hasil;

    public Perhitungan(int x, int y, int hasil) {
        this.x = x;
        this.y = y;
        this.hasil = hasil;
        this.printJudulClass("judul dalam  perhitungan ");
    }

    private void printJudulClass(String jdl) {
        System.out.println(jdl);
    }

    public void PrintJudul() {
        System.out.println("Judul Dalam Interfaces");
    }

    public void HitungTambah() {
        this.hasil = this.x + this.y;
    }

    public void HitungKali() {
        this.hasil = this.x * this.y;
    }

    public int hasiltambah(int x1, int y2) {
        this.x = x1;
        this.y = y2;
        this.HitungTambah();
        return this.hasil;
    }

    public int hasilkali(int _x, int _y) {
        this.x = _x;
        this.y = _y;
        this.HitungKali();
        return this.hasil;
    }
}