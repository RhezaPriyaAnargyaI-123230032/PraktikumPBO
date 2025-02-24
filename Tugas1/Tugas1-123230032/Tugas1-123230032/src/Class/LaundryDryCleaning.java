/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author Lenovo
 */
public class LaundryDryCleaning extends Laundry {
     public LaundryDryCleaning (){
         super("Laundry Dry Cleaning", 6000, 20);
     }
     
    @Override
    public void detailPesanan() {
        System.out.println(nama + "\nTotal Harga Cucian Dry Cleaning: " + hargaPerKg + " per Kg");

    }
}
