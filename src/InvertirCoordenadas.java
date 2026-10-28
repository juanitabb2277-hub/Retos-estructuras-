import java.util.Stack;

public class InvertirCoordenadas {

    public void ejecutar() {
        Stack<String> original = new Stack<>();

        original.push("A");
        original.push("B");
        original.push("C");
        original.push("D");

        System.out.println("\n--- INVIRTIENDO COORDENADAS ---");
        System.out.println("Pila original: " + original);

        Stack<String> auxiliar = new Stack<>();

        while (!original.isEmpty()) {
            auxiliar.push(original.pop());
        }

        System.out.println("Pila invertida: " + auxiliar);
        System.out.println("Elemento superior: " + auxiliar.peek());
    }
}