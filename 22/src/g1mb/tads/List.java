package g1mb.tads;

/**
 * Interfaz del TAD List. El acceso a los datos es "random", es decir,
 * se puede acceder a cualquier elemento de la lista.
 */
public interface List<E> {
  /**
   * Devuelve la longitud de la lista.
   */
  public int size();

  /**
   * Devuelve el elemento que haya en la posición i de la lista.
   */
  public E get(int i);

  /**
   * Sustituye el elemento que hay en la posición i de
   * la lista por el elemento e.
   */
  public void set(int i, E e);

  /**
   * Añade el elemento e en la posición i de la lista.
   */
  public void add(int i, E e);

  /**
   * Elimina el elemento e de la lista.
   */
  public void remove(E e);

  /**
   * Devuelve la posición que ocupa en la lista el elemento e.
   */
  public int indexOf(E e);
}
