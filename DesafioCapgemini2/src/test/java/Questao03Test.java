import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**Testes criptografia(String texto)
 *
 * @author paulo
 */
public class Questao03Test {
  @Test
  public void testCriptografia1() {
    String resultadoEsperado = "taoa eum nmd hbi";
    String resultadoObtido = Questao03.criptografia("tenha um bom dia");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testCriptografia2() {
    String resultadoEsperado = "omd luo an";
    String resultadoObtido = Questao03.criptografia("ola mundo");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testCriptografia3() {
    String resultadoEsperado = "eoa uui vsr";
    String resultadoObtido = Questao03.criptografia("eu vou sair");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testCriptografia4() {
    String resultadoEsperado = "eeou ucmd piea rsmr";
    String resultadoObtido = Questao03.criptografia("eu preciso me mudar");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testCriptografia5() {
    String resultadoEsperado = "elii uano vptr ore uor";
    String resultadoObtido = Questao03.criptografia("eu vou la pro interior");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void testCriptografia6() {
    String resultadoEsperado = "vvrm oeti urom vpd iee";
    String resultadoObtido = Questao03.criptografia("vou viver perto de mim");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
}
