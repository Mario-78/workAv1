package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario implements PessoaFisica {
	
	private Set<Aluno> fila = new HashSet<Aluno>();
	
	

	public Professor(Integer id, String name, String fun��o) {
		super(id, name, fun��o);
		
	}



	@Override
	public void cadCpf(String cpf) {
		
		
	}

}
