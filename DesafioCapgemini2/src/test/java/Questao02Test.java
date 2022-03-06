
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**Testes diferencaX(tamanho, vetor, x)
 *
 * @author paulo
 */
public class Questao02Test {
  @Test
  public void testDiferencaX0() {
    int resultadoEsperado = 0;
    int [] array = null;
    int resultadoObtido = Questao02.diferencaX(0, array, 0);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testDiferencaX2() {
    int resultadoEsperado = 3;
    int [] array = new int [] {1, 5, 3, 4, 2};
    int resultadoObtido = Questao02.diferencaX(5, array, 2);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testDiferencaX3() {
    int resultadoEsperado = 2;
    int [] array = new int [] {1, 5, 3, 4, 2};
    int resultadoObtido = Questao02.diferencaX(5, array, 3);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testDiferencaX4() {
    int resultadoEsperado = 1;
    int [] array = new int [] {1, 5, 3, 4, 2};
    int resultadoObtido = Questao02.diferencaX(5, array, 4);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testDiferencaX5() {
    int resultadoEsperado = 0;
    int [] array = new int [] {1, 5, 3, 4, 2};
    int resultadoObtido = Questao02.diferencaX(5, array, 5);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
}

  

