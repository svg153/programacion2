package g1mb.tads;

/**
 * Interface for the ADT Queue. The semantics is FIFO (First-In
 * First-Out, ie, first element to be extracted is the first element
 * that was added.
 */
public interface QueueExcept<E> {
  /**
   * Adds a given element to the queue (the last element).
   * @param e Element to add.
   */
  public void add(E e);

  /**
   * Removes the first element on the queue.
   * @pre !isEmpty()
   * @throws EmptyQueueException
   */
  public void remove() throws EmptyQueueException;

  /**
   * Returns the first element on the queue.
   * @pre !isEmpty()
   * @return first element on the queue.
   * @throws EmptyQueueException
   */
  public E peek() throws EmptyQueueException;

  /**
   * Returns weather the queue is empty or not.
   * @return true if empty.
   */
  public boolean isEmpty();
}
