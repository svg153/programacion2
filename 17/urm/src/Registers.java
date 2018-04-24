package urm;

public class Registers {
  // Creates the registers
  public Registers() {
  }

  // Sets a register value
  public void set(int n, int v) {
    redim(n);
    r[n-1] = v;
  }

  // Returns the value of a register
  public int get(int n) {
    redim(n);
    return r[n-1];
  }

  // Resizes the array if needed
  private void redim(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Bad register " + n);
    }
    if (r.length < n) {
      int[] newR = new int[n];
      // newR se inicializa a 0s
      for (int i = 0; i < r.length; i++) {
        newR[i] = r[i];
        r = newR;
      }
    }
  }

  // Los registros ilimitados se representan con un array que se
  // redimensiona mientras se necesario
  private int[] r = new int[0];
}
