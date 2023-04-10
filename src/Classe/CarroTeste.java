package Classe;

public class CarroTeste 
{
	public static void main(String[] args) 
	{
		Carro c1 = new Carro ();
		c1.marca = "Hiunday";
		c1.modelo = "HB20";
		c1.potencia = 1.4;
		c1.cor = "Preto";
		
		System.out.println("Esse carro da " + c1.marca + ".\n E muito confortalvel, e ficou lindo na cor " + c1.cor 
				+ ".\n Ele e " + c1.potencia + ".\n E o nome dele e " + c1.modelo + "\n");
		
		Carro c2 = new Carro();
		c2.marca = "Toyota";
		c2.modelo = "Corola";
		c2.potencia = 2.0;
		c2.cor = "Cinza";
		
		System.out.println("Aquele carro da Toyota tem a potencia de " + c2.potencia + "\n");

		Carro c3 = new Carro ();
		c3.marca = "Chevrolet";
		c3.modelo = "Cruze";
		c3.potencia = 1.8;
		c3.cor = "Vermelho";
		
		System.out.println("Olha aquele carro " + c3.cor + " que lindo" + "\n");
		
		Carro c4 = new Carro ();
		c4.marca = "Fiat";
		c4.modelo = "Palio";
		c4.potencia = 1.0;
		c4.cor = "Amarelo";
		
		System.out.println("Comprei um " + c4.modelo + "\n");
		
		Carro c5 = new Carro ();
		c5.marca = "Volkswagen";
		c5.modelo = "Nivus";
		c5.potencia = 2.0;
		c5.cor = "Branco";
		
		System.out.println("Ola, conhece o nosso novo carro da " + c5.marca + "?");
	}
}
