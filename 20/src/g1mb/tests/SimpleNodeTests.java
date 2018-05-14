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
    boolean compruebaVacia(SimpleNode<E> node) {
    // TODO
    return false;
  }

  /**
   * Genera una cadena enlazada con "Palabra 0",
   * "Palabra 1",... "Palabra n".
   */
  private static
    SimpleNode<String>
    crearCadenaDePalabras(int n) {
    // TODO
    return null;
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
    insertarAlPrincipio(SimpleNode<E> n) {
    // TODO
    return n;
  }

  /**
   * Devuelve una cadena con un elemento más que
   * la cadena de entrada al final de la cadena.
   */
  private static <E>
    SimpleNode<E>
    insertarAlFinal(SimpleNode<E> n) {
    // TODO
    return n;
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
    return n;
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
    assertTrue("null representa una cadena enlazada vacóa",
               checkEmpty(n));
    n = new SimpleNode<Integer>();
    assertFalse("Cualquier instancia de SimpleNode representa una cadena enlazada no vacía",
                checkEmpty(n));
  }

  /**
   * Crea cadenas de varias longitudes: 0, 1, 2,
   * 3, y 1000 y comprueba las longitudes.
   */
  @Test
  public void testLongitud() {
    // TODO
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
    // TODO
  }
}
