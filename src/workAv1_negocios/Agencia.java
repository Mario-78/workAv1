package workAv1_negocios;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agencia other = (Agencia) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
