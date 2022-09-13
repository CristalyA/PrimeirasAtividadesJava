package setembro;

import java.util.Scanner;

public class ExercicioArrayMatrizLive {
	
	public static void main(String [] args) {
		
		int [] [] numero = new int [2][3];
		int somaNumero=0,linha,coluna,somaDiagonal=0;
		
		Scanner ler = new Scanner (System.in);
		
		for (linha=0;linha<2;linha++) {
			for (coluna = 0;coluna<3;coluna++) {
				System.out.println("\nQual o valor linha ? "+linha+" E coluna "+coluna+" ?" );
				numero[linha][coluna] = ler.nextInt();
				
				if(numero[linha][coluna]>0) {
					somaNumero += numero[linha][coluna];
				}
				if(linha == coluna) {
					somaDiagonal += numero[linha][coluna];
				}
			}
		}
		
		System.out.println("\nSoma dos números maiores que ZERO: "+somaNumero);
		System.out.println("\nSoma da diagonal principal: "+somaDiagonal);
		
		
	}

}
