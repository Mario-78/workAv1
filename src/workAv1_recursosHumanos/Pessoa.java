package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public abstract class Pessoa {
	
	protected Integer id;
	protected String name;
	protected String cpf_cnpj;
	protected Set<ContaCorrente> listaContaC = new HashSet<ContaCorrente>();
	protected Set<ContaPoupanca> listaContaP = new HashSet<ContaPoupanca>();
	
	public Pessoa() {
		
	}
	
	public Pessoa(Integer id, String name, String cpf_cnpj) {
		this.id = id;
		this.name = name;
		this.cpf_cnpj = cpf_cnpj;
	}
	
	public void addContaCorrente(ContaCorrente conta) {
		listaContaC.add(conta);
	}
	
	public void removeContaCorrente(ContaCorrente conta) {
		listaContaC.remove(conta);
	}
	
	public void addContaPoupanca(ContaPoupanca conta) {
		listaContaP.add(conta);
	}
	
	public void removeContaPoupanca(ContaPoupanca conta) {
		listaContaP.remove(conta);
	}
	
}
