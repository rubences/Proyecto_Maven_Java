package aulas;

public class Quadrado {
  private double lado;

  public Quadrado(double lado) {
    if(lado <= 0)
      throw new IllegalArgumentException("Lado deve ser maior que zero");
    this.lado = lado;
  }

  public double area() {
    return lado * lado;
  }

  public double perimetro() {
    return 4 * lado;
  }

  public double getLado() {
    return lado;
  }
}