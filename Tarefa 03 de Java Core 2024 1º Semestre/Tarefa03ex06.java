package tarefa03ex06;
	import java.util.Scanner;
	
public class Tarefa03ex06 {

	public static void main(String[] args) {
/*6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("igite a temperatura em graus Fahrenheit: ");
		double tempFahrenheit = sc.nextDouble(); 
		
		double tempCel = (tempFahrenheit -32) * (5.0 / 9.0);
		
		System.out.println("A temperatura em graus Celsius é: " + tempCel);
	}

}
