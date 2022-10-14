package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;
import workAv1_negociosProdutos.Disciplina;

public class Professor extends Funcionario implements PessoaFisica {
	
	private Fila<Aluno> fila = new Fila<Aluno>();
	private Set<Disciplina> listaDiciplinas = new HashSet<Disciplina>();
		
	
	public Professor() {
		
	}

	public Professor(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);		
	}
	
	public Fila<Aluno> getFilaAlunos() {
		return fila;
	}

	public void addDisciplina(Disciplina disciplina) {
		listaDiciplinas.add(disciplina);
	}
	
	public void removeDisciplina(Disciplina disciplina) {
		listaDiciplinas.remove(disciplina);
	}
	
	public void listarDisciplinas(Professor professor) {
		for(Disciplina d : professor.listaDiciplinas) {
			System.out.println("Nome da disciplina:      " + d.getName());
			System.out.println("Id da disciplina:        " + d.getId());
		}
	}
	
	public void listarContasProfessor(Professor professor) {
		System.out.println("Dados financeiros do professor: \n");
		for(ContaCorrente cc : professor.listaContaC) {
			System.out.println("Nome do titular:      " + professor.name);
			System.out.println("Conta corrente nº     " + cc.getId());
		}
		System.out.println();
		for(ContaPoupanca cp : professor.listaContaP) {
			System.out.println("Nome do titular:      " + professor.name);
			System.out.println("Conta corrente nº     " + cp.getId());
		}
	}
	
	public void listarDadosProfessor(Professor professor) {
		System.out.println("Dados do professor: \n");
		System.out.println("Nome:      " + professor.name);
		System.out.println("Id:        " + professor.id);
		System.out.println("CPF:       " + professor.cpf_cnpj);
		System.out.println();
	}
	
	@Override
	public boolean diretoria() {
		return false;
	}

	@Override
	public boolean secretaria() {
		return false;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}
		
}
