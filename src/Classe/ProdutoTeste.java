package Classe;

public class ProdutoTeste 
{
	public static void main(String[] args) 
	{
		Produto p1 = new Produto (); 
		p1.nome = "Celular" ;
		p1.preco = 1500;
		p1.desconto = 0.25 ;
		
		double precoComDesconto1 = p1.preco * (1 - p1.desconto); // Criando a própria linha de código dentro do bloco
		double precoFinalDesconto = p1.precoComDesconto(); // Utilizando o Método criado na classe Produto
		
		System.out.println("Nome do Objeto: " + p1.nome);
		System.out.println("Preco do Celular sem Desconto: " + p1.preco);
		
		System.out.println("Preco do Celular com Desconto: " + precoComDesconto1);
		System.out.println("Preco do Celular com Desconto: " + precoFinalDesconto);
		
		
		var p2 = new Produto (); //VAR : variável
		p2.nome = "Notebook" ;
		p2.preco = 5000 ; 
		p2.desconto = 0.1 ; 
		
		double precoComDesconto2 = p2.precoComDesconto(); // Utilizando apenas o metodo
		double DescontoGerente = p2.precoComDesconto(0.4); // Utilizando o metodo acrescentado (DescontoGerente)
		
		
		System.out.println("Nome do Objeto: " + p2.nome);
		System.out.println("Preco do Celular sem Desconto: " + p2.preco);
		System.out.println("Preco do Celular com Desconto: " + precoComDesconto2);
		System.out.println("Preco do Celular com DescontoGerente: " + DescontoGerente);
	}
}
