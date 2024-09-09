package entities;

public class MaisVelho {
	private String nomePessoa;
	private int idadePessoa;

	public MaisVelho(String nomePessoa, int idadePessoa) {
		this.nomePessoa = nomePessoa;
		this.idadePessoa = idadePessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public int getIdadePessoa() {
		return idadePessoa;
	}

	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
}
