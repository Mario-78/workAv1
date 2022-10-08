package workAv1_recursosHumanos;

import workAv1_estruturaOrganizacional.Diretoria;
import workAv1_estruturaOrganizacional.Secretaria;

public abstract class Funcionario extends Pessoa implements PessoaFisica, Diretoria, Secretaria{
	
	protected String função;
	
	public Funcionario() {
		
	}

	public Funcionario(Integer id, String name, String cpf, String função) {
		super(id, name, cpf);
		this.função = função;
	}

	public String getFunção() {
		return função;
	}

	public void setFunção(String função) {
		this.função = função;
	}	
	
}
