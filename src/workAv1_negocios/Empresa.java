package workAv1_negocios;

import workAv1_recursosHumanos.Pessoa;

public abstract class Empresa extends Pessoa implements PessoaJuridica {
	
	public Empresa() {
		
	}

	public Empresa(Integer id, String name, String cnpj) {
		super(id, name, cnpj);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cpf_cnpj;
	}

	public void setCnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
}
