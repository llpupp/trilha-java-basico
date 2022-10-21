public class Operadores {

  public static void main(String[] args) {
    String nomeCompleto = "LINGUAGEM" + " JAVA";
    System.out.println(nomeCompleto);

    String concatenacao = "?";
    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);
    
    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);
    
    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);
    
    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);
    
    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);

    int numero = 5;
    System.out.println(- numero); // equivale a numero = -5
    numero = - numero; //equivale a numero = -5
    System.out.println(numero);
    numero = numero *-1; //equivale a numero = +5 (troca o numero = -5 *-1 = +5)
    System.out.println(numero);

    int num = 5;
    num = num + 2;
    num++; //= num = num + 1
    System.out.println(++ num); //equivale a numero = 9

    System.out.println(num --); //equivale a numero = 9

      boolean variavel = true;
      System.out.println(!variavel); //equivale a boolean variavel = false

      variavel = !variavel; // sendo negada aqui e mudando definitivo para false, senão volta à original
  }  
}
