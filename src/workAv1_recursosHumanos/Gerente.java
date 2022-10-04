package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

public class Gerente extends Funcionario  {
	
	private Integer idAgencia;
	private Set<Object> filaPessoas = new HashSet<Object>();

	public Gerente(Integer id, String name, String cpf, String funcao, Integer idAgencia) {
		super(id, name, cpf, funcao);
		this.idAgencia = idAgencia;
	}
	
	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}
	
	public void addFilaPessoas(Object pessoa) {
		filaPessoas.add(pessoa);
	}
	
	public void removeFilaPessoas(Object pessoa) {
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
		return false;
	}

	

	
}
