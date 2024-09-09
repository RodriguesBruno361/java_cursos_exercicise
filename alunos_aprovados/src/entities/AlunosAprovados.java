package entities;

public class AlunosAprovados {
	private String nomeAluno;
	private double nota1Aluno;
	private double nota2Aluno;

	public AlunosAprovados(String nomeAluno, double nota1Aluno, double nota2Aluno) {
		this.nomeAluno = nomeAluno;
		this.nota1Aluno = nota1Aluno;
		this.nota2Aluno = nota2Aluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public double getNota1Aluno() {
		return nota1Aluno;
	}

	public double getNota2Aluno() {
		return nota2Aluno;
	}
}
