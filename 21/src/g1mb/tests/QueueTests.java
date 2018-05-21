package g1mb.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import g1mb.tads.Queue;
import g1mb.eds.LinkedQueue;

public class QueueTests {
  @Test
  public void lasColasNuevasEstánVacías() {
    Queue<Integer> c;
    c = new LinkedQueue<Integer>();
    assertTrue("Las colas nuevas tienen que estar vacías",
               c.isEmpty());
  }

  @Test
  public void addYpeek() {
    String palabra = "cualquier palabra";
    Queue<String> c;
    c = new LinkedQueue<String>();
    c.add(palabra);
    assertFalse("Una cola tras un add no puede estar vacía",
                c.isEmpty());
    assertEquals("El primer elemento de la cola debería ser primero que se haya añadido",
                 palabra,
                 c.peek());
    c.remove();
    assertTrue("Un add y un remove deberían dar una cola vacía",
               c.isEmpty());
  }

  @Test
  public void lasColasNoAcotadasNoSeLlenan() {
    int N = 1000000;
    Queue<Integer> c;
    c = new LinkedQueue<Integer>();
    for (int i = 0; i < N; i++) {
      c.add(i);
    }
  }

  @Test
  public void lasColasSonLIFO() {
    int N = 1000000;
    Queue<String> c;
    c = new LinkedQueue<String>();
    for (int i = 0; i < N; i++) {
      String palabra = "Palabra " + i;
      c.add(palabra);
      String primero = c.peek();
      assertEquals("El primero debería ser el que se añadió primero",
                   "Palabra 0",
                   primero);
    }
    for (int i = 0; i < N; i++) {
      String palabra = "Palabra " + i;
      String primero = c.peek();
      assertEquals("La cola debe comportarse FIFO",
                   palabra,
                   primero);
      c.remove();
    }
    assertTrue("La cola debe estar vacía",
                c.isEmpty());
  }
}
