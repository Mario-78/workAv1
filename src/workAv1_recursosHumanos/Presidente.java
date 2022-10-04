package workAv1_recursosHumanos;

public class Presidente extends Funcionario {
	
	public Presidente() {
		
	}

	public Presidente(Integer id, String name, String cpf, String fun��o) {
		super(id, name, cpf, fun��o);		
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
