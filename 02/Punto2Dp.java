class Punto2D {
  // Atributos: coordenadas polares
  private double r;
  private double a;

  // Constructores
  Punto2D() {
    r = 0;
  }

  Punto2D (double x,
           double y) {
    this.setXY(x,y);
  }

  // Métodos "normales" del objeto
  double distanciaAl0() {
    return r;
  }

  void setX(double x) {
    double y = this.getY();
    this.setXY(x, y);
  }
  
  double getX() {
    return r * Math.cos(a);
  }
  
  void setY(double y) {
    double x = this.getX();
    this.setXY(x, y);
  }
  
  double getY() {
    return r * Math.sin(a);
  }

  // Métodos auxiliares
  void setXY(double x,
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
