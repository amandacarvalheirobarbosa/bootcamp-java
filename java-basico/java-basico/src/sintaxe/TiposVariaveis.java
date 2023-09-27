package sintaxe;

public class TiposVariaveis {
  public static void main(String[] args) {
    // Tipos Primitivos (Primitive Types):
    // byte, short, int, long, float, double, boolean, char
    int idade;
    int anoFabricacao = 2021;
    double salarioMinimo = 2500.33;
    long cpf = 987654321098L; // long tem que ter o L no final
    float pi = 3.14F; // float tem que ter o F no final
    String nome = "Amanda";

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal; // casting

    // Variáveis e Constantes - se a gente quer que uma variável não altere seu
    // valor, ela deve conter final e estar em caixa alta.
    int numero = 5; // assim pode sofrer alteração
    numero = 10;

    final double PI = 3.14; // não pode sofrer alteração
    // PI = 3.1415;

  }
}
