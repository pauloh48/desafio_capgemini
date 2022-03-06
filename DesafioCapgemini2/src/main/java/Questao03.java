
import java.util.Scanner;

/**Classe de execução da questão 03
 *
 * @author paulo
 */
public class Questao03 {
  
  /**Método que criptografar um texto. Recebe um texto, o converte em um array de
   * char, calcula o tamanho do grid, em seguida gera a frase percorrendo 2 loops
   * o primeiro desloca as linhas (inserindo espaço) e o segundo as colunas (
   * inserindo as letras) do grid.
   * 
   * @param texto String - texto digitado pelo usuário.
   * @return textoCriptografado String - texto criptografado.
   */
  static String criptografia(String texto){
    char [] TextoSemEspacoChar;
    int tamanhoGrid;
    String textoCriptografado = "";
    
    String TextoSemEspaco = texto.replace(" ", "");
    TextoSemEspacoChar = TextoSemEspaco.toCharArray();
    
    tamanhoGrid = (int)Math.ceil(Math.sqrt(TextoSemEspacoChar.length));
    
    for(int i = 0; i<tamanhoGrid; i++){
      for(int j = i; j<tamanhoGrid*tamanhoGrid; j = j+tamanhoGrid){
        if(j < TextoSemEspacoChar.length)
          textoCriptografado = textoCriptografado + TextoSemEspacoChar[j];
      }
      if(i < tamanhoGrid-1)
        textoCriptografado = textoCriptografado + " ";
    }
    return textoCriptografado;
  }
  
  /** Método principal para execução do programa;
   * 
   * @param args 
   */
  public static void main(String[] args){
    String texto;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite o texto a ser criptografado:");
    texto = teclado.nextLine();
    
    System.out.println(criptografia(texto));
  }
}
