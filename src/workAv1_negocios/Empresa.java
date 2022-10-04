package workAv1_negocios;

public abstract class Empresa implements PessoaJuridica {
	
	private Integer id;
	private String name;
	private String cnpj;
	
	public Empresa(Integer id, String name, String cnpj) {
		super();
		this.id = id;
		this.name = name;
		this.cnpj = cnpj;
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
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
