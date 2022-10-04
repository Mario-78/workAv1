package workAv1_recursosHumanos;

import workAv1_estruturaOrganizacional.Diretoria;
import workAv1_estruturaOrganizacional.Secretaria;
import workAv1_negociosProdutos.ContaCorrente;

public abstract class Funcionario extends Pessoa implements PessoaFisica, Diretoria, Secretaria{
	
	protected String fun��o;

	public Funcionario(Integer id, String name, String cpf, String fun��o) {
		super(id, name, cpf);
		this.fun��o = fun��o;
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

	public String getFun��o() {
		return fun��o;
	}

	public void setFun��o(String fun��o) {
		this.fun��o = fun��o;
	}	
	
	public void addContaCorrente(ContaCorrente conta) {
		contaC.add(conta);
	}
	
	public void removeContaCorrente(ContaCorrente conta) {
		contaC.remove(conta);
	}
	
	public void listarContasCorrente() {
		
	}
}
