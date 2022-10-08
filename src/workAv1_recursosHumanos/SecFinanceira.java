package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

public class SecFinanceira extends Funcionario {
	
	private Set<Pessoa> filaPessoas = new HashSet<Pessoa>();
	
	public SecFinanceira() {
		
	}

	public SecFinanceira(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);
	}
	
	public void addFilaPessoa(Pessoa pessoa) {
		filaPessoas.add(pessoa);
	}
	
	public void removeFilaPessoa(Pessoa pessoa) {
		filaPessoas.remove(pessoa);
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
