package workAv1_recursosHumanos;

import java.util.ArrayList;
import java.util.List;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class Professor extends Funcionario implements PessoaFisica {
	
	private List<Aluno> filaAlunos = new ArrayList<Aluno>();	
	
	public Professor() {
		
	}

	public Professor(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);		
	}
	
	public void addFilaAlunos(Aluno aluno) {
		filaAlunos.add(aluno);
	}
	
	public void removeFilaAluno(Aluno aluno) {
		filaAlunos.remove(aluno);
	}
	
	public void listarDadosProfessor(Professor professor) {
		System.out.println("Dados do professor: \n");
		System.out.println("Nome:      " + professor.name);
		System.out.println("Id:        " + professor.id);
		System.out.println("CPF:       " + professor.cpf_cnpj);
		System.out.println();
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
	
	public void listarFilaAlunos(Professor professor) {
		System.out.println("Lista de alunos aguardando atendimento: \n");
		for(Aluno aluno : professor.filaAlunos) {
			System.out.println("Nome do aluno:              " + aluno.name);
			System.out.println("Posição do aluno na fila:   " + professor.filaAlunos.indexOf(aluno));
		}
	}
	
	public Aluno realizarAtendimento(Professor professor) {
		Aluno findAluno = new Aluno();
		int i = 0;
		for(Aluno aluno : professor.filaAlunos) {
			if(i == filaAlunos.size()) {
				findAluno = aluno;			
			}
			i++;
		}
		return findAluno;
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
