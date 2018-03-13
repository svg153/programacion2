package a.c;

import a.b.A;

public class B {
    private A a;
    private B() {
    }
    public B(A a) {
	this.a = a;
    }
    public String toString() {
	return "Objeto B que contiene a " + this.a;
    }
    
}
