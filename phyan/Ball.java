package phyan.world;

import phyan.maths.Vector;

public class Ball {
  // We use a Vector to represent the position in space (meters)
  Vector position;
  // We use a Vector to represent the speed: the length represents m/s.
  Vector speed;

  // Otros "atributos":
  // radio
  // color
  // "bote" (capacidad de rebote)
  // material
  // masa
  // rozamiento
  // nombre
  // aceleración (no está claro que esto sea una propiedad de la bola)

  void step(double time_ms) {
    this.position =
      this.position.add(
        this.speed.smul(
          time_ms / 1000.0
        )
      );
  }
}
