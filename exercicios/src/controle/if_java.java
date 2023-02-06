package controle;

import java.util.Scanner;

public class if_java {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Infome a media: ");
		double media = entrada.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
		}
		
		if (media < 4.5 && media >= 0 ) {
			System.out.println("reprovado");
		}
	 entrada.close();
	}
	
}
