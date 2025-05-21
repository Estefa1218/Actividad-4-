
package views;

import controllers.VeterinarioController;
import java.util.List;
import java.util.Scanner;
import models.Veterinario;

public class VeterinarioView {

    private VeterinarioController veterinarioController;
    private Scanner entrada;

    public VeterinarioView() {
        this.veterinarioController = new VeterinarioController();
        this.entrada = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("JUAN CAMILO CUETIA HERNANDEZ CC: 1005873957");
            System.out.println("\n == MENU VETERINARIOS ==");
            System.out.println("1. Agregar veterionario");
            System.out.println("2. Mostrar veterionario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            entrada.nextLine();

            switch (opcion) {
                case 1:
                    agregarVeterinario();
                    break;
                case 2:
                    mostrarVeterinario();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 3);

    }

    public void agregarVeterinario() {
        System.out.println("\n == Agregar Veterinario ==");
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Email: ");
        String email = entrada.nextLine();

        System.out.print("Teléfono: ");
        String telefono = entrada.nextLine();

        System.out.print("Especialidad: ");
        String especialidad = entrada.nextLine();

        veterinarioController.agregarVeterinario(nombre, email, telefono, especialidad);
        System.out.println("Veterinario agregado");
    }

    private void mostrarVeterinario() {
        System.out.println("\n == LISTA DE VETERINARIOS ==");

        List<Veterinario> veterinarios = veterinarioController.obtenerVeterinario();

        if (veterinarios.isEmpty()) {
            System.out.println("No hay veterinarios registrados");
        } else {
            for (Veterinario veterinario : veterinarios) {
                System.out.println(veterinarios);
            }
        }
    }
    
    

}
