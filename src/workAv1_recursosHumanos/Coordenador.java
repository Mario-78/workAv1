package workAv1_recursosHumanos;

import workAv1_estruturaOrganizacional.Diretoria;

public class Coordenador extends Funcionario implements PessoaFisica, Diretoria {
	
	

	public Coordenador(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);


	}

	@Override
	public boolean secretaria() {
		return false;
	}

	@Override
	public boolean diretoria() {
		return true;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}

	

}
