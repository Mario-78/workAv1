package workAv1_negociosProdutos;

public class ContaPoupanca implements Conta{
	
	private Integer id;
	private Integer idTitular;
	private Integer idGerente;
	private Double saldo;	
	
	public ContaPoupanca() {
		
	}

	public ContaPoupanca(Integer id, Integer idTitular, Integer idGerente) {
		this.id = id;
		this.idTitular = idTitular;
		this.idGerente = idGerente;
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

	@Override
	public void deposito(Double valor) {
		this.saldo += valor;		
	}

	@Override
	public void saque(Double valor) {
		this.saldo -= valor;
	}

	@Override
	public void saldo() {
		System.out.println("Saldo atual: " + this.saldo);
	}

}
