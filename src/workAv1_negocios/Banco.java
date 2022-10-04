package workAv1_negocios;

public class Banco extends  Empresa{
	
	public Banco() {
		
	}
	
	public Banco(Integer id, String name, String cnpj) {
		super(id, name, cnpj);
	}

	@Override
	public boolean pessoaJuridica() {
		return true;
	}

}
