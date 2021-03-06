package desafio2;

public class Pessoa {

	private String nome;
	private String enderešo;
	private int telefone;
	
	public Pessoa (String nome, String enderešo, int telefone) {
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone; 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	} 
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Enderešo: " +  this.enderešo + " Tel: " + this.telefone;
	}
	
}
