package principal;

import a.b.A;
import a.c.B;

public class Programa {
    public static void
        main(String argv[]) {
        A a1 = new A(42);
        B b1 = new B(new A(21));
        System.out.println(a1);
        System.out.println(b1);
    }
}

