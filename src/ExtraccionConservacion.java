import java.util.Stack;

public class ExtraccionConservacion {

    public void ejecutar() {
        Stack<String> armas = new Stack<>();

        armas.push("Espada");
        armas.push("Escudo");
        armas.push("Dagas de Vibranium");
        armas.push("Martillo");

        System.out.println("\n--- EXTRACCION CON CONSERVACION ---");
        System.out.println("Pila original: " + armas);

        String objetivo = "Dagas de Vibranium";
        Stack<String> auxiliar = new Stack<>();
        String encontrado = null;

        while (!armas.isEmpty()) {
            String elemento = armas.pop();

            if (elemento.equals(objetivo)) {
                encontrado = elemento;
                break;
            }

            auxiliar.push(elemento);
        }


        while (!auxiliar.isEmpty()) {
            armas.push(auxiliar.pop());
        }

        if (encontrado != null) {
            System.out.println("Elemento extraido: " + encontrado);
        } else {
            System.out.println("El elemento no fue encontrado.");
        }

        System.out.println("Pila final: " + armas);
    }
}