import java.util.Arrays;
import java.util.Scanner;

/**Classe de execução da questão 02
 *
 * @author paulo
 */
public class Questa03 {
  /**Método que verifica a quantidade de letras que possuem pares. Para isso se 
   * percorre um laço comparando letra por letra, uma letra terá um par se ela 
   * for encontrada duas vezes, se isso acontecer a quantidade de sub pares é 
   * incrementado em 1;
   * 
   * @param str String - string que terá suas letras comparadas.
   * @param fimSubStr1 int- indice a ser incrementado da substring1. 
   * @return parSubRepetidas int - quantidade de letras que possuem pares.
   */
  static int comparaLetras(String str, int fimSubStr1){
    char subSubStr1, subSubStr2;
    int indexSub1 = 0, indexSub2 = 0;
    int fimSubStr2=0;
    int subRepetidas = 0, parSubRepetidas = 0;
    
    subSubStr1 = str.charAt(fimSubStr1);
    indexSub1++;
    
    // gera sub2 e compara com sub1
    for(int k=0; k<str.length();k++){
      subSubStr2 = str.charAt(fimSubStr2);
      fimSubStr2++;
      //compara
      if(subSubStr1 == subSubStr2){
        subRepetidas++;
      }
    }
    //verifica pares
    if(subRepetidas == 2){
      parSubRepetidas++;
    }
    return parSubRepetidas;
  }
  
  /**Método para ordenar uma substring em ordem crescente. Para isso se converte 
   * a substring em vetor de char para que assim realize a ordenação, por fim se
   * converte o vetor de char ordenado em uma string para assim retorna-lá. 
   * 
   * @author paulo
   * @param sub String - string a ser ordenada.
   * @return retSub String - string ordenada.
   */
  static String ordenaSubStr(String sub){
    //int x, y;
    //char aux;
    String retSub;
    //convete string para vetor de char
    char subStrArray[] = sub.toCharArray();

    Arrays.sort(subStrArray);
    retSub = String.valueOf(subStrArray);
    return retSub;
  }
  
  /**Método que verifica a quantidade de substring que possuem pares. Para isso 
   * se percorre um laço comparando a substring1 com a substring2, ambas são 
   * geradas tendo o mesmo tamanho, em seguida se desloca o indice inicial e 
   * final de cada substrig para que as letras variem e assim teste todas as 
   * possibilidades. O teste de comparação para ver se duas substrigs são iguais
   * utiliza o método ordenaSubStr(String sub). Uma substring terá um par se ela 
   * for encontrada duas vezes, se isso acontecer a quantidade de sub pares é 
   * incrementado em 1; 
   * 
   * @param str String - string que terá suas substrings comparadas.
   * @param inicioSubStr1 int- indice inicial, é incrementado em 1, permite 
   * gerar a substrin1. 
   * @param fimSubStr1 int- indice final, é incrementado em 1 ,permite gerar a 
   * substring1. 
   * @param i int - diminui o espaço de possibilidades.
   * @return parSubRepetidas int - quantidade de substrings que possuem pares.
   */
  static int comparaSubStr(String str, int inicioSubStr1, int fimSubStr1, int i){
    String subSubStr1=null, subSubStr2=null;
    int indexSub1 = 0, indexSub2 = 0;
    int fimSubStr2=0;
    int auxInicioSubStr2 =0 , inicioSubStr2 = 0;
    int subRepetidas=0, parSubRepetidas=0;

    int auxInicioSubStr1 = 0;

    auxInicioSubStr1 = inicioSubStr1;
    
    fimSubStr1++;
    //gera palavras  de mesmo tamanho
    if(fimSubStr1 <= str.length())
      subSubStr1 = str.substring(auxInicioSubStr1, fimSubStr1);
    //ordenaSubStr(subSubStr1);
    
    fimSubStr2 = i+1;
    //percorre colunas, strlen(str)-i, diminui espaco de ṕossibilidades
    for(int k=0; k<str.length()-i;k++){
      auxInicioSubStr2 = inicioSubStr2++;
      
      //gera palavras de mesmo tamanho
      if(fimSubStr2 <= str.length())
        subSubStr2 = str.substring(auxInicioSubStr2, fimSubStr2);
      fimSubStr2++;
        //ordenaSubStr(subSubStr2);
      
      if(ordenaSubStr(subSubStr1).equals(ordenaSubStr(subSubStr2))){
        subRepetidas++;
      }
      indexSub2 = 0;
    }
    //verifica pares
    if(subRepetidas >= 2){
      parSubRepetidas++;
    }
    return parSubRepetidas;
  }
  
  /**Método que conta a quantidade de pares de angramas da string digitada pelo
   * usuário. Para isso perorre 2 laços, um que permite a geração de linhas e um 
   * segundo que gera as colunas, assim se obtém todas as possibilidades de 
   * substrings e letras. Para testar as possibilidade se usa as funcões 
   * comparaLetras(str, fimSubStr1) e comparaSubStr(str, inicioSubStr1, fimSubStr1, i),
   * com tal comparação incrementamos o retorno delas com a quantidade total de
   * anagramas. Por fim retornamos apenas a quantidade de anagramas que possuem
   * pares dividindo a quantidade total de anagramas por 2.
   * 
   * @param str String - string digitada pelo usuário.
   * @return anagramaPares int - quantidade de anagramas que possui pares.
   */
  static int contaParesAnagramas(String str){
    int inicioSubStr1 = 0, fimSubStr1 = 0;
    int anagramas = 0, anagramaPares=0;
    
    // percorre linhas
    for(int i=0; i<str.length(); i++){
      fimSubStr1 = i;
      //percorre colunas, strlen(str)-i diminui espaco de ṕossibilidades
      for(int j=0; j<str.length()-i;j++){
        
        //gera apenas letras
        if(i == 0){
          anagramas = anagramas + comparaLetras(str, fimSubStr1);
          fimSubStr1++;
        }
        
        //gera substring com tamanho = inicioSubStr1-fimSubStr1
        else{
          anagramas = anagramas + comparaSubStr(str, inicioSubStr1, fimSubStr1, i);
          inicioSubStr1++;
          fimSubStr1++;
        }
      }
    inicioSubStr1 = 0;
    }
    
    anagramaPares = anagramas/2;
    return anagramaPares;
  }
  
  /** Método principal para execução do programa ;
   * 
   * @param args 
   */
  public static void main(String[] args) {
    String str;
      
    Scanner teclado = new Scanner(System.in);
    str = teclado.nextLine();
    
    System.out.println("Digite uma string para contarmos quantos pares de anagramas há nela");
    System.out.printf("%d\n", contaParesAnagramas(str));
  }
}
