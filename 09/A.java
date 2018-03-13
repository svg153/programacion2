package a.b;

public class A {
    private int i;
    private A() {
    }
    public A(int i) {
        this.i = i;
    }
    public String toString() {
        return "Objeto A que contiene " + this.i;
    }
}
