package controladores;

public class Acao {
	
	Produto p = new Produto();

	public void cadastro(String produto, double valor, int quantidade){
		
		p.produto = produto;
		p.valor = valor;
		p.quantidade = quantidade;		
		
	}

}
