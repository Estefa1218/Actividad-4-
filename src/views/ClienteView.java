package views;

import controllers.ClienteController;
import java.util.List;
import java.util.Scanner;
import models.Cliente;

public class ClienteView {

    private ClienteController clienteController;
    private Scanner entrada;

    public ClienteView() {
        this.clienteController = new ClienteController();
        this.entrada = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("JUAN CAMILO CUETIA HERNANDEZ CC: 1005873957");
            System.out.println("\n == MENU CLIENTES ==");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            entrada.nextLine();

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 3);

    }

    public void agregarCliente() {
        System.out.println("\n == Agregar Cliente ==");
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Email: ");
        String email = entrada.nextLine();

        System.out.print("Teléfono: ");
        String telefono = entrada.nextLine();

        System.out.print("Dirección: ");
        String direccion = entrada.nextLine();

        clienteController.agregarCliente(nombre, email, telefono, direccion);
        System.out.println("Cliente agregado");
    }

    private void mostrarClientes() {
        System.out.println("\n == LISTA DE CLIENTES ==");

        List<Cliente> clientes = clienteController.obtenerCliente();

        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }
    
    

}
