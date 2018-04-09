import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class StringStackTests {
  @Test
  public void lasPilasNuevasEstánVacías() {
    StringStack s;
    s = new StringStack(10);
    assertTrue(s.isEmpty());
  }

  @Test
  public void lasPilasNuevasNoEstánLlenas() {
    StringStack s;
    s = new StringStack(10);
    assertFalse(s.isEmpty());
  }
}
