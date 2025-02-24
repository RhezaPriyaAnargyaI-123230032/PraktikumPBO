/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Lenovo
 */
public class LaundryExclusive extends Laundry {

    public LaundryExclusive() {
        super("Laundry Exclusive", 10000, 50);
    }

    @Override
    public void detailPesanan() {
        System.out.println(nama + "\nTotal Harga Cucian Exclusive: " + hargaPerKg + " per Kg");

    }
}
