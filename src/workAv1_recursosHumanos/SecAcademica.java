package workAv1_recursosHumanos;

import java.util.ArrayList;
import java.util.List;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class SecAcademica extends Funcionario {
	
	private List<Aluno> filaAlunos = new ArrayList<Aluno>();
	
	public SecAcademica() {
		
	}

	public SecAcademica(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);
	}
	
	public void addFilaAluno(Aluno aluno) {
		filaAlunos.add(null);
	}
	
	public void removeFilaAluno(Object aluno) {
		filaAlunos.remove(aluno);
	}
	
	public void listarDadosSecAcademica(SecAcademica sec) {
		System.out.println("\nDados pessoais do secretário(a) academico(a)");
		System.out.println("\nNome:                     " + sec.name);
		System.out.println("\nId:                       " + sec.id);
		System.out.println("\nCPF:                      " + sec.cpf_cnpj);
		System.out.println();
	}
	
	public void listarContasSecAcad(SecAcademica sec) {
		System.out.println("\nDados financeiros do secretário(a) academico(a)");
		for(ContaCorrente cc : sec.listaContaC) {
			System.out.println("Nome do titular:      " + sec.name);
			System.out.println("Conta corrente nº     " + cc.getId());
		}
		for(ContaPoupanca cp : sec.listaContaP) {
			System.out.println("Nome do titular:      " + sec.name);
			System.out.println("Conta corrente nº     " + cp.getId());
		}
		System.out.println();
	}
	
	public void listarFilaAlunos(SecAcademica sec) {
		System.out.println("Lista de alunos aguardando atendimento: \n");
		for(Aluno a : sec.filaAlunos) {
			System.out.println("\nNome do aluno:           " + a.name);
			System.out.println("\nPosição do aluno na fila " + sec.filaAlunos.indexOf(a));
		}
	}
	
	public Aluno realizarAtendimentoAluno(SecAcademica sec) {
		Aluno findAluno = new Aluno();
		int i = 0;
		for(Aluno a : sec.filaAlunos) {
			if(i == sec.filaAlunos.size()) {
				findAluno = a;
			}
			i++;
		}
		return findAluno;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}

	@Override
	public boolean diretoria() {
		return false;
	}

	@Override
	public boolean secretaria() {
		return true;
	}
	
}
