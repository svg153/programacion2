package g1mb.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import g1mb.eds.SimpleNode;

public class SimpleNodeTests {

  /**
   * Comprueba que el argumento representa una
   * cadena enlazada vacía.
   */
  private static <E>
    boolean
    comprobarVacia(SimpleNode<E> node) {
    // TODO
    return node == null;
  }

  /**
   * Genera una cadena enlazada con "Palabra 0",
   * "Palabra 1",... "Palabra n-1".
   */
  private static
    SimpleNode<String>
    crearCadenaDePalabras(int n) {
    if (n == 0) {
      return null;
    }
    else {
      SimpleNode<String> primero =
        new SimpleNode<String>("Palabra 0",
                               null);
      SimpleNode<String> ultimo = primero;
      for (int i = 1; i < n; i++) {
        ultimo.next =
          new SimpleNode<String>("Palabra " + i,
                                 null);
        ultimo = ultimo.next;
      }
      return primero;
    }
  }

  /**
   * Devuelve la longitud de la cadena.
   */
  private static <E>
    int longitud(SimpleNode<E> n) {
    // TODO
    return 0;
  }

  /**
   * Devuelve una cadena con un elemento más que
   * la cadena de entrada al principio de la
   * cadena.
   */
  private static <E>
    SimpleNode<E>
    insertarAlPrincipio(SimpleNode<E> n,
                        E s) {
    // TODO
    return null;
  }

  /**
   * Devuelve una cadena con un elemento más que
   * la cadena de entrada al final de la cadena.
   */
  private static <E>
    SimpleNode<E>
    insertarAlFinal(SimpleNode<E> n,
                    E s) {
    // TODO
    return null;
  }

  /**
   * Devuelve una cadena con un elemento más que
   * la cadena de entrada en la posición i.
   */
  private static <E>
    SimpleNode<E>
    insertar(SimpleNode<E> n,
             int i,
             E s) {
    // TODO
    return null;
  }

  /**
   * Devuelve el primer elemento de una cadena.
   */
  private static <E> E primer(SimpleNode<E> n) {
    // TODO
    return null;
  }

  /**
   * Devuelve el último elemento de una cadena.
   */
  private static <E> E ulti(SimpleNode<E> n) {
    // TODO
    return null;
  }

  /**
   * Devuelve el elemento iésimo de una cadaena
   */
  private static <E> E elem(SimpleNode<E> n,
                            int i) {
    // TODO
    return null;
  }

  /**
   * Crea una cadena vacía y otra no vacía y
   * testea la compruebaVacia.
   */
  @Test
  public void crearYComprobarVacio() {
    SimpleNode<Integer> n = null;
    assertTrue("null representa una cadena enlazada vacía",
               comprobarVacia(n));
    n = new SimpleNode<Integer>(5, null);
    assertFalse("Cualquier instancia de SimpleNode representa una cadena enlazada no vacía",
                comprobarVacia(n));
    assertFalse("Una cadena con 1000 palabras no está vacía",
                comprobarVacia(crearCadenaDePalabras(1000)));
  }

  /**
   * Crea cadenas de varias longitudes: 0, 1, 2,
   * 3, y 1000 y comprueba las longitudes.
   */
  @Test
  public void testLongitud() {
    assertEquals(
      "La longitud de la cadena vacía es 0",
      0,
      longitud(null)
    );
    // TODO: añadir más tests
  }

  /**
   * Crea cadenas de varias longitudes: 0, 1, 2,
   * 3, y 1000 y comprueba que las operaciones
   *  de insertar y acceder a los elementos
   * (primer, ulti y elemento) funcionan
   * apropiadamente.
   */
  @Test
  public void insertarYAcceder() {
    assertEquals(
      "La primera palabra es Palabra 0",
      "Palabra 0",
      primer(crearCadenaDePalabras(1))
    );                 
    // TODO: añadir más tests
  }
}
