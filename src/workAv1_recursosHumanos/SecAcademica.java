package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

import workAv1_estruturaOrganizacional.Secretaria;

public class SecAcademica extends Funcionario implements PessoaFisica, Secretaria {
	
	private Set<Aluno> fila = new HashSet<Aluno>();

	public SecAcademica(Integer id, String name, String fun��o) {
		super(id, name, fun��o);


	}

	@Override
	public void cadCpf(String cpf) {
		
		
	}

	@Override
	public void cadSetorEspecializado() {
		// TODO Auto-generated method stub
		
	}

}
