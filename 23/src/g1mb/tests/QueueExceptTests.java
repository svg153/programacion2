package g1mb.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;

import g1mb.tads.QueueExcept;
import g1mb.eds.LinkedQueueExcept;

public class QueueExceptTests {
  @Rule
  public Timeout globalTimeout = Timeout.seconds(30);

  @Test
  public void lasColasNuevasEstánVacías() {
    QueueExcept<Integer> c;
    c = new LinkedQueueExcept<Integer>();
    assertTrue("Las colas nuevas tienen que estar vacías",
               c.isEmpty());
  }

  @Test
  public void addYpeek() {
    String palabra = "cualquier palabra";
    QueueExcept<String> c;
    c = new LinkedQueueExcept<String>();
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
    QueueExcept<Integer> c;
    c = new LinkedQueueExcept<Integer>();
    for (int i = 0; i < N; i++) {
      c.add(i);
    }
  }

  @Test
  public void lasColasSonLIFO() {
    // Jugar con este número
    int N = 25000;
    QueueExcept<String> c;
    c = new LinkedQueueExcept<String>();
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
