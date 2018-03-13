import java.util.Scanner;

// Lee la entrada estándar e invierte las
public class InvertirPalabras {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    WordStack s = new WordStack();

    while (stdin.hasNext()) {
      s.push(stdin.next());
    }

    // El if es sólo para evitar el error
    // "off-by-1".
    // Recuerda, "There are 2 hard problems in
    // computer science: cache invalidation,
    // naming things, and off-by-1 errors."
    if (!s.isEmpty()) {
      System.out.print(s.top());
      s.pop();      
      while (!s.isEmpty()) {
        System.out.print(" " + s.top());
        s.pop();
      }
    }
}
