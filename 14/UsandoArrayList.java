import list.ArrayList;

public class UsandoArrayList {

  public static void main(String[] args) {
    String s1 = new String("Hola");
    String s2 = new String("Adios");
    ArrayList<String> l = new ArrayList<String>();
    System.out.println("Size: " + l.size());

    l.add(0, s1);
    l.add(1, s2);
    l.add(2, "En");
    l.set(1, "un");
    l.add(3, "Hola");

    // Recorrido del array list l
    for (int i = 0; i < l.size(); i++) {
      System.out.println("Pos " + i + ": "
                         + l.get(i));
    }

    // Búsqueda por valor (internamente se usa equals, por eso
    // encuentra el "primer" Hola
    System.out.println("Hola está en... "
                       + l.indexOf("Hola"));

    // Enésima prueba de diferencia entre == y .equals
    System.out.println(s1 == l.get(3));
    System.out.println(s1.equals(l.get(3)));

    // Llenamos un array list de enteros, desde el 2 hasta el 1002
    ArrayList<Integer> criba =
      new ArrayList<Integer>();
    for (int i = 0; i < 1000; i++) {
      criba.add(i,i+2);
    }

    // Cribamos los que ocupan las posiciones múltiplo de criba.get(0)
    // (es decir 2)
    Integer p = criba.get(0);
    for (int i = p;
         i < criba.size();
         i = i + p - 1) {
      criba.removeElementAt(i);
    }
    System.out.println(criba);
  }
}

