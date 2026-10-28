
import java.util.Stack;

public class OrdenarPila {

    public void ejecutar() {
        Stack<Integer> pila = new Stack<>();

        pila.push(7);
        pila.push(3);
        pila.push(9);
        pila.push(1);
        pila.push(5);

        System.out.println("\n--- ORDENANDO CON RESTRICCIONES ---");
        System.out.println("Pila original: " + pila);

        Stack<Integer> auxiliar = new Stack<>();

        while (!pila.isEmpty()) {
            int actual = pila.pop();

            while (!auxiliar.isEmpty()
                    && auxiliar.peek() < actual) {
                pila.push(auxiliar.pop());
            }

            auxiliar.push(actual);
        }

        while (!auxiliar.isEmpty()) {
            pila.push(auxiliar.pop());
        }

        System.out.println("Pila ordenada: " + pila);
        System.out.println("Menor elemento en la cima: " + pila.peek());
    }
}