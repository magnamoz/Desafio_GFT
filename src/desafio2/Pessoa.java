package desafio2;

public class Pessoa {

	private String nome;
	private String endere�o;
	private int telefone;
	
	public Pessoa (String nome, String endere�o, int telefone) {
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone; 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	} 
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Endere�o: " +  this.endere�o + " Tel: " + this.telefone;
	}
	
}
