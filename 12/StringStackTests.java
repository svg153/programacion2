import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StringStackTests {
  private static int N = 100;
  @Test
  public void lasPilasNuevasEstánVacías() {
    StringStack s;
    s = new StringStack(N);
    assertTrue("Las pilas nuevas tienen que estar vacías",
               s.isEmpty());
  }

  @Test
  public void lasPilasNuevasNoEstánLlenas() {
    StringStack s;
    s = new StringStack(N);
    assertFalse("Una pila nueva no debe estar llena",
                s.isFull());
  }

  @Test
  public void pushYtop() {
    String palabra = "cualquier palabra";
    StringStack s;
    s = new StringStack(N);
    s.push(palabra);
    assertFalse("Una pila tras un push no puede estar vacía",
                s.isEmpty());
    assertFalse("Un sólo push no llena una pila",
                s.isFull());
    assertTrue("La cima de la pila es lo último que hayas empujado",
               palabra.equals(s.top()));
    s.pop();
    assertTrue("Un push y un pop dan una pila vacía",
               s.isEmpty());
  }

  @Test
  public void pilaLlenaTrasLlenado() {
    String palabra = "cualquier palabra";
    StringStack s;
    s = new StringStack(N);
    for (int i = 0; i < N; i++) {
      s.push(palabra);
    }
    assertTrue("Tras llenar una pila, ésta debe estar llena",
                s.isFull());
  }

  @Test
  public void lasPilasDeCapacidad0SiempreEstánLlenas() {
    StringStack s;
    s = new StringStack(0);
    assertTrue("Una pila nueva de capacidad 0 debe estar llena",
               s.isFull());
  }

  @Test
  public void lasPilasSonLIFO() {
    StringStack s;
    s = new StringStack(N);
    for (int i = 0; i < N; i++) {
      String palabra = "Palabra " + i;
      s.push(palabra);
      String cima = s.top();
      assertEquals("Lo que acabamos de empujar está en la cima",
                   palabra,
                   cima);
    }
    assertTrue("La pila debe estar llena",
                s.isFull());
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
