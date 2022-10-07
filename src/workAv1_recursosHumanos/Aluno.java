package workAv1_recursosHumanos;

import java.util.Set;

import workAv1_negociosProdutos.ContaCorrente;

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
		return cpf_cnpj;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public void listarContasAluno(Aluno aluno) {
		for(ContaCorrente cc : aluno.listaContaC) {
			System.out.println("Nome do titular: " + aluno.getName());
			System.out.println("Id da conta: " + cc.getId());
		}
	}
	
	public Set<ContaCorrente> getListContaC(){
		return listaContaC;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}


}
