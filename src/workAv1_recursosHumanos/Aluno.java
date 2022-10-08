package workAv1_recursosHumanos;

import java.util.Set;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class Aluno extends Pessoa implements PessoaFisica {
	
	private Integer matricula;
	
	public Aluno() {
		
	}

	public Aluno(Integer id, String name, String cpf, Integer matricula) {
		super(id, name, cpf);
		this.matricula = matricula;
	}
	
	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public void listarDadosAluno(Aluno aluno) {
		System.out.println("Dados do aluno: \n");
		System.out.println("Nome:      " + aluno.name);
		System.out.println("Id:        " + aluno.id);
		System.out.println("CPF:       " + aluno.cpf_cnpj);
		System.out.println();
	}
	
	public void listarContasAluno(Aluno aluno) {
		System.out.println("Dados financeiros do aluno: \n");
		for(ContaCorrente cc : aluno.listaContaC) {
			System.out.println("Nome do titular:      " + aluno.getName());
			System.out.println("Conta corrente nº:    " + cc.getId());
		}
		System.out.println();
		for(ContaPoupanca cp : aluno.listaContaP) {
			System.out.println("Nome do titular:      " + aluno.getName());
			System.out.println("Conta poupança nº:    " + cp.getId());
		}
		System.out.println();
	}
	
	public Set<ContaCorrente> getListContaC(){
		return listaContaC;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}


}
