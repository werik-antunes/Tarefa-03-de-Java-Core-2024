package tarefa03ex07;
	import java.util.Scanner;
	
public class Tarefa03ex07 {

	public static void main(String[] args) {
/*7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o raio da base da lata: ");
		double raio = sc.nextDouble();
		
		System.out.print("Digite a altura da lata: ");
		double altura = sc.nextDouble();
		
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.println("O volume da lata de óleo é: " + volume);
		
	}

}
