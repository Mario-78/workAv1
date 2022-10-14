package workAv1_negociosProdutos;

import exceptions.SaldoInsuficienteException;

public class ContaCorrente implements Conta {
	
	private Integer id;
	private Integer idTitular;
	private Integer idGerente;
	private Double saldo;
	private Double credEspecial;
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(Integer id, Integer idTitular, Integer idGerente, Double credEspecial) {
		super();
		this.id = id;
		this.idTitular = idTitular;
		this.idGerente = idGerente;
		this.credEspecial = credEspecial;
	}	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdTitular() {
		return idTitular;
	}

	public void setIdTitular(Integer idTitular) {
		this.idTitular = idTitular;
	}

	public Integer getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Integer idGerente) {
		this.idGerente = idGerente;
	}

	public Double getCredEspecial() {
		return credEspecial;
	}

	public void setCredEspecial(Double credEspecial) {
		this.credEspecial = credEspecial;
	}

	@Override
	public void deposito(Double valor) {
		this.saldo += valor;
	}

	@Override
	public void saque(Double valor) throws SaldoInsuficienteException {
		try {
			
			if((this.saldo -= valor) < 0) {
				throw new SaldoInsuficienteException(this.saldo, valor);
			}else {
				this.saldo -= valor;			
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saldo() {
		System.out.println("Saldo atual: " + this.saldo);		
	}

}
