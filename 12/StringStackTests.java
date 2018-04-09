import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StringStackTests {
  @Test
  public void lasPilasNuevasEstánVacías() {
    StringStack s;
    s = new StringStack(10);
    assertTrue("Las pilas nuevas tienen que estar vacías",
               s.isEmpty());
  }

  @Test
  public void lasPilasNuevasNoEstánLlenas() {
    StringStack s;
    s = new StringStack(10);
    assertFalse("Una pila nueva no debe estar llena",
                s.isFull());
  }

  @Test
  public void pushYtop() {
    String palabra = "cualquier palabra";
    StringStack s;
    s = new StringStack(10);
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
    int n = 10;
    String palabra = "cualquier palabra";
    StringStack s;
    s = new StringStack(n);
    for (int i = 0; i < n; i++) {
      s.push(palabra);
    }
    assertTrue("Tras llenar una pila, ésta debe estar llena",
                s.isFull());
  }
}
