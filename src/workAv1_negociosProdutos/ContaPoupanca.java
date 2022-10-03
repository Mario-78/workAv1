package workAv1_negociosProdutos;

public class ContaPoupanca implements Conta{
	
	private Integer id;
	private Integer idTitular;
	private Integer idGerente;
	private Double saldo;
	
	
	

	public ContaPoupanca(Integer id, Integer idTitular, Integer idGerente) {
		super();
		this.id = id;
		this.idTitular = idTitular;
		this.idGerente = idGerente;
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
