public class HolaMundo {
    public static void main(String[] args) {
				MiClase variable = new MiClase(...);
				A a1 = new A();
				A a2 = new A();
				A a3 = a1;
				System.out.println("a1.getX() == " +
													 a1.getX());
				System.out.println("a2.getX() == " +
													 a2.getX());
				System.out.println("a3.getX() == " +
													 a3.getX());
				a1.setX(1);
				System.out.println("a1.setX(1);");
				System.out.println("a1.getX() == " +
													 a1.getX());
				System.out.println("a2.getX() == " +
													 a2.getX());
				System.out.println("a3.getX() == " +
													 a3.getX());
				a2.setX(2);
				System.out.println("a2.setX(2);");
				System.out.println("a1.getX() == " +
													 a1.getX());
				System.out.println("a2.getX() == " +
													 a2.getX());
				System.out.println("a3.getX() == " +
													 a3.getX());
				a3.setX(3);
				System.out.println("a3.setX(3);");
				System.out.println("a1.getX() == " +
													 a1.getX());
				System.out.println("a2.getX() == " +
													 a2.getX());
				System.out.println("a3.getX() == " +
													 a3.getX());
				System.out.println("a1 == " + a1);
				System.out.println("a2 == " + a2);
				System.out.println("a3 == " + a3);
				// R r1 = new R(2);
				// R r2 = new R(2);
				// r1.setR(r2);
				R r1 = new R(1);
				r1.setR(new R(2));
   }
}
