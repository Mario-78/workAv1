package workAv1_negocios;

import workAv1_recursosHumanos.Gerente;

public class Agencia extends Banco {
	
	private Gerente gerente = null;
	private Integer idAg;
	private String nameAgencia;
	private Integer idGerente;
	
	public Agencia() {
		
	}

	public Agencia(Integer idBanco, String nameBanco, String cnpj, Integer idAg, String nameAgencia, Integer idGerente) {
		super(idBanco, nameBanco, cnpj);
		this.idAg = idAg;
		this.nameAgencia = nameAgencia;
		this.idGerente = idGerente;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Integer getIdAgencia() {
		return idAg;
	}

	public void setIdAgencia(Integer idAg) {
		this.idAg = idAg;
	}

	public String getNameAgencia() {
		return nameAgencia;
	}

	public void setNameAg(String nameAgencia) {
		this.nameAgencia = nameAgencia;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	public void listarDadosAgencia(Agencia agencia, Banco banco) {
		System.out.println("\nNome do banco:                " + banco.getName());
		System.out.println("\nCNPJ:                         " + banco.getCnpj());
		System.out.println("\nNome da agência:              " + agencia.name);
		System.out.println("\nId da agência:                " + agencia.id);
		System.out.println("\nGerente da agência:           " + agencia.getGerente().getName());
		
	}
	
}
