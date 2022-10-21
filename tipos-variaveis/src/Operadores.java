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

      int a, b;
      a = 5;
      b = 6;
      String resultado = a==b ? "verdadeiro" : "falso"; // equivale a if ---> else (booleana)
      System.out.println(resultado);

      int numero1 = 1;
      int numero2 = 2;
      
      boolean simNao = numero1 == numero2; // equivale à = 
      // temos ainda > e <
      System.out.println("numeroUm é igual a numeroDois? " + simNao);

      simNao = numero1 != numero2; // equivale à diferente
      System.out.println("numeroUm é diferente a numeroDois? " + simNao);
      
      String nomeUm = "GLAYSON";
      String nomeDois = new String("GLAYSON");

      System.out.println(nomeUm.equals(nomeDois)); //compara conteúdos e neste caso é true (não devemos usar == neste caso de objetos)
  }  
}
