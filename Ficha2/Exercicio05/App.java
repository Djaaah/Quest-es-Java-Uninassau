package Exercicio05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws ParseException {
		
		Turma turma = new Turma();

		List<Aluno> alunosList = new ArrayList<Aluno>();
		String helper;
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		for (int i = 0; i < 5; i++) {
			alunosList.add(new Aluno());
		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o CÓDIGO da Turma: ");
		turma.setCod(input.next());
		
		System.out.print("Digite o TURNO da Turma: ");
		turma.setTurno(input.nextInt());
		
		System.out.print("Digite o SALA da Turma: ");
		turma.setSala(input.nextInt());
		
		for (int i = 0; i < 5; i++) {	
			System.out.print("Digite a MATRICULA do " + (i+1) + "ª Aluno: ");
			alunosList.get(i).setMatricula(input.next());

			System.out.print("Digite o NOME do " + (i+1) + "ª Aluno: ");
			alunosList.get(i).setNome(input.next());
			
			System.out.print("Digite o CPF do " + (i+1) + "ª Aluno: ");
			alunosList.get(i).setCpf(input.next());
			
			System.out.print("Digite o SEXO do " + (i+1) + "ª Aluno: ");
			alunosList.get(i).setSexo(input.next());
			
			System.out.print("Digite o ENDERECO do " + (i+1) + "ª Aluno: ");
			alunosList.get(i).setEndereco(input.next());
			
			System.out.print("Digite a CIDADE do " + (i+1) + "ª Aluno: ");
			alunosList.get(i).setCidade(input.next());
			
			System.out.print("Digite a UF do " + (i+1) + "ª Aluno: ");
			alunosList.get(i).setUf(input.next());
			
			System.out.print("Digite a DATA DE NASCIMENTO do " + (i+1) + "ª Aluno: ");
			helper = input.next();
			alunosList.get(i).setDataNascimento(formatador.parse(helper));
			
			System.out.println("Aluno inserido automaticamente na turma: " + turma.getCod());
		}
		
			turma.setAlunos(alunosList);
		
		System.out.println(alunosList.size());
		
		
		// Funcionando perfeitamente \/ 	
		for (int i = 0; i < alunosList.size(); i++) {
			System.out.println("Inseridos na lista Local: " + (i+1) + alunosList.get(i).getNome());
			System.out.println("Inseridos na lista da Classe: " + (i+1) + turma.getAlunos().get(i).getNome());
		}
		
		input.close();
	}
}
