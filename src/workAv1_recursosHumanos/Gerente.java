package workAv1_recursosHumanos;

public class Gerente extends Funcionario implements PessoaFisica {
	
	private Integer idAgencia;	

	public Gerente(Integer id, String name, String fun��o, Integer idAgencia) {
		super(id, name, fun��o);
		this.idAgencia = idAgencia;
	}

	@Override
	public void cadCpf(String cpf) {
		
		
	}

}
