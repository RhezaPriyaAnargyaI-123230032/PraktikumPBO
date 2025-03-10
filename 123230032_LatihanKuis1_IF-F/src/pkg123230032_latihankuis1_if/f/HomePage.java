package pkg123230032_latihankuis1_if.f;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame implements ActionListener {

    JLabel title = new JLabel();
    JLabel subJudul = new JLabel();
    JButton tombolDVDAnak = new JButton("DVD Anak");
    JButton tombolDVDDewasa = new JButton("DVD Dewasa");
    JButton tombolDVDLansia = new JButton("DVD Lansia");
    JButton tombolLogout = new JButton("Logout");


    public String Username;
    
    public HomePage(String username) {
        this.Username = username;
        
        setVisible(true);
        setSize(720, 480);
        setTitle("Selamat Datang di Toko DVD IF-F");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);

        add(title);
        title.setText("Selamat Datang " + username);
        add(subJudul);
        subJudul.setText("Silahkan Pilih Menu di Bawah untuk Membeli DVD");
        add(tombolDVDAnak);
        add(tombolDVDDewasa);
        add(tombolDVDLansia);
        add(tombolLogout);

        title.setBounds(260, 40, 220, 40);  
        subJudul.setBounds(200, 80, 380, 40);  

        tombolDVDAnak.setBounds(150, 140, 380, 30);  
        tombolDVDDewasa.setBounds(150, 180, 380, 30);  
        tombolDVDLansia.setBounds(150, 220, 380, 30);  
        tombolLogout.setBounds(150, 300, 380, 30);  

        tombolDVDAnak.addActionListener(this);
        tombolDVDDewasa.addActionListener(this);
        tombolDVDLansia.addActionListener(this);
        tombolLogout.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == tombolDVDAnak) {
                System.out.println("tombol anak");
                new PembelianDVD("DVD Anak", 27891, Username);
                this.dispose();
            } else if (e.getSource() == tombolDVDDewasa) {
                System.out.println("tombol dewasa");
                new PembelianDVD("DVD Dewasa", 35396, Username);
                this.dispose();
            } else if (e.getSource() == tombolDVDLansia) {
                System.out.println("tombol lansia");
                new PembelianDVD("DVD Lansia", 38550, Username);
                this.dispose();
            } else if (e.getSource() == tombolLogout) {
                System.out.println("tombol login");
                new LoginPage();
                this.dispose();
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
