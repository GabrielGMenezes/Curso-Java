package Classe;

public class Produto
{
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto() 
	{
		return preco * (1 - desconto) ;
	}
	double precoComDesconto(double DescontoGerente) 
	{
		return preco * (1 - (desconto + DescontoGerente)) ;
	}
}
