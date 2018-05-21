package g1mb.tads;

/**
 * Interface del TAD Stack (pila). La semántica del TAD es LIFO
 * (Last-In First-Out, es decir, el primer elemento en poder extraer
 * es el último que se introdujo).
 */
public interface Stack<E> {
  /**
   * Devuelve true si la pila thos no tiene ningún elemento
   */
  public boolean isEmpty();

  /**
   * Apila el elemento x en la pila (lo deja en la cima de la pila)
   */
  public void push(E x);

  /**
   * Devuelve la cima de la pila (último push).
   */
  public E top();

  /**
   * Elimina la cima de la pila.
   */
  public void pop();
}
