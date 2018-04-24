package animales;

public class PruebaHerencia {
  public static void main(String[] args) {
    Perro unPerro = new Perro();
    Gato unGato = new Gato();
    Oveja unaOveja = new Oveja();
    unPerro.emitirSonido();
    unGato.emitirSonido();
    unaOveja.emitirSonido();
    unPerro.lamerHueso();
    unGato.jugarConOvillo();
    unaOveja.pastar();    
  }
  // public static void main(String[] args) {
  //    Animal flora = new Animal("Flora",3,"beeee");
  //    flora.emitirSonido();

  //    Perro toby = new Perro("Toby",5, "Pepe");
  //    toby.emitirSonido();

  //    // En una variable de tipo Animal se puede guardar la referencia
  //    // a un objeto de tipo Perro. Esto se llama UPCASTING (es
  //    // automático)
  //    Animal perlita = new Oveja("perlita",2, "Juan");
  //    perlita.emitirSonido();

  //    // Otro ejemplo de upcasting
  //    Animal segundaReferenciaParaToby = toby;
  //    segundaReferenciaParaToby.emitirSonido();

  //    System.out.println("Perro en toby: "
  //                       + toby);
  //    System.out.println("Perro en segundaReferenciaParaToby: "
  //                       + segundaReferenciaParaToby);

  //    // la siguiente línea da error de compilación porque un objeto de
  //    // tipo Oveja no puede contener una referencia de tipo Animal
  //    Oveja segundaReferenciaParaPerlita = perlita;
     
  //    // pero se puede hacer DOWNCASTING
  //    Oveja segundaReferenciaParaPerlita = (Oveja) perlita;

  //    // Otro ejemplo de DOWNCASTING
  //    ((Oveja) perlita).pastar();

  //    // Este código da error y no se puede hacer DOWNCASTING
  //    Oveja otraReferenciaParaFlora = (Oveja) flora; 

  //    // En este caso también se puede hacer DOWNCASTING
  //    Perro terceraReferenciaParaToby = (Perro) segundaReferenciaParaToby

  //    // Otro ejemplo de DOWNCASTING
  //    ((Perro) segundaReferenciaParaToby).lamerHueso();

  //    // DOWNCASTING controlado
  //    if (perlita instanceof Oveja){
  //       Oveja perlitaTriplicada = (Oveja) perlita;
  //    } else {
  //        System.out.println("Este objeto no es de tipo Oveja");
  //    }
  //    if (flora instanceof Oveja){
  //       Oveja otraReferenciaParaFlora = (Oveja) flora;
  //    } else {
  //        System.out.println("Este objeto no es de tipo Oveja");
  //    }
  // }
}
