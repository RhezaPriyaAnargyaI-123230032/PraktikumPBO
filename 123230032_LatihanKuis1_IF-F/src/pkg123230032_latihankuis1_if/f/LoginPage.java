package pkg123230032_latihankuis1_if.f;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
    
    JLabel tulisan = new JLabel("Login Page");
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");

    JTextField usernameJTextField = new JTextField();
    JPasswordField passwordJTextField = new JPasswordField();

    JButton tombolLogin = new JButton("Login");
    JButton tombolReset = new JButton("Reset");
    
    public LoginPage() {
        setVisible(true);
        setSize(720, 480);
        setTitle("Ini adalah title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);

        add(tulisan);
        add(usernameLabel);
        add(usernameJTextField);
        add(passwordLabel);
        add(passwordJTextField);
        add(tombolLogin);
        add(tombolReset);

        tulisan.setBounds(300, 40, 120, 24);

        usernameLabel.setBounds(180, 100, 120, 25);
        passwordLabel.setBounds(180, 160, 120, 25);

        usernameJTextField.setBounds(180, 130, 300, 30);
        passwordJTextField.setBounds(180, 190, 300, 30);

        tombolLogin.setBounds(180, 240, 300, 40);
        tombolReset.setBounds(180, 300, 300, 40);
        
        tombolLogin.addActionListener(this);
        tombolReset.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == tombolLogin) {
                String username = usernameJTextField.getText();
                char[] passChar = passwordJTextField.getPassword();
                String password = new String(passChar);
                
                if (username.equals("123230032") && password.equals("230032321")) {
                    System.out.println("Sukses");
                    
                    new HomePage(username); 
                    this.dispose(); 
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Username atau password salah");
                }
                
            } else if (e.getSource() == tombolReset) {
                usernameJTextField.setText("");                
                passwordJTextField.setText("");
            }
        } catch (Exception error) {
            System.out.println("Terdapat Kesalahan");
        }
    }
}
