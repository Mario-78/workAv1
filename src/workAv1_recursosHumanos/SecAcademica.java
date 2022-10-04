package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

public class SecAcademica extends Funcionario {
	
	private Set<Object> filaAlunos = new HashSet<Object>();
	
	public SecAcademica() {
		
	}

	public SecAcademica(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);
	}
	
	public void addFilaAluno(Object aluno) {
		filaAlunos.add(aluno);
	}
	
	public void removeFilaAluno(Object aluno) {
		filaAlunos.remove(aluno);
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
