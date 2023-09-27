// em outras IDEs nomenclatura dos package pode ser edu.amanda.primeirasemana (edu, com (comercial), org(organizacional))
package sintaxe;

public class MinhaClasse {
  public static void main(String[] args) {
    String primeiroNome = "Amanda";
    String segundoNome = "Barbosa";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome); // duas formas de concatenar
  }
}
