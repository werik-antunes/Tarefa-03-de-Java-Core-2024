package lista03exercicio01;
	import java.util.Scanner;
	
public class Lista03ex01 {
	
	public static void main (String[]argrs) {
		
		Scanner sc = new Scanner(System.in);
		/*1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. */
		
		System.out.println("Digite sua data de nascimento: ");
		int nascimento = sc.nextInt();
		
		int anoAtual = 2024 - nascimento;
		System.out.println("A sua idade é: " + anoAtual +" anos de idade"); 
		
		int mes = 12 * anoAtual;
		System.out.println("A sua idade em meses é: " + mes + " meses");
		
		int dias = 30 * 12 * anoAtual;
		System.out.println("A sua idade em dias é: " + dias + " dias");
	}
}
