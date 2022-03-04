import java.util.Scanner;

/**Classe de execução da questão 02
 *
 * @author paulo
 */
public class Questao02 {
  
  /**Método que verifica quantos caracteres são necessários para ter uma senha 
   * forte. 
   * 1. Verifica se possui todos os caracteres para uma senha forte, contando a 
   * quantidade destas;
   * 2. Em seguida se verifica quantos caracteres fortes há e testa as 
   * possibilidades possíveis envolvendo a quantidade de caracteres forte e a 
   * quantidade total, para assim retornar a quantidade que falta;
   * 
   * @author paulo
   * @param senha String - senha digitada pelo usuário.
   * @return ret int - quantidade de caracteres necessários para uma senha forte.
   */
  static int contaCarcacterForteFalta(String senha){
    int checDigito = 0, checMaiuscula = 0, checMinuscula = 0, checEspecial = 0, 
        qtdCaracterParaForte = 0, qtdCaracteres = 0, qtdCaracterFortePossui =0, ret = 0;
    String letraMinuscula = "abcdefghijklmnopqrstuvwxyz";
    String letraMaiuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String caracterEspecial ="!@#$%^&*()-+";
    String digito = "0123456789";
    char letra;
    
    for(int i=0; i<senha.length(); i++){
      letra = senha.charAt(i);
      if(digito.indexOf(letra) != -1)
        checDigito = 1;
      else if(letraMinuscula.indexOf(letra) != -1)
        checMinuscula = 1;
      else if(letraMaiuscula.indexOf(letra) != -1)
        checMaiuscula = 1;
      else if(caracterEspecial.indexOf(letra) != -1)
        checEspecial = 1;
      qtdCaracteres++;
    }
    
     //conta qtd caracteres para senha forte
    if(qtdCaracteres > 0){
      if(checDigito == 0)
        qtdCaracterParaForte++;
      if(checMinuscula == 0)
        qtdCaracterParaForte++;
      if(checMaiuscula == 0)
        qtdCaracterParaForte++;
      if(checEspecial == 0)
        qtdCaracterParaForte++;
      
      qtdCaracterFortePossui = 4 - qtdCaracterParaForte;
      
      //verifica qtd que falta com 1 caractere forte
      if(qtdCaracterFortePossui == 1 && qtdCaracteres < 4)
        ret = 6-qtdCaracteres;
      else if(qtdCaracterFortePossui == 1 && qtdCaracteres >= 4)
        ret = 3;
      
      //verifica qtd que falta com 2 caractere forte
      if(qtdCaracterFortePossui == 2 && qtdCaracteres < 5)
        ret = 6-qtdCaracteres;
      else if(qtdCaracterFortePossui == 2 && qtdCaracteres >= 5)
        ret = 2;
      
      //verifica qtd que falta com 3 caractere forte
      if(qtdCaracterFortePossui == 3 && qtdCaracteres < 6)
        ret = 6-qtdCaracteres;
      else if(qtdCaracterFortePossui == 3 && qtdCaracteres >= 6)
        ret = 1;
      
      //verifica qtd que falta com >=4 caractere forte
      if(qtdCaracterFortePossui == 4 && qtdCaracteres < 7)
        ret = 6-qtdCaracteres;
      else if(qtdCaracterFortePossui == 4 && qtdCaracteres >= 7)
        ret = 0;
    }
    return ret;
  }
  
  /**Método principal para execução do programa;
   * 
   * @param args.
   */
  public static void main(String[] args) {
    String senha;
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite sua senha e verificamos quantos caracteres faltam para ela ser segura:");
    senha = teclado.nextLine();
    
    System.out.println(contaCarcacterForteFalta(senha));
  }
}
