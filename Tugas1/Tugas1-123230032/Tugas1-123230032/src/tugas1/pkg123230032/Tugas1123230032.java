/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.pkg123230032;

/**
 *
 * @author Lenovo
 */
import Class.*;

public class Tugas1123230032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Laundry selfService = new LaundrySelfService();
        Laundry dryCleaning = new LaundryDryCleaning();
        Laundry exclusive = new LaundryExclusive();
        Laundry kilat = new LaundryKilat();
        System.out.println("\n");

        selfService.detailPesanan();
        selfService.cekKetersediaan();
        selfService.hitungHarga();
        selfService.nota();
        System.out.println("\n");

        dryCleaning.detailPesanan();
        dryCleaning.cekKetersediaan();
        dryCleaning.hitungHarga();
        dryCleaning.nota();
        System.out.println("\n");

        exclusive.detailPesanan();
        exclusive.cekKetersediaan();
        exclusive.hitungHarga();
        exclusive.nota();
        System.out.println("\n");

        kilat.detailPesanan();
        kilat.cekKetersediaan();
        kilat.hitungHarga();
        kilat.nota();
        System.out.println("\n");

    }

}
