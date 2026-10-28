import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListaReproduccion {

    public void ejecutar(Scanner sc) {
        Queue<String> canciones = new LinkedList<>();

        canciones.offer("Cancion 1");
        canciones.offer("Cancion 2");
        canciones.offer("Cancion 3");

        int opcion;

        do {
            System.out.println("\n--- LISTA DE REPRODUCCION INFINITA ---");
            System.out.println("1. Reproducir siguiente cancion");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Agregar cancion");
            System.out.println("0. Volver al menu");
            System.out.print("Selecciona: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    if (!canciones.isEmpty()) {
                        String cancion = canciones.poll();

                        System.out.println("Reproduciendo: " + cancion);
                        canciones.offer(cancion);
                    } else {
                        System.out.println("No hay canciones.");
                    }
                    break;

                case 2:
                    System.out.println("Lista: " + canciones);
                    break;

                case 3:
                    System.out.print("Nombre de la cancion: ");
                    canciones.offer(sc.nextLine());
                    System.out.println("Cancion agregada.");
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
    }
}