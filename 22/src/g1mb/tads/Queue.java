package g1mb.tads;

/**
 * Interface for the ADT Queue. The semantics is FIFO (First-In
 * First-Out, ie, first element to be extracted is the first element
 * that was added.
 */
public interface Queue<E> {
  /**
   * Adds a given element to the queue (the last element).
   * @param e Element to add.
   */
  public void add(E e);

  /**
   * Removes the first element on the queue.
   */
  public void remove();

  /**
   * Returns the first element on the queue.
   * @return first element on the queue.
   */
  public E peek();

  /**
   * Returns weather the queue is empty or not.
   * @return true if empty.
   */
  public boolean isEmpty();
}
