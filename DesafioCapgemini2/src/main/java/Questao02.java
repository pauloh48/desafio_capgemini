
import java.util.Arrays;
import java.util.Scanner;


/**Classe de execução da questão 02
 *
 * @author paulo
 */
public class Questao02 {

  /**Método que calcula quantos elementos de um vetor tem diferença x. Para isso
   * se ordena o vetor e percorre elemento por elemento comparando se (j-i) == x, 
   * então se incrementa 1 no contador de diferença x.
   * 
   * @param tamanho int - tamanho do vetor;
   * @param vetor int - elementos do vetor;
   * @param x int - elemento x.
   * @return contador int - quantidade de elementos que tem diferença x.
   */
  static int diferencaX(int tamanho, int [] vetor, int x){
    int contador = 0;
    
    if(tamanho == 0)
      return 0;
    
    // calcula diferença x
    Arrays.sort(vetor);
    for (int i = 0; i<tamanho; i++) {
      for (int j = i; j<tamanho; j++){
        if((vetor[j]-vetor[i]) == x)
          contador++;
      }
    } 
    return contador;
  }

  /** Método principal para execução do programa;
   * 
   * @param args 
   */
  public static void main(String[] args) {
    int vetor [];
    int tamanho, x;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite o tamanho do vetor:");
    tamanho = teclado.nextInt();
    
    vetor =  new int[tamanho];
    System.out.println("Digite os elementos do vetor:");
    for (int i=0; i<tamanho; i++) {
      vetor[i] = teclado.nextInt();
    }
    
    System.out.println("Digite valor de x:");
    x = teclado.nextInt();
    
    System.out.println(diferencaX(tamanho, vetor, x));
  }
}
