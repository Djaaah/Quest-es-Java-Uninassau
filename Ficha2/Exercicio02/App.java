package Exercicio02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws ParseException {
		Integer id;
		String nome, descricao, helper;
		Date validade;
		Produto novoProduto = new Produto();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("Digite a DATA DE VALIDADE do Produto: ");
			helper = input.next();
			validade = formatador.parse(helper);
			novoProduto.setValidade(validade);
		
			System.out.print("Digite o ID do Produto: ");
			novoProduto.setId(id = input.nextInt());
			
			System.out.print("Digite o NOME do Produto: ");
			novoProduto.setNome(nome = input.next());
			
			System.out.print("Digite o DESCRICAO do Produto: ");
			novoProduto.setDescricao(descricao = input.next());

		input.close();

		System.out.println("ID: " + novoProduto.getNome());
		System.out.println("Nome: " + novoProduto.getNome());
		System.out.println("Descricao: " + novoProduto.getDescricao());
		System.out.println("Data de Validade: " + formatador.format(novoProduto.getValidade()));
		
	}
}
