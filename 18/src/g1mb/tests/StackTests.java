package g1mb.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import g1mb.tads.Stack;
import g1mb.eds.ArrayStack;

public class StackTests {
  @Test
  public void lasPilasNuevasEstánVacías() {
    Stack<Integer> s;
    s = new ArrayStack<Integer>();
    assertTrue("Las pilas nuevas tienen que estar vacías",
               s.isEmpty());
  }

  @Test
  public void pushYtop() {
    String palabra = "cualquier palabra";
    Stack<String> s;
    s = new ArrayStack<String>();
    s.push(palabra);
    assertFalse("Una pila tras un push no puede estar vacía",
                s.isEmpty());
    assertEquals("La cima de la pila debería ser último que hayas empujado",
                 palabra,
                 s.top());
    s.pop();
    assertTrue("Un push y un pop deberían dar una pila vacía",
               s.isEmpty());
  }

  @Test
  public void lasPilasNoAcotadasNoSeLlenan() {
    int N = 1000000;
    Stack<Integer> s;
    s = new ArrayStack<Integer>();
    for (int i = 0; i < N; i++) {
      s.push(i);
    }
  }

  @Test
  public void lasPilasSonLIFO() {
    int N = 1000000;
    Stack<String> s;
    s = new ArrayStack<String>();
    for (int i = 0; i < N; i++) {
      String palabra = "Palabra " + i;
      s.push(palabra);
      String cima = s.top();
      assertEquals("Lo que acabamos de empujar debería estar en la cima",
                   palabra,
                   cima);
    }
    for (int i = N-1; i >= 0; i--) {
      String palabra = "Palabra " + i;
      String cima = s.top();
      assertEquals("La pila debe comportarse LIFO",
                   palabra,
                   cima);
      s.pop();
    }
    assertTrue("La pila debe estar vacía",
                s.isEmpty());
  }
}
