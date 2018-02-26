/**
 * Representa un contacto: nombre + teléfono.
 *
 * Importante: para este ejercicio exponemos los atributos.
 */
public class Contacto {
  public String nombre;
  public String telefono;
  public Contacto() {
  }
  public String toString() {
    return "{\"nombre\": \"" + nombre +
      "\", \"telefono\":\"" + telefono + "\"}";
  }
}
