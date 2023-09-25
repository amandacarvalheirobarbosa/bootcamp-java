package sintaxe;

public class Operadores {
  public static void main(String[] args) {
    // Operadores:
    // Atribuição (=)
    // Aritméticos (+, -, *, /, %)
    int soma = 1 + 1;
    System.out.println("Soma: " + soma);

    int subtracao = 1 - 1;
    System.out.println("Subtração: " + subtracao);

    int multiplicacao = 2 * 3;
    System.out.println("Multipplicação: " + multiplicacao);

    double divisao = 3 / 2;
    System.out.println("Divisão: " + divisao);

    double mod = 5 % 2;
    System.out.println("Resto: " + mod);

    System.out.println("--------------------------------------");

    // Unários (+, -, ++, --, !)
    int numero = 5;
    System.out.println(numero);
    System.out.println(-numero); // numero negativo

    System.out.println("--------------------------------------");

    // incremento
    numero++; // mesma coisa que: numero = numero + 1
    System.out.println(numero);
    System.out.println(++numero);

    // decremento
    numero--;
    System.out.println(numero);
    System.out.println(--numero);

    System.out.println("--------------------------------------");

    boolean variavel = true;
    System.out.println(variavel);
    System.out.println(!variavel); // memoria locada, para alterar precisa atribuir (variavel = !variavel;)

    System.out.println("--------------------------------------");

    // Ternário
    int a, b;
    a = 3;
    b = 5;

    /*
     * String resultado = "";
     * if (a == b) {
     * resultado = "verdadeiro";
     * } else {
     * resultado = "false";
     * }
     */

    String resultado = (a == b) ? "verdadeiro" : "false";

    System.out.println(resultado);

    System.out.println("--------------------------------------");

    // Relacionais (==, !=, >, >=, <, <=)
    String nomeUm = "Amanda";
    String nomeDois = "Amanda";
    System.out.println(nomeUm == nomeDois);

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;
    System.out.println("NumeroUm é igual a NumeroDois? " + simNao);

    simNao = numero1 != numero2;
    System.out.println("NumeroUm é diferente de NumeroDois: " + simNao);

    simNao = numero1 > numero2;
    System.out.println("NumeroUm é maior que NumeroDois: " + simNao);

    simNao = numero1 >= numero2;
    System.out.println("NumeroUm é maior ou igual a NumeroDois: " + simNao);

    simNao = numero1 < numero2;
    System.out.println("NumeroUm é menor que NumeroDois: " + simNao);

    simNao = numero1 <= numero2;
    System.out.println("NumeroUm é menor ou igual a NumeroDois: " + simNao);

    System.out.println("--------------------------------------");

    // Lógicas (&&, ||)
    boolean condicao1 = true;
    boolean condicao2 = false;

    if (condicao1 && condicao2) {
      System.out.println("As duas condições são verdadeiras.");
    } else if (condicao1 || condicao2) {
      System.out.println("Ao menos uma das condições é verdadeira.");
    } else {
      System.out.println("Nenhuma condição é verdadeira.");
    }

  }
}
