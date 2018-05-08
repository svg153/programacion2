package g1mb.eds;

/**
 * Implementación del TAD Stack (pila) utilizando la técnica de los
 * vectores redimensionables.
 */
public class ArrayStack<E> implements g1mb.tads.Stack<E> {

  // FACTOR_CRECIMIENTO en cuanto se redimiensiona el array cuando
  // falta o sobra espacio
  private final static int FACTOR_CRECIMIENTO = 1000;

  // Java no permite crear arrays de genéricos, en este caso, no
  // permite hacer directamente new E[] y hay que usar el truco de
  // crear un array de objetos y hacer un downcasting (eso genera un
  // warning que eliminamos con @SuppressWarnings("unchecked")
  @SuppressWarnings("unchecked")
  private E[] datos = (E[]) new Object[1];
  // cima es el índice del array en el que está la cima de la pila,
  // por "encima" sólo hay nulls en el array, es -1 cuando está vacía
  private int cima = -1;

  public ArrayStack() {
  }

  public boolean isEmpty() {
    return this.cima < 0;
  }

  public void push(E x) {
    this.cima = this.cima + 1;
    // Miramos si el array es suficientemente grande, si no, lo
    // redimensionamos
    if (this.datos.length <= this.cima) {
      @SuppressWarnings("unchecked")
      E[] nuevoArray =
        (E[]) new Object[this.datos.length + FACTOR_CRECIMIENTO];
      for (int i = 0; i < this.cima; i++) {
        nuevoArray[i] = this.datos[i];
      }
      this.datos = nuevoArray;
    }
    this.datos[this.cima] = x;
  }

  public E top() {
    return this.datos[this.cima];
  }

  public void pop() {
    // Ponemos null en la cima actual (sólo para que Java tenga la
    // oportunidad de liberar memoria)
    this.datos[this.cima] = null;
    // La cima ahora va a ser el elemento pro debajo de éste
    this.cima = this.cima - 1;
    // Miramos si el array es demasiado grande, si lo es, lo
    // redimensionamos a la baja
    if (this.cima < this.datos.length - FACTOR_CRECIMIENTO) {
      @SuppressWarnings("unchecked")
      E[] nuevoArray =
        (E[]) new Object[this.datos.length - FACTOR_CRECIMIENTO];
      for (int i = 0; i <= this.cima; i++) {
        nuevoArray[i] = this.datos[i];
      }
      this.datos = nuevoArray;
    }
  }
}
