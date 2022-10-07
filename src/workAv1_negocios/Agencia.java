package workAv1_negocios;

public class Agencia extends Banco {
	
	private Integer idAg;
	private String nameAg;
	private Integer idGerente;
	
	public Agencia() {
		
	}

	public Agencia(Integer idBanco, String nameBanco, String cnpj, Integer idAg, String nameAg, Integer idGerente) {
		super(idBanco, nameBanco, cnpj);
		this.idAg = idAg;
		this.nameAg = nameAg;
		this.idGerente = idGerente;
	}

	public Integer getIdAg() {
		return idAg;
	}

	public void setIdAg(Integer idAg) {
		this.idAg = idAg;
	}

	public String getNameAg() {
		return nameAg;
	}

	public void setNameAg(String nameAg) {
		this.nameAg = nameAg;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	
	
}
