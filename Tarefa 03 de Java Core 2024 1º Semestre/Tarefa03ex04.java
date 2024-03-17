package tarefa03ex04;
	import java.util.Scanner;
	
public class Tarefa03ex04 {

	public static void main(String[] args) {
		/*4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica do carro: ");
		double custoFabrica = sc.nextDouble();
		
		double porcentoDistribuidora = 0.28;
		double porcentoImposto = 0.45;
		
		double custoDistribuidor = custoFabrica * porcentoDistribuidora;
		double custoImposto = custoFabrica * porcentoImposto;
		double custoConsumidor = custoFabrica + custoDistribuidor + custoImposto;
		
		System.out.println("O custo final do consumidor é: R$"+ custoConsumidor);
	}

}
