package workAv1_recursosHumanos;

import workAv1_negociosProdutos.Conta;

public abstract class Funcionario extends Pessoa {
	
	private String função;

	public Funcionario(Integer id, String name, String função) {
		super(id, name);
		this.função = função;
	}

	
}
