public class ControleFluxo {
  public static void main(String[] args) {
    // Estruturas condicionais: if-else, switch-case
    // Estruturas de repetição: for, while, do-while
    // Estruturas de exceções: try-catch-finally, throw

    double saldo = 25.0;
    double valorSolicitado = 17.0;

    if (valorSolicitado < saldo) {
      saldo = saldo - valorSolicitado;
      System.out.println("Seu novo saldo é: " + saldo);
    } else {
      System.out.println("Saldo insuficiente.");
    }

    System.out.println("------------------------------------------");

    int nota = 7;

    if (nota >= 7) {
      System.out.println("Aprovado.");
    } else if (nota >= 5 && nota < 7) {
      System.out.println("Prova Recuperação.");
    } else {
      System.out.println("Reprovado.");
    }

    System.out.println("------------------------------------------");

    // Ternário
    String resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
    System.out.println(resultado);

    int nota2 = 6;
    String resultado2 = (nota2 >= 7) ? "Aprovado" : (nota2 >= 5 && nota2 < 7) ? "Recuperação" : "Reprovado";
    System.out.println(resultado2);

    System.out.println("------------------------------------------");

    String sigla = "M";

    switch (sigla) {
      case "P": {
        System.out.println("Pequeno");
        break;
      }
      case "M": {
        System.out.println("Médio");
        break;
      }
      case "G": {
        System.out.println("Grande");
        break;
      }
      default:
        System.out.println("Indefinido");
    }
  }
}
