import java.util.Scanner;
import java.util.Stack;

public class PilaLimitada {

    public void ejecutar(Scanner sc) {
        Stack<String> pila = new Stack<>();

        System.out.print("Capacidad maxima de la pila: ");
        int capacidad = sc.nextInt();
        sc.nextLine();

        if (capacidad <= 0) {
            System.out.println("La capacidad debe ser mayor que cero.");
            return;
        }

        int opcion;

        do {
            System.out.println("\n--- PILA CON CAPACIDAD MAXIMA ---");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Retirar elemento");
            System.out.println("0. Volver al menu");
            System.out.print("Selecciona: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (pila.size() < capacidad) {
                        System.out.print("Ingresa el elemento: ");
                        pila.push(sc.nextLine());
                        System.out.println("Elemento agregado.");
                    } else {
                        System.out.println("Error: la pila esta llena.");
                    }
                    break;

                case 2:
                    System.out.println("Contenido: " + pila);
                    break;

                case 3:
                    if (!pila.isEmpty()) {
                        System.out.println("Elemento retirado: " + pila.pop());
                    } else {
                        System.out.println("La pila esta vacia.");
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