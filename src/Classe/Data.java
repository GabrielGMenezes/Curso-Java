package Classe;

public class Data
{
	int Dia;
	int Mes;
	int Ano;
	
	String ObterDataFormatada () 
	{
		return String.format("%d/%d/%d" , Dia , Mes , Ano)  ;
	}
	
}
