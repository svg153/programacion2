import java.util.Scanner;

public class ImprimirGuiaOrd {
  // Entrada estándar
  private static Scanner stdin =
    new Scanner(System.in);

  // Lee una orden y la procesa
  private static void leeYProcesaOrden() {
    String orden;
    orden = stdin.next();
    switch (orden) {
    case "a" :
      Contacto c = new Contacto();
      c.nombre = stdin.next();
      c.telefono = stdin.next();
      {
        // Buscar y cambiar o añadir el contacto
        // TODO
      }
      break;
    case "r" :
      String nombre = stdin.next();
      {
        // Buscar y borrar el contacto
        // TODO
      }
    }
  }

  public static void main(String[] args) {
    // Procesamos hasta que no haya órdenes
    while (stdin.hasNext()) {
      leeYProcesaOrden();
    }
    // Imprimimos la agenda
    // TODO
   }
}
