package setembro;

import java.util.Scanner;

public class SegundaAtividade {
	
	public static void main(String[] args ) {
		
		int a,b,c;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\nQual o  valor de A? ");
		a = ler.nextInt();
		System.out.println("\nQual o valor de de B? ");
		b = ler.nextInt();
		System.out.println("\nQual o valor de C ?");
		c = ler.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("Ordem crescente: "+a+","+b+", e "+c);
		}else if(a<=c && c<=b) {			
			System.out.println("Ordem crescente: "+a+","+c+" , e "+b);
		}else if (b<=a && a<=c) {
			System.out.println("Ordem crescente: "+b+", "+a+" ,"+c);
		}else if(b<=c && c<=a) {
			System.out.println("Ordem crescente: "+b+","+c+", e"+a);
		}else if(c<=a && a<=b) {
			System.out.println("Ordem crescente: "+c+","+a+", e"+b);
		}else {
			System.out.println("Ordem crescente: "+c+", "+b+", e"+a);
		}	
		
		
	}

}
