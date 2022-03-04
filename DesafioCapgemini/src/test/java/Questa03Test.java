import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author paulo
 */
public class Questa03Test {
  @Test
  public void contaParesAnagramas2() {
    int resultadoEsperado = 2;
    int resultadoObtido = Questa03.contaParesAnagramas("ovo");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaParesAnagramas3() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questa03.contaParesAnagramas("ifailuhkqq");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaParesAnagramas31() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questa03.contaParesAnagramas("ovov");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaParesAnagramas5() {
    int resultadoEsperado = 5;
    int resultadoObtido = Questa03.contaParesAnagramas("alala");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaParesAnagramas7() {
    int resultadoEsperado = 7;
    int resultadoObtido = Questa03.contaParesAnagramas("ovoovo");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaParesAnagramas15() {
    int resultadoEsperado = 15;
    int resultadoObtido = Questa03.contaParesAnagramas("perdaepdra");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
}
