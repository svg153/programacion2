class HolaPuntos {
  public static void
    main(String argv[]) {
    Punto2D p1 = new Punto2D();
    Punto2D p2 = new Punto2D();
    Punto2D p3 = p1;
    // Ahora p es una referencia a un
    // objeto de la clase Punto2D
    // que tiene dentro una x == 4.0
    // y una y == 5.0
    // TODO: hacer algo con ese punto
    System.out.println
      ("El objeto p1 es " + p1);
    System.out.println
      ("El objeto p2 es " + p2);
    System.out.println
      ("El objeto p3 es " + p3);
    p1.setX(4.0);
    p1.setY(5.0);
    System.out.println
      ("El punto p1 es ("
       + p1.getX() + "," + p1.getY() + ")");
    p2.setX(1.0);
    p2.setY(1.0);
    System.out.println
      ("El punto p2 es ("
       + p2.getX() + "," + p2.getY() + ")");
    System.out.println
      ("El punto p3 es ("
       + p3.getX() + "," + p3.getY() + ")");

    Punto2D p4 = new Punto2D(7.0, 2.0);
    Punto2D p5 = new Punto2D(-1.0, 2.0);

    System.out.println
      ("Distancia al 0 de p1 es " +
       p1.distanciaAl0());
    System.out.println
      ("Distancia al 0 de p2 es " +
       p2.distanciaAl0());
    System.out.println
      ("Distancia al 0 de p3 es " +
       p3.distanciaAl0());
    System.out.println
      ("Distancia al 0 de p4 es " +
       p4.distanciaAl0());
    System.out.println
      ("Distancia al 0 de p5 es " +
       p5.distanciaAl0());
  }
}
