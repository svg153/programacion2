package phyan.maths;

/**
 * Class Vector represents 2D vectors.
 */
public class Vector {
  /** x represents the X coordinate */
  private double x;
  /** y represents the Y coordinate */
  private double y;

  /**
   * Avoid using default constructor
   */  
  private Vector() {
  }

  /**
   * Creates a Vector given Cartesian
   * coordinates.
   */  
  public Vector(double x,
                double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * Sums this vector with v.
   * @return Returns a new Vector.
   */
  public Vector add(Vector v) {
    return new Vector(this.x + v.x,
                      this.y + v.y);
  }

  /**
   * Scalar multiplication of this with
   * a factor. Returns a new Vector.
   */
  public Vector smul(double f) {
    return new Vector(f * this.x,
                      f * this.y);
  }
}
