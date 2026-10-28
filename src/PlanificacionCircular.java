import java.util.LinkedList;
import java.util.Queue;

public class PlanificacionCircular {

    static class Sector {
        String nombre;
        int energia;

        public Sector(String nombre) {
            this.nombre = nombre;
            this.energia = 0;
        }
    }

    public void ejecutar() {
        Queue<Sector> cola = new LinkedList<>();

        cola.offer(new Sector("Frontal"));
        cola.offer(new Sector("Trasero"));
        cola.offer(new Sector("Izquierdo"));
        cola.offer(new Sector("Derecho"));

        int ciclo = 1;

        System.out.println("\n--- PLANIFICACION CIRCULAR ---");

        while (!cola.isEmpty()) {
            Sector actual = cola.poll();

            actual.energia += 10;

            System.out.println(
                    "Ciclo " + ciclo + ": "
                            + actual.nombre + " tiene "
                            + actual.energia + "% de energia."
            );

            if (actual.energia < 100) {
                cola.offer(actual);
            } else {
                System.out.println(
                        actual.nombre + " completo su energia."
                );
            }

            ciclo++;
        }

        System.out.println("Todos los sectores llegaron al 100%.");
    }
}