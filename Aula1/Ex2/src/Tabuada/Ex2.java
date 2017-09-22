package Tabuada;

import java.util.Scanner;


public class Ex2 {
	
	
	public static void main (String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println ("Infome o número para a tabuada");
		int n = s.nextInt();
		System.out.println("+--Resultado--+");
		for (int i=1;i<=10;i++) {
		
				
			System.out.println("|  "+i+" * "+n+" = "+(i*n)+" |");
			
	}

		
}

}