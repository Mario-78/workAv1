package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario implements PessoaFisica {
	
	private Set<Object> filaAlunos = new HashSet<Object>();	
	
	public Professor() {
		
	}

	public Professor(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);		
	}
	
	public void addFilaAlunos(Object aluno) {
		filaAlunos.add(aluno);
	}
	
	public void removeFilaAluno(Object aluno) {
		filaAlunos.remove(aluno);
	}	

	@Override
	public boolean diretoria() {
		return true;
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
