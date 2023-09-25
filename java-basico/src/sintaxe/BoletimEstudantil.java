package sintaxe;

public class BoletimEstudantil {
  public static void main(String[] args) {
    int nota = 6;
    if (nota < 6) {
      System.out.println("Reprovado");
    } else if (nota == 6) {
      System.out.println("PROVA MINERVA");
    } else {
      System.out.println("Aprovado");
    }
  }
}
