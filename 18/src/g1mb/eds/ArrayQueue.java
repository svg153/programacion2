package g1mb.eds;

/**
 * Implementation of ADT Queue using the technique of resizeable
 * array. The queue is implemented as a circular array.
 */
public class ArrayQueue<E> implements g1mb.tads.Queue<E> {
  // FACTOR_CRECIMIENTO en cuanto se redimiensiona el array cuando
  // falta o sobra espacio
  private final static int FACTOR_CRECIMIENTO = 1000;

  // Java no permite crear arrays de genéricos, en este caso, no
  // permite hacer directamente new E[] y hay que usar el truco de
  // crear un array de objetos y hacer un downcasting (eso genera un
  // warning que eliminamos con @SuppressWarnings("unchecked")
  @SuppressWarnings("unchecked")
  private E[] datos = (E[]) new Object[1];
  // Array circular: para evitar tener desplazar los elementos del
  // array cada vez que se hace un remove, utilizamos dos índices, uno
  // de ellos dice donde está el primer elemento y otro el número de
  // elementos en la cola. Así, la cola cuyo primer elemento es A, el
  // segundo B, el tercero C y el cuarto D, puede representarse en un
  // array de 6 elementos como este {D, null, null, A, B, C} siendo el
  // primero == 3 y nDatos == 4.
  private int nDatos = 0;
  private int primero = 0;

  public ArrayQueue() {
  }

  public void add(E e) {
  }

  public void remove() {
  }

  public E peek() {
    return this.datos[primero];
  }

  public boolean isEmpty() {
    return this.nDatos == 0;
  }
}
