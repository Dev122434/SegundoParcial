package main;

import gui.Login;

public class Main {

    public static void main(String[] args) {
        
        Login login = new Login(null, true);
        // Centrar el cuadro de diálogo
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
    
    
}
