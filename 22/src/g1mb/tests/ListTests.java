package g1mb.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import g1mb.tads.List;
import g1mb.eds.LinkedList;

public class ListTests {
  @Test
  public void lasListasNuevasEstánVacías() {
    List<Integer> l;
    l = new LinkedList<Integer>();
    assertEquals("Las listas nuevas tienen que estar vacías",
                 0,
                 l.size());
  }

  @Test
  public void add() {
    String palabra = "cualquier palabra";
    List<String> l;
    l = new LinkedList<String>();
    l.add(0,palabra);
    assertFalse("Una list tras un add no puede estar vacía",
                l.size() == 0);
    assertEquals("Tiene que haber un elemento en el índice 0",
                 palabra,
                 l.get(0));
    l.remove(palabra);
    assertTrue("Un add y un remove deberían dar una list vacía",
               l.size() == 0);
  }

  @Test
  public void lasListasNoAcotadasNoSeLlenan() {
    int N = 1000000;
    List<Integer> l;
    l = new LinkedList<Integer>();
    for (int i = 0; i < N; i++) {
      l.add(i,i);
    }
    assertEquals("El tamaño de la lista es el de todos los datos añadidos",
                 N,
                 l.size());
  }

  @Test
  public void lasListasSonRandom() {
    String supercali = "Supercalifragilisticoespialidoso";
    int N = 1000000;
    List<String> l;
    l = new LinkedList<String>();
    for (int i = 0; i < N; i++) {
      String palabra = "Palabra " + i;
      l.add(i, palabra);
    }
    String primero = l.get(0);
    assertEquals("El primero debería ser el que se añadió primero",
                 "Palabra 0",
                 primero);
    assertEquals("El tamaño de la lista es el de todos los datos añadidos",
                 N,
                 l.size());
    for (int i = 0; i < N; i = i + 10) {
      l.set(i, supercali);
    }
    for (int i = 0; i < N; i++) {
      String esperado = i % 10 == 0 ? supercali : "Palabra " + i;
      assertEquals("Debería ser " + esperado,
                   esperado,
                   l.get(i));
    }
    l.remove(supercali);
    assertEquals("Test del tamaño tras quitar todas las " + supercali,
                 N / 10,
                 l.size());
    assertEquals("Test índice 10 tras quitar todas las " + supercali,
                 "Palabra " + 11,
                 l.get(10));
  }
}
