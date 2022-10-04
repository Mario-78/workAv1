package workAv1_recursosHumanos;

public class Aluno extends Pessoa implements PessoaFisica {
	
	private Integer matricula;
	
	public Aluno() {
		
	}

	public Aluno(Integer id, String name, String cpf, Integer matricula) {
		super(id, name, cpf);
		this.matricula = matricula;
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

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}


}
