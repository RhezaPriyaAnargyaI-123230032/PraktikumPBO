/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;


/**
 *
 * @author Lenovo
 */
public class LaundrySelfService extends Laundry{
    public LaundrySelfService(){
        super("Laundry Self Service", 3000, 10);
    }
    
    @Override
    public void detailPesanan(){
        System.out.println(nama + "\nTotal Harga Cucian Self Service: " + hargaPerKg + " per Kg");
    }
}
