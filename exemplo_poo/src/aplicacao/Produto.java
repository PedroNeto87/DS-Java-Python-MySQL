package aplicacao;

public class Produto {

	//Atributos
	public String nome;
	public double preco;
	public double quantidade;
	
	//Métodos
	public void addProduto (int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void remProduto (int quantidade) {
		this.quantidade -= quantidade;
	}
}
