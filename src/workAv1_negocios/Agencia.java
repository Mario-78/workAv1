package workAv1_negocios;

public class Agencia  {
	
	private Integer id;
	private Integer idGerente;
	
	public Agencia() {
		
	}
	
	public Agencia(Integer id, Integer idGerente) {
		super();
		this.id = id;
		this.idGerente = idGerente;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}
	
	

}
