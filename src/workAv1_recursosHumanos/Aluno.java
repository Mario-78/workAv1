package workAv1_recursosHumanos;

public class Aluno extends Pessoa implements PessoaFisica {
	
	private String matricula;

	public Aluno(Integer id, String name, String cpf) {
		super(id, name, cpf);

	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCpf() {
		return cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}


}
