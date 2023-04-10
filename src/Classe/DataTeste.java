package Classe;

public class DataTeste 
{
	public static void main(String[] args) 
	{
		Data d1 = new Data ();
		d1.Dia = 26;
		d1.Mes = 02;
		d1.Ano = 1999;
		
		System.out.println("Data 1 abaixo : ");
		System.out.printf("%d/%d/%d" , d1.Dia , d1.Mes , d1.Ano);
		System.out.println("\n" + d1.ObterDataFormatada());
		
		
		var d2 = new Data ();
		d2.Dia = 26;
		d2.Mes = 04;
		d2.Ano = 2003;
		
		System.out.println("\n" + "Data 2 abaixo: ");
		System.out.printf("%d/%d/%d" , d2.Dia , d2.Mes , d2.Ano);
		
		
		
	}
}
