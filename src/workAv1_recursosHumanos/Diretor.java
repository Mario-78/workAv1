package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

import workAv1_estruturaOrganizacional.Diretoria;

public class Diretor extends Funcionario implements PessoaFisica, Diretoria {
	
	
	
	public Diretor(Integer id, String name, String função) {
		super(id, name, função);

	}

	private Set<Coordenador> coordenador = new HashSet<Coordenador>();

	@Override
	public void cadCpf(String cpf) {
		
		
	}

	@Override
	public void cadHierarquia() {
	
		
	}

}
