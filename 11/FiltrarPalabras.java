import java.util.Scanner;

// Lee palabras de la entrada estándar (separadas por blancos) e
// imprime por la salida estándar una en cada línea tras filtrarlas de
// acuerdo a un determinado criterio.
public class FiltrarPalabras {

  // Esta clase implementa pilas acotadas de strings
  public static class StringStack {
    // TODO: definir los atributos necesarios para implementar las
    // pilas acotadas de strings (un array, indicador de capacidad
    // máxima e indicador de ocupación actual, probablemente un índice
    // a la cima de la pila).
    
    private StringStack() {
      // Sólo para impedir el uso del constructor por defecto
    }
    
    public StringStack(int capacity) {
      // TODO: implementar el constructor
    }
    
    public boolean isEmpty() {
      // TODO: implementar isEmpty
    }
    
    public boolean isFull() {
      // TODO: implementar isFull
    }
    
    public void push(String s) {
      // TODO: implementar push
    }
    
    public String top() {
      // TODO: implementar top
    }
    
    public void pop() {
      // TODO: implementar pop
    }
  }

  
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    StringStack input = new StringStack(1000);

    // Lectura de las plabras de la entrada estándar
    while (stdin.hasNext()) {
      input.push(stdin.next());
    }

    StringStack output = new StringStack(1000);
    // =================================================================
    // TODO: volcar en output todos los strings de input cuya longitud
    // sea menor de cuatro
    // =================================================================
    
    // Se imprimen los datos en la salida estándar
    while (!output.isEmpty()) {
      System.out.println(output.top());
      output.pop();
    }
  }
}
