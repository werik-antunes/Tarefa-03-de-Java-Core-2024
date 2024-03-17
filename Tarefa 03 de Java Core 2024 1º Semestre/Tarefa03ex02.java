package lista03exercicio02;
	import java.util.Scanner;
	
public class Tarefa03ex02 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in); 
		
		/*2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.*/
	
		System.out.print("Digite o numero de eleitores: ");
		double eleitores = sc.nextDouble();
		
		System.out.print("Digite o numero de votos em branco: ");
		double votosBrancos = sc.nextDouble();
		
		System.out.print("Digite o numero de votos nulos: ");
		double votosNulos = sc.nextDouble();
		
		System.out.print("Digite o numero de votos válidos: ");
		double votosValidos = sc.nextDouble();
		
		double porcentualBrancos = votosBrancos / eleitores * 100;
		double porcentualNulos = votosNulos / eleitores * 100;
		double porcentualValidos = votosValidos / eleitores * 100;
		
		System.out.println(porcentualBrancos + "% de votos em branco");
		System.out.println(porcentualNulos + "% de votos em nulos");
		System.out.println(porcentualValidos + "% de votos em válidos");
		
		
		
	}
	
}
