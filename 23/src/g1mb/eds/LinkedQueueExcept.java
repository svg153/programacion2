package g1mb.eds;

/**
 * Implementación del TAD Queue utilizando cadenas enlazadas y
 * excepciones.
 */
public class LinkedQueueExcept<E>
  implements g1mb.tads.QueueExcept<E> {

  /* ultimo es el primer nodo de la cadena que representa el último insertado en la cola */
  private SimpleNode<E> ultimo;
  /* primero es el último nodo de la cadena que representa el primero insertado en la cola */
  private SimpleNode<E> primero;

  public LinkedQueueExcept() {
    ultimo = null;
    primero = null;
  }

  public void add(E e) {
    ultimo = new SimpleNode<E>(e, ultimo);
    // Si es el único nodo tambiñen es el primero.
    if (ultimo.next == null) {
      primero = ultimo;
    }
  }

  public void remove() {
    if (ultimo.next == null) {
      // Se borra el único nodo y todo se queda vacío
      ultimo = null;
      primero = null;
    }
    else {
      // Hacemos que primero apunte al penúltimo.
      primero = ultimo;
      while (primero.next.next != null) {
        primero = primero.next;
      }
      primero.next = null;
    }
  }

  public E peek() {
    return primero.data;
  }

  public boolean isEmpty() {
    return ultimo == null;
  }
}
