package lista03ex03;
	import java.util.Scanner;
public class Tarefa03ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.*/
		
		System.out.println("Digite seu salario atual: ");
		double salAtual = sc.nextDouble(); 
		
		System.out.println("Digite quantos porcento você quer ganhar: ");
		double reajuste = sc.nextDouble();
		
		double valorReajuste = salAtual * (reajuste / 100);
		double novoSal = salAtual + valorReajuste;
		
		System.out.println("Seu novo Salario é: R$" + novoSal);
	}

}
