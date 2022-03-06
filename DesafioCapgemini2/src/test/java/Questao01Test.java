import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**Testes funcaoMediana(tamanho, vetor);
 *
 * @author paulo
 */
public class Questao01Test {
  @Test
  public void testFuncaoMediana0() {
    int resultadoEsperado = 0;
    int [] array = null;
    int resultadoObtido = Questao01.funcaoMediana(0, array);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testFuncaoMediana3() {
    int resultadoEsperado = 3;
    int [] array = new int [] {3};
    int resultadoObtido = Questao01.funcaoMediana(1, array);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testFuncaoMediana5() {
    int resultadoEsperado = 4;
    int [] array = new int [] {9, 2, 1, 4, 6};
    int resultadoObtido = Questao01.funcaoMediana(5, array);
    assertEquals(resultadoEsperado, resultadoObtido);
  }

  @Test
  public void testFuncaoMediana7() {
    int resultadoEsperado = 5;
    int [] array = new int [] {2, 5, 3, 8, 6, 1, 7};
    int resultadoObtido = Questao01.funcaoMediana(7, array);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testFuncaoMediana9() {
    int resultadoEsperado = 11;
    int [] array = new int [] {5, 16, 1, 18, 5, 18, 16, 6, 11};
    int resultadoObtido = Questao01.funcaoMediana(9, array);
    assertEquals(resultadoEsperado, resultadoObtido);
  } 
}
