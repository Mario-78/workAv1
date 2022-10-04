package workAv1;

import java.util.Scanner;

import javax.swing.JOptionPane;

import workAv1_recursosHumanos.Aluno;
import workAv1_recursosHumanos.Coordenador;
import workAv1_recursosHumanos.Diretor;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op = 0, idPessoa = 0, idEmpresa = 0, matri = 0;
		
		Aluno aluno = new Aluno();
		Coordenador coordenador = new Coordenador();
		Diretor diretor = new Diretor();
		
		
		aluno = new Aluno(++idPessoa, "João Marcos", "15975326501", ++matri);
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
				+ "01 Para cadastrar uma pessoa \n"
				+ "02 Para cadastrar uma empresa \n"));
		
		if(op == 1) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"
					+ "01 Para cadastrar aluno: \n"
					+ "02 Para cadastrar professor: \n"
					+ "03 Para cadastrar coordenador: \n"
					+ "04 Para cadastrar secretário(a) acadêmico(a): \n"
					+ "05 Para cadastrar secretário(a) financeiro(a): \n"
					+ "06 Para cadastrar diretor(a): \n"
					+ "07 para cadastrar gerente: \n"));
			
			switch (op) {
			case 1: {				
				System.out.println("Informe o nome: ");
				String name = sc.nextLine();
				System.out.println("Informe o cpf: ");
				String cpf = sc.nextLine();
				Integer id = ++idPessoa;
				Integer matricula = ++matri;
				aluno = new Aluno(id, name, cpf, matricula);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
		}else {
			op = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção desejada: \n"));
		}
		
		
		
		sc.close();

	}

}
