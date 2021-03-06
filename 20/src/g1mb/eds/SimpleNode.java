package g1mb.eds;

/**
 * Nodos para cadenas enlazadas simples
 * y circulares simples.
 */
public class SimpleNode<E> {
  public E data = null;
  public SimpleNode<E> next = null;
  public SimpleNode(E x,
                    SimpleNode<E> y) {
    this.data = x;
    this.next = y;
  }
}
