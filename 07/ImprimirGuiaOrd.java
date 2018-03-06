import java.util.Scanner;

public class ImprimirGuiaOrd {
  static private AgendaOrdenada agenda =
    new AgendaOrdenada(20);

  // Entrada estándar
  private static Scanner stdin =
    new Scanner(System.in);

  // Lee una orden y la procesa
  private static void leeYProcesaOrden() {
    String orden;
    String nombre;
    String telefono;
    orden = stdin.next();
    switch (orden) {
    case "a" :
      nombre = stdin.next();
      telefono = stdin.next();
      agenda.añadir(nombre, telefono);
      break;
    case "r" :
      nombre = stdin.next();
      agenda.borrar(nombre);
    }
  }

  public static void main(String[] args) {
    // Procesamos hasta que no haya órdenes
    while (stdin.hasNext()) {
      leeYProcesaOrden();
    }
    System.println(agenda.agendaAstring());
   }
}
