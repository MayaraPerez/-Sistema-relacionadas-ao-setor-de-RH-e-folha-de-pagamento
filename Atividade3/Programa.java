package Atividade3_entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List <funcionario> list = new ArrayList<>();
		
		System.out.println("------------------------------------------------------------");
		System.out.println(" Sistema relacionadas ao setor de RH e à folha de pagamento");
		System.out.println("------------------------------------------------------------");

		System.out.println("");
		
		System.out.print("Cadastrar quantos Funcionarios: ");
		int qtd = ler.nextInt();
		
		for(int i=1; i<=qtd; i++) {
			
			System.out.println("");

			System.out.print("O Funcionario é (A/H): ");
			char option = ler.next().charAt(0);
			
			System.out.println("");

			System.out.println("Funcionario #"+1);
			
			System.out.print("Entre com o nome: ");
			String nome = ler.next();
			
			System.out.print("Entre com o Cpf: ");
			String cpf = ler.next();
			
			System.out.print("Entre com o telefone: ");
			String telefone = ler.next();
	
			System.out.print("Entre com o setor: ");
			String setor = ler.next();
			
		if(option == 'A') {
			System.out.print("Entre com o salário mensal: ");
			double Assalariado = ler.nextDouble();
			
			list.add(new Assalariado(nome, Assalariado, option, i));
		}
		
		else if(option == 'H') {
			System.out.print("Entre com o valor p/ Hora: ");
			double horas = ler.nextDouble();
			
			System.out.print("Entre com a quantidade Hora: ");
			int qtdHora = ler.nextInt();
			
			list.add(new Horista(nome, i, option, horas, horas, qtdHora));
			
		}
			
	}
		
		System.out.println("-----------------------------");
		System.out.println("");

		System.out.print("Entre com o valor aumento: ");
		double aumento = ler.nextDouble();
		
		
		System.out.println("");
		for(funcionario emp : list) {
			System.out.println(emp.getNome() + emp.mostrarDados());
					
		}
		
		ler.close();
	}

}
