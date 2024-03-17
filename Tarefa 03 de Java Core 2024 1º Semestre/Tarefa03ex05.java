package tarefa03ex05;
	import java.util.Scanner;
public class Tarefa03ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

			System.out.println("Digite a temperatura em graus Celsius: ");
			double grausCel = sc.nextDouble();
			
			double tempFahrenheit = (9 * grausCel + 160) / 5;
			
			System.out.println("A temperatura em graus Fahrenheit é: " + tempFahrenheit);
	}

}
