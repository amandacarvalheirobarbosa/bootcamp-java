package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Amanda");
		aluno.setIdade(25);
		
		System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos de idade.");
		
	}
}
