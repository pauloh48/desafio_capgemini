import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author paulo
 */
public class Questao01Test {
  @Test
  public void criaEscada1() {
    String resultadoEsperado = "*\n";
    String resultadoObtido = Questao01.criaEscada(1);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void criaEscada3() {
    String resultadoEsperado = "  *\n **\n***\n";
    String resultadoObtido = Questao01.criaEscada(3);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void criaEscada6() {
    String resultadoEsperado = "     *\n    **\n   ***\n  ****\n *****\n******\n";
    String resultadoObtido = Questao01.criaEscada(6);
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
}


