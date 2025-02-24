/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Lenovo
 */
public class LaundryKilat extends Laundry {

    public LaundryKilat() {
        super("Laundry Kilat", 7000, 30);
    }

    @Override
    public void detailPesanan() {
        System.out.println(nama + "\nTotal Harga Cucian Kilat: " + hargaPerKg + " per Kg");
    }
}


