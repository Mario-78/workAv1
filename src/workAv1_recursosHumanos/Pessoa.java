package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public abstract class Pessoa {
	
	protected Integer id;
	protected String name;
	protected String cpf;
	protected Set<ContaCorrente> contaC = new HashSet<ContaCorrente>();
	protected Set<ContaPoupanca> contaP = new HashSet<ContaPoupanca>();
	
	public Pessoa() {
		
	}
	
	public Pessoa(Integer id, String name, String cpf) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
	}
	
	
	
}
