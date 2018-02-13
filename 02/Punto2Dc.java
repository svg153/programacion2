class Punto2D {
  // Atributos: coordenadas cartesianas
  private double x;
  private double y;
  // Constructores
  Punto2D() {
    x = 0; y = 0;
  }
  Punto2D (double x,
           double y) {
    this.setXY(x,y);
  }
  // Métodos "normales" del objeto
  double distanciaAl0() {
    return Math.sqrt(x*x + y*y);
  }

  void setX(double x) {
    this.x = x;
  }
  
  double getX() {
    return this.x;
  }
  
  void setY(double y) {
    this.y = y;
  }
  
  double getY() {
    return this.y;
  }
}
