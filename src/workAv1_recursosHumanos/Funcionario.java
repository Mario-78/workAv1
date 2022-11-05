package workAv1_recursosHumanos;

import workAv1_estruturaOrganizacional.Diretoria;
import workAv1_estruturaOrganizacional.Secretaria;

public abstract class Funcionario extends Pessoa implements PessoaFisica, Diretoria, Secretaria{
	
	protected String funcao;
	
	public Funcionario() {
		
	}

	public Funcionario(Integer id, String name, String cpf, String funcao) {
		super(id, name, cpf);
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}	
	
}
