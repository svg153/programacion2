package urm;

public class Registers {
  // Creates the registers
  public Registers() {
  }

  // Sets a register value
  public void set(int n, int v) {
    // TODO: do not resize the array if 0 is set
    // TODO: resize the array if last non zero register is set to 0
    redim(n);
    r[n-1] = v;
  }

  // Returns the value of a register
  public int get(int n) {
    // TODO: do not resize the array if length < n, return 0 directly
    redim(n);
    return r[n-1];
  }

  // Returns the last non-zero register
  public int lastNonZero() {
    return r.length;
  }

  public String toString() {
    String result = "R1: " + get(1);
    for (int n = 2; n <= lastNonZero(); n++) {
      result = result + ", R" + n + ": " + get(n);
    }
    result = result + "...";
    return result;
  }
  
  // Resizes the array
  private void redim(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Bad register " + n);
    }
    // TODO: allow reducing the size
    if (r.length < n) {
      int[] newR = new int[n]; // newR se inicializa a 0s
      for (int i = 0; i < r.length; i++) {
        newR[i] = r[i];
        r = newR;
      }
    }
  }

  // Unlimited registers
  private int[] r = new int[0];
}
