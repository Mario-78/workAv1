package workAv1_negocios;

import java.util.Objects;

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
