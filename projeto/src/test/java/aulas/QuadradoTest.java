package aulas;

// https://junit.org/junit5/docs/current/user-guide/
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuadradoTest {

  @Test
  public void objetoNaoPodeSerNull() {
    Quadrado q1 = new Quadrado(12.0);
    assertNotNull(q1);
  }

  @Test
  public void ladoDeveEstarDefinido() {
    double valorEsperado = 12.0;
    Quadrado q1 = new Quadrado(valorEsperado);
    assertEquals(valorEsperado, q1.getLado());
  }

  @Test
  public void deveLancarExcecaoCasoLadoForIgualAZero() {
    Exception exception = assertThrows(
      IllegalArgumentException.class, () -> new Quadrado(0)
    );
    assertEquals("Lado deve ser maior que zero", exception.getMessage());
  }

  @Test
  public void deveLancarExcecaoCasoLadoForMenorQueZero() {
    Exception exception = assertThrows(
      IllegalArgumentException.class, () -> new Quadrado(-2.5)
    );
    assertEquals("Lado deve ser maior que zero", exception.getMessage());
  }

  @Test
  public void deveRetornarArea() {
    Quadrado q1 = new Quadrado(10.0);
    assertEquals(100.00, q1.area());
  }

    @Test
  public void deveRetornarPerimetro() {
    Quadrado q1 = new Quadrado(10.0);
    assertEquals(40.00, q1.perimetro());
  }
}