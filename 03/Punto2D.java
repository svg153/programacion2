class Punto2D {
  // Atributos: coordenadas polares
  // Visibilidad: public, private, protected
  private double r;
  private double a;

  // Variable global compartida por todas
  // las instancias y accesible desde el
  // código cliente mediante Punto2D.global
  // Nota: no se puede cambiar la referencia
  // pero só el contenido.
  final static public Punto2D global =
    new Punto2D();

  // Constructores

  // Crea el punto (0, 0)
  public Punto2D() {
    r = 0;
  }

  // Crea el punto (x,y) (cartesianas!!!)
  public Punto2D (double x,
                  double y) {
    this.setXY(x,y);
  }

  // Métodos "públicos" del objeto
  public double distanciaAl0() {
    return r;
  }

  public void setX(double x) {
    double y = this.getY();
    setXY(x, y);
  }
  
  public double getX() {
    return r * Math.cos(a);
  }
  
  public void setY(double y) {
    double x = this.getX();
    setXY(x, y);
  }
  
  public double getY() {
    return r * Math.sin(a);
  }

  // Métodos auxiliares
  private void setXY(double x,
                     double y) {
    this.r = Math.sqrt(x*x + y*y);
    if (x == 0) {
      if (y < 0) {
        this.a = -Math.PI / 2;
      }
      else {
        this.a = Math.PI / 2;
      }
    }
    else {
      this.a = Math.atan(y / x);
    }    
  }
}
