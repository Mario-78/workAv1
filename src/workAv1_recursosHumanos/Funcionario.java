package workAv1_recursosHumanos;

import workAv1_estruturaOrganizacional.Diretoria;
import workAv1_estruturaOrganizacional.Secretaria;
import workAv1_negociosProdutos.ContaCorrente;

public abstract class Funcionario extends Pessoa implements PessoaFisica, Diretoria, Secretaria{
	
	protected String função;

	public Funcionario(Integer id, String name, String cpf, String função) {
		super(id, name, cpf);
		this.função = função;
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

	public String getFunção() {
		return função;
	}

	public void setFunção(String função) {
		this.função = função;
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
