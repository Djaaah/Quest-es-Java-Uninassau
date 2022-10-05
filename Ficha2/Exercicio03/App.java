package Exercicio03;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		int id, qtdeRoda;
		short ano;
		String modelo;
		double cargaMaxima, potencia;
		MeioDeTransporte meioDeTransporte = new MeioDeTransporte();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o ID do veiculo: ");
		meioDeTransporte.setId(id = input.nextInt());
		
		System.out.print("Digite a QUANTIDADE DE RODAS do veiculo: ");
		meioDeTransporte.setQtdeRoda(qtdeRoda = input.nextInt());
		
		System.out.print("Digite a POTÊNCIA do veiculo: ");
		meioDeTransporte.setPotencia(potencia = input.nextDouble());
		
		System.out.print("Digite a CARGA MÁXIMA do veiculo: ");
		meioDeTransporte.setCargaMaxima(cargaMaxima = input.nextDouble());
		
		System.out.print("Digite o MODELO do veiculo: ");
		meioDeTransporte.setModelo(modelo = input.next());
		
		System.out.print("Digite o ANO do veiculo: ");
		meioDeTransporte.setAno(ano = input.nextShort());
		
		System.out.println("Consumo: " + meioDeTransporte.consumo());
		
		input.close();
	}
}
