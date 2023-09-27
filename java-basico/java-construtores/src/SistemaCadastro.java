public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Amanda", "123.321.123-00");
        pessoa.setEndereco("Rua qualquer");

        System.out.println(pessoa.getNome() + " - " + pessoa.getCpf() + " - " + pessoa.getEndereco());
    }
}
