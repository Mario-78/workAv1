package workAv1_recursosHumanos;

public class Gerente extends Funcionario implements PessoaFisica {
	
	private Integer idAgencia;	

	public Gerente(Integer id, String name, String função, Integer idAgencia) {
		super(id, name, função);
		this.idAgencia = idAgencia;
	}

	@Override
	public void cadCpf(String cpf) {
		
		
	}

}
