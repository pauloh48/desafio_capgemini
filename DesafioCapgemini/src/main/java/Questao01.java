import java.util.Scanner;

/**Classe de execução da questão 01
 * 
 * @author paulo
 */
public class Questao01 {
  
  /**Método para gerar uma escada de '*' com tamanho n no qual se concatena os 
   * caracteres 'espaço' e '*'. Em cada linha gerada é decrementado a quantidade 
   * de espaços, iniciado com n-1 e incrementado a quantidade de '*', iniciado com 1;
   *
   * @author paulo
   * @param tamanhoEscada int - define o tamanho da escada.
   * @return escada String - escada gerada.
   */
  static String criaEscada(int tamanhoEscada){
    int flag = tamanhoEscada;
    String escada = "";
    
    for (int i = 1; i <=tamanhoEscada; i++) {
      for (int j = flag-1; j > 0; j--){
        escada = escada + " ";
      }
      for (int k = 0; k <i; k++){
        escada = escada + "*";
      }
      escada = escada + "\n"; 
      flag--;
    }
    return escada;
  }
  
  /**Método principal para execução do programa ;
   * 
   * @param args.
   */
  public static void main(String[] args) {
    int tamanhoEscada;
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o tamanho da escada a ser gerada:");
    tamanhoEscada = teclado.nextInt();
    
    System.out.println(criaEscada(tamanhoEscada));
  }
}
