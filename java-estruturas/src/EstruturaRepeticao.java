import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EstruturaRepeticao {
  public static void main(String[] args) {
    // while, do-while, for

    for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
      System.out.println("Contando Carneirinhos: " + carneirinhos);
    }

    String alunos[] = { "Amanda", "Leandro", "Felipe", "Julia" };
    for (int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno no índice i=" + i + " é " + alunos[i]);
    }

    for (String aluno : alunos) {
      System.out.println("Nome do aluno é: " + aluno);
    }

    System.out.println("------------------------------------------");

    double mesada = 50.0;
    while (mesada > 0) {
      Double valorDoce = valorAleatorio();
      if (valorDoce > mesada) {
        valorDoce = mesada;
      }
      System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho ");
      mesada = mesada - valorDoce;
    }
    System.out.println("Mesada: " + mesada);
    System.out.println("Joãozinho gastou toda a sua mesada em doces.");

    System.out.println("------------------------------------------");

    System.out.println("Discando...");
    do {
      System.out.println("Telefone tocando...");
    } while (tocando());
    System.out.println("Alô!!!");
  }

  // while
  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2, 8);
  }

  // do-while
  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3) == 1;
    System.out.println("Atendeu? " + atendeu);
    return !atendeu;
  }
}
