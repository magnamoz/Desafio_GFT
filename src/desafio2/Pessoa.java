package desafio2;

public class Pessoa {

	private String nome;
	private String endereço;
	private int telefone;
	
	public Pessoa (String nome, String endereço, int telefone) {
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone; 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	} 
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Endereço: " +  this.endereço + " Tel: " + this.telefone;
	}
	
}
