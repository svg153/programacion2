import java.io.BufferedReader;
import java.io.FileReader;
// import java.io.IOException;

import list.ArrayList;

public class EjemplosExcept {
  private EjemplosExcept() {}

  private static String indiceFueraDeRango(String a[]) {
    return a[a.length];
  }
  
  public static void main(String[] args) throws Exception {
    int i;
    
    // Provocamos varias exceptiones
    // System.out.println("Intento de dividir por 0");
    // i = 42 / 0;
    // System.out.println("Intento de acceso a índice de array fuera de rango");
    // indiceFueraDeRango(new String[42]);

    // Integer j = (Integer) new ArrayList().get(1);

    // // Y ahora las capturamos
    // try {
    //   // i = 42 / 0;
    //   indiceFueraDeRango(new String[42]);
    // }
    // catch (Exception e) {
    //   System.out.println(
    //     "Capturada excepción: " + e.toString()
    //   );
    //   // Exploramos qué hay dentro de una excepción
    //   System.out.println(
    //     "Mensaje: " + e.getMessage()
    //   );
    //   System.out.println("Stack trace:");
    //   e.printStackTrace();
    // }

    // // Y ahora las capturamos "por separado"
    // try {
    //   // i = 42 / 0;
    //   indiceFueraDeRango(new String[42]);
    // }
    // catch (ArithmeticException e) {
    //   System.out.println("Se ha intentando dividir por 0: " + e);
    // }
    // catch (ArrayIndexOutOfBoundsException e) {
    //   System.out.println("Se ha intentado acceder a un índice de una array fuera de rango: " + e);
    // }

    // "Checked exception"
    System.out.println("Intento de abrir fichero");
    FileReader fr =
      new FileReader("supercalifragilisticoespealidoso.supercalifragilisticoespealidoso");
    BufferedReader br = new BufferedReader(fr);
    String linea;
    do {
      linea = br.readLine();
    } while (linea != null);
    System.out.println("Fin de ejecución del main!!!");
  }
}
