import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear los objetos de cada reto.
        PilaLimitada reto1 = new PilaLimitada();
        ListaReproduccion reto2 = new ListaReproduccion();
        InvertirCoordenadas reto3 = new InvertirCoordenadas();
        ExtraccionConservacion reto4 = new ExtraccionConservacion();
        ColaNebula reto5 = new ColaNebula();
        OrdenarPila reto6 = new OrdenarPila();
        PlanificacionCircular reto7 = new PlanificacionCircular();

        int opcion;

        do {
            System.out.println("\n==================================");
            System.out.println("       MENU DE RETOS JAVA");
            System.out.println("==================================");
            System.out.println("1. Pila con capacidad maxima");
            System.out.println("2. Lista de reproduccion infinita");
            System.out.println("3. Invirtiendo coordenadas");
            System.out.println("4. Extraccion con conservacion");
            System.out.println("5. Cola de Nebula");
            System.out.println("6. Ordenando con restricciones");
            System.out.println("7. Planificacion circular");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    reto1.ejecutar(sc);
                    break;

                case 2:
                    reto2.ejecutar(sc);
                    break;

                case 3:
                    reto3.ejecutar();
                    break;

                case 4:
                    reto4.ejecutar();
                    break;

                case 5:
                    reto5.ejecutar(sc);
                    break;

                case 6:
                    reto6.ejecutar();
                    break;

                case 7:
                    reto7.ejecutar();
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida. Intenta nuevamente.");
            }

        } while (opcion != 0);

        sc.close();
    }
}