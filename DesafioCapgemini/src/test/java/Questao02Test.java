import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author paulo
 */
public class Questao02Test {
  @Test
  public void contaCarcacterForteFalta3casoDesafio() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("Ya3");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta5caso1() {
    int resultadoEsperado = 5;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("o");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta4caso1() {
    int resultadoEsperado = 4;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("oo");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta3caso1() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("ooo");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta31caso1() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("oooo");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta32caso1() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("ooooo");
    assertEquals(resultadoEsperado, resultadoObtido);  
  }
  
  @Test
  public void contaCarcacterForteFalta33caso1() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("oooooooooo");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  
  @Test
  public void contaCarcacterForteFalta5caso2() {
    int resultadoEsperado = 5;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("O");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta4caso2() {
    int resultadoEsperado = 4;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("oO");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta3caso2() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("ooO");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta2caso2() {
    int resultadoEsperado = 2;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("ooooooO");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  
  @Test
  public void contaCarcacterForteFalta5caso3() {
    int resultadoEsperado = 5;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("1");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta4caso3() {
    int resultadoEsperado = 4;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("O1");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta3caso3() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("oO1");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta2caso3() {
    int resultadoEsperado = 2;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("ooO1");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta1caso3() {
    int resultadoEsperado = 1;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("ooooooO1");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  
  @Test
  public void contaCarcacterForteFalta5caso4() {
    int resultadoEsperado = 5;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("!");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta4caso4() {
    int resultadoEsperado = 4;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("1!");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta3caso4() {
    int resultadoEsperado = 3;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("O1!");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta2caso4() {
    int resultadoEsperado = 2;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("oO1!");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
  
  @Test
  public void contaCarcacterForteFalta1caso4() {
    int resultadoEsperado = 1;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("ooO1!");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
 
  @Test
  public void FaltaCarcacterForte0caso4() {
    int resultadoEsperado = 0;
    int resultadoObtido = Questao02.contaCarcacterForteFalta("ooooooO1!");
    assertEquals(resultadoEsperado, resultadoObtido);
  }
}
