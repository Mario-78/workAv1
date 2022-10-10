package workAv1_recursosHumanos;

import java.util.ArrayList;
import java.util.List;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class Coordenador extends Funcionario {
	
	private List<Aluno> filaAlunos = new ArrayList<Aluno>();
	private List<Professor> filaProfessores = new ArrayList<Professor>();
	
	public Coordenador() {
		
	}

	public Coordenador(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);
	}
	
	public void addFilaAluno(Aluno aluno) {
		filaAlunos.add(aluno);
	}
	
	public void removeFilaAluno(Aluno aluno) {
		filaAlunos.remove(aluno);
	}
	
	public void addFilaProfessor(Professor professor) {
		filaProfessores.add(professor);
	}
	
	public void removeFilaProfessor(Professor professor) {
		filaProfessores.remove(professor);
	}
	
	public void listarDadosCoordenador(Coordenador coordenador) {
		System.out.println("Dados do coordenador: \n");
		System.out.println("Nome:      " + coordenador.name);
		System.out.println("Id:        " + coordenador.id);
		System.out.println("CPF:       " + coordenador.cpf_cnpj);
		System.out.println();
	}
	
	public void listarContasCoordenador(Coordenador coordenador) {
		System.out.println("Dados financeiros do coordenador: \n");
		for(ContaCorrente cc : coordenador.listaContaC) {
			System.out.println("Nome do titular:      " + coordenador.name);
			System.out.println("Conta corrente nº     " + cc.getId());
		}
		for(ContaPoupanca cp : coordenador.listaContaP) {
			System.out.println("Nome do titular:      " + coordenador.name);
			System.out.println("Conta corrente nº     " + cp.getId());
		}
	}
	
	public void listarFilaProfessores(Coordenador coordenador) {
		System.out.println("Lista de professores aguardando atendimento: \n");
		for(Professor p : coordenador.filaProfessores) {
			System.out.println("Nome do professor:              " + p.name);
			System.out.println("Posição do professor na fila:   " + coordenador.filaProfessores.indexOf(p));
		}
	}
	
	public Professor realizarAtendimentoProfessor(Coordenador coordenador) {
		Professor findProfessor = new Professor();
		int i = 0;
		for(Professor professor : coordenador.filaProfessores) {
			if(i == filaProfessores.size()) {
				findProfessor = professor;			
			}
			i++;
		}
		return findProfessor;
	}
	
	public void listarFilaAlunos(Coordenador coordenador) {
		System.out.println("Lista de alunos aguardando atendimento: \n");
		for(Aluno aluno : coordenador.filaAlunos) {
			System.out.println("Nome do aluno:              " + aluno.name);
			System.out.println("Posição do aluno na fila:   " + coordenador.filaAlunos.indexOf(aluno));
		}
	}
	
	public Aluno realizarAtendimentoAluno(Coordenador coordenador) {
		Aluno findAluno = new Aluno();
		int i = 0;
		for(Aluno aluno : coordenador.filaAlunos) {
			if(i == filaAlunos.size()) {
				findAluno = aluno;			
			}
			i++;
		}
		return findAluno;
	}
	
	@Override
	public boolean secretaria() {
		return false;
	}

	@Override
	public boolean diretoria() {
		return true;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}	

}
