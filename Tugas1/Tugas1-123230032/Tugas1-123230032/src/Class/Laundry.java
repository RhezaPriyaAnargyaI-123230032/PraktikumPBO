/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Lenovo
 */


interface Service {
    void cekKetersediaan();
    void hitungHarga();
    void nota();
}

public abstract class Laundry implements Service {
    String nama;
    double hargaPerKg;
    int waktuLaundry;


    public Laundry(String nama, double hitungHargaperKg, int waktuLaundry) {
        this.nama = nama;
        this.hargaPerKg = hitungHargaperKg;
        this.waktuLaundry = waktuLaundry;
    }

    //method abstrak
    public abstract void detailPesanan();

    @Override
    public void cekKetersediaan() {
        System.out.println( nama + ": Laundry Tersedia");
    }

    @Override
    public void hitungHarga(){
        System.out.println("Harga per Kg: " + hargaPerKg);
    }


    @Override
    public void nota(){
        System.out.println("Nota: " + hargaPerKg);
    }
}
