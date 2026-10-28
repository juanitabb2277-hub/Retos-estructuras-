import java.util.Scanner;
import java.util.Stack;

public class ColaNebula {

    private Stack<String> entrada = new Stack<>();
    private Stack<String> salida = new Stack<>();

    public void agregar(String elemento) {
        entrada.push(elemento);
    }

    public String retirar() {
        if (salida.isEmpty()) {
            while (!entrada.isEmpty()) {
                salida.push(entrada.pop());
            }
        }

        if (salida.isEmpty()) {
            return null;
        }

        return salida.pop();
    }

    public void ejecutar(Scanner sc) {
        int opcion;

        do {
            System.out.println("\n--- COLA DE NEBULA ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Retirar elemento");
            System.out.println("0. Volver al menu");
            System.out.print("Selecciona: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el elemento: ");
                    agregar(sc.nextLine());
                    System.out.println("Elemento agregado.");
                    break;

                case 2:
                    String elemento = retirar();

                    if (elemento == null) {
                        System.out.println("La cola esta vacia.");
                    } else {
                        System.out.println("Elemento retirado: " + elemento);
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
    }
}