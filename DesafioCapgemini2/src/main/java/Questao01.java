
import java.util.Arrays;
import java.util.Scanner;


/**Classe de execução da questão 01
 *
 * @author paulo
 */
public class Questao01 {
  
  /**Método para calcular a posição da mediana e retornar a mediana. Para isso
   * se ordena o vetor, em seguida se divide o tamanho por 2, assim se obtem 
   * a posição impar uma vez que o indice 0 é considerado a posição 1.
   *
   * @param tamanho int - tamanho do vetor;
   * @param vetor int - elementos do vetor.
   * @return mediana int - elemento do meio após ordenação.
   */
  static int funcaoMediana(int tamanho, int [] vetor){
    int mediana = 0, indice = 0;
    
    if(tamanho == 0)
      return 0;
    
    //ordena vetor e retorna mediana
    Arrays.sort(vetor);
    indice = tamanho/2;
    mediana = vetor[indice];
    
    return mediana;
  }
  
  /** Método principal para execução do programa;
   * 
   * @param args 
   */
  public static void main(String[] args) {
    int vetor [];
    int tamanho;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite o tamanho do vetor:");
    tamanho = teclado.nextInt();
    
    vetor =  new int[tamanho];
    System.out.println("Digite os elementos do vetor:");
    for (int i=0; i<tamanho; i++) {
      vetor[i] = teclado.nextInt();
    }

    System.out.println(funcaoMediana(tamanho, vetor));
  }
}
