package workAv1_recursosHumanos;

import workAv1_negociosProdutos.Conta;

public abstract class Funcionario extends Pessoa {
	
	private String fun��o;

	public Funcionario(Integer id, String name, String fun��o) {
		super(id, name);
		this.fun��o = fun��o;
	}

	
}
