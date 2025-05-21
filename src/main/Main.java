
package main;

import views.ClienteView;
import views.VeterinarioView;

public class Main {
    
    public static void main(String[] args) {
        ClienteView clienteView = new ClienteView();
        clienteView.mostrarMenu();

        VeterinarioView veterinarioView = new VeterinarioView();
        veterinarioView.mostrarMenu();
    }
    
}
