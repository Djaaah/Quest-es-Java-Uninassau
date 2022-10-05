package Exercicio01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Integer id = 0, ano = 0;
		String modelo = "";
		Double cargaMaxima  = 0.0, potencia = 0.0;
		Transporte carroMontado = new Transporte(id, ano, modelo, cargaMaxima, potencia);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o ID do Veiculo: ");
		carroMontado.setId(id = input.nextInt());
		
		System.out.print("Digite o ANO do Veiculo: ");
		carroMontado.setAno(ano = input.nextInt());
		
		System.out.print("Digite o MODELO do Veiculo: ");
		carroMontado.setModelo(modelo = input.next());
				
		System.out.print("Digite a CARGA MÁXIMA do Veiculo: ");
		carroMontado.setCargaMaxima(cargaMaxima = input.nextDouble());
		
		System.out.print("Digite a POTENCIA do Veiculo: ");
		carroMontado.setPotencia(potencia = input.nextDouble());
		
		input.close();
		
		System.out.println("Consumo: " + carroMontado.consumo());
		System.out.println("Nome do Modelo: " + carroMontado.getModelo());
	}
}
