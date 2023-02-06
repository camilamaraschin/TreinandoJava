package controle;

import java.util.Scanner;

public class desafioDaSemana {
	
	public static void main(String[] args) {
		
		Scanner semana = new Scanner(System.in);
		System.out.print("Informe o numero");
		double entrada = semana.nextDouble();
		
		
		if(entrada == 1 ) {
			System.out.println("Domingo");
		} 
		
		if(entrada == 2) {
			System.out.println("Segunda");
			}
		
		 if(entrada == 3) {
				System.out.println("Terça");
			}
		 semana.close();
		}
		
	}


