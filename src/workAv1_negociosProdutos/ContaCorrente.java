package workAv1_negociosProdutos;

public class ContaCorrente implements Conta {
	
	private Integer id;
	private Integer idTitular;
	private Integer idGerente;
	private Double saldo;
	private Double credEspecial;
	
	

	public ContaCorrente(Integer id, Integer idTitular, Integer idGerente, Double credEspecial) {
		super();
		this.id = id;
		this.idTitular = idTitular;
		this.idGerente = idGerente;
		this.credEspecial = credEspecial;
	}

	@Override
	public void deposito(Double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saque(Double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saldo() {
		// TODO Auto-generated method stub
		
	}

}
