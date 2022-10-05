package workAv1;

import java.util.Scanner;

import javax.swing.JOptionPane;

import workAv1_negocios.Agencia;
import workAv1_negocios.Banco;
import workAv1_negociosProdutos.Curso;
import workAv1_negociosProdutos.Disciplina;
import workAv1_recursosHumanos.Aluno;
import workAv1_recursosHumanos.Coordenador;
import workAv1_recursosHumanos.Diretor;
import workAv1_recursosHumanos.Gerente;
import workAv1_recursosHumanos.Presidente;
import workAv1_recursosHumanos.Professor;
import workAv1_recursosHumanos.SecAcademica;
import workAv1_recursosHumanos.SecFinanceira;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op = 0, idPessoa = 0, idEmpresa = 0, matri = 100, idDis = 0, idCurso = 0, idBanco = 0;
		
		Aluno aluno = new Aluno();
		Coordenador coordenador = new Coordenador();
		Diretor diretor = new Diretor();
		
		
		Aluno aluno0 = new Aluno(++idPessoa, "Jo�o Marcos", "154.894.230-80", ++matri);
		Aluno aluno1 = new Aluno(++idPessoa, "Antonio Pereira Silva", "950.725.740-32", ++matri);
		Aluno aluno2 = new Aluno(++idPessoa, "Claudio Jose Martins", "717.237.410-00", ++matri);
		Aluno aluno3 = new Aluno(++idPessoa, "Andr� Macedo Morais", "595.995.410-90", ++matri);
		Aluno aluno4 = new Aluno(++idPessoa, "Claudia Regina Costa", "318.252.280-94", ++matri);
		Aluno aluno5 = new Aluno(++idPessoa, "Isis Giovanna Cristiane da Rosa", "564.441.690-97", ++matri);
		Aluno aluno6 = new Aluno(++idPessoa, "Debora Ayla Kua Moraes", "084.946.250-98", ++matri);
		Aluno aluno7 = new Aluno(++idPessoa, "Luisa Teresinha Bernardes", "661.730.890-50", ++matri);
		Aluno aluno8 = new Aluno(++idPessoa, "Murilo Lucca Ian Assis", "885.393.330-58", ++matri);
		Aluno aluno9 = new Aluno(++idPessoa, "Jennifer F�tima de Paula", "954.961.020-90", ++matri);
		
		Professor professor0 = new Professor(++idPessoa, "Catarina Mariah Ana Silva", "528.046.620-47", "professor");
		Professor professor1 = new Professor(++idPessoa, "Sebasti�o M�rcio Carlos da Mota", "347.269.760-10", "professor");
		Professor professor2 = new Professor(++idPessoa, "Thales Joaquim Freitas", "604.902.050-70", "professor");
		Professor professor3 = new Professor(++idPessoa, "Mateus Manoel da Rocha", "407.334.973-22", "professor");
		
		Coordenador coordenador0 = new Coordenador(++idPessoa, "Arthur Jorge Foga�a", "056.308.323-95", "coordenador");
		Coordenador coordenador1 = new Coordenador(++idPessoa, "Alessandra Luana Cec�lia Baptista", "135.766.013-84", "coordenador");
		
		SecAcademica secAcademica0 = new SecAcademica(++idPessoa, "Anderson F�bio M�rio Santos", "596.002.023-89", "secretario academico");
		SecAcademica secAcademica1 = new SecAcademica(++idPessoa, "Elisa Olivia Juliana Melo", "775.919.453-60", "secretaria academica");
		
		SecFinanceira secFinanceira0 = new SecFinanceira(++idPessoa, "Bryan Bento Henrique Gon�alves", "847.708.383-52", "secretario academico");
		SecFinanceira secFinanceira1 = new SecFinanceira(++idPessoa, "Vit�ria Eduarda dos Santos", "424.361.063-04", "secretaria academica");
		
		Agencia agencia = new Agencia();
		Gerente gerente0 = new Gerente(++idPessoa, "Patr�cia Larissa Ros�ngela Barros", "155.284.013-13", "gerente", agencia.getId());
		agencia = new Agencia(++idEmpresa, gerente0.getId());
		
		Gerente gerente1 = new Gerente(++idPessoa, "Danilo Alexandre Marcos Viana", "785.738.333-35", "gerente", agencia.getId());
		agencia = new Agencia(++idEmpresa, gerente1.getId());
		
		Diretor diretor0 = new Diretor(++idPessoa, "Rafael Anthony Nicolas Peixoto", "256.443.233-66", "diretor");
		
		Presidente presidente0 = new Presidente(++idPessoa, "Renata Mariana Isadora da Cruz", "935.180.683-93|", "presidente");
		
		Disciplina disciplina0 = new Disciplina(++idDis, "Programa��o", professor2.getId());
		Disciplina disciplina1 = new Disciplina(++idDis, "Banco de Dados", professor2.getId());
		Disciplina disciplina2 = new Disciplina(++idDis, "Seguran�a da Informa��o", professor0.getId());
		Disciplina disciplina3 = new Disciplina(++idDis, "Redes de Computadores", professor0.getId());
		Disciplina disciplina4 = new Disciplina(++idDis, "Anatomia", professor1.getId());
		Disciplina disciplina5 = new Disciplina(++idDis, "Biologia celular e molecular", professor1.getId());
		Disciplina disciplina6 = new Disciplina(++idDis, "Embriologia", professor3.getId());
		Disciplina disciplina7 = new Disciplina(++idDis, "Imunologia", professor3.getId());
		
		
		Curso curso0 = new Curso(++idCurso, "Ci�ncia da Computa��o", coordenador0.getId());
		Curso curso1 = new Curso(++idCurso, "Medicina", coordenador1.getId());
		
		Banco banco0 = new Banco(++idBanco, "Santander", "85.875.897/0001-50");
		
		
		op = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o desejada: \n"
				+ "01 Para cadastrar uma pessoa \n"
				+ "02 Para cadastrar uma empresa \n"));
		
		if(op == 1) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o desejada: \n"
					+ "01 Para cadastrar aluno: \n"
					+ "02 Para cadastrar professor: \n"
					+ "03 Para cadastrar coordenador: \n"
					+ "04 Para cadastrar secret�rio(a) acad�mico(a): \n"
					+ "05 Para cadastrar secret�rio(a) financeiro(a): \n"
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
			op = Integer.parseInt(JOptionPane.showInputDialog("Informe a op��o desejada: \n"));
		}
		
		
		
		sc.close();

	}

}
