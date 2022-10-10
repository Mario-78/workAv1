package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class SecFinanceira extends Funcionario {
	
	private Set<Pessoa> filaPessoas = new HashSet<Pessoa>();
	
	public SecFinanceira() {
		
	}

	public SecFinanceira(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);
	}
	
	public void addFilaPessoa(Pessoa pessoa) {
		filaPessoas.add(pessoa);
	}
	
	public void removeFilaPessoa(Pessoa pessoa) {
		filaPessoas.remove(pessoa);
	}
	
	public void listarDadosSecFinanceira(SecFinanceira sec) {
		System.out.println("\nDados pessoais do secretário(a) financeiro(a)");
		System.out.println("\nNome:                     " + sec.name);
		System.out.println("\nId:                       " + sec.id);
		System.out.println("\nCPF:                      " + sec.cpf_cnpj);
		System.out.println();
	}
	
	public void listarContasSecFin(SecFinanceira sec) {
		System.out.println("\nDados financeiros do secretário(a) financeiro(a)");
		for(ContaCorrente cc : sec.listaContaC) {
			System.out.println("Nome do titular:      " + sec.name);
			System.out.println("Conta corrente nº     " + cc.getId());
		}
		for(ContaPoupanca cp : sec.listaContaP) {
			System.out.println("Nome do titular:      " + sec.name);
			System.out.println("Conta corrente nº     " + cp.getId());
		}
		System.out.println();
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}

	@Override
	public boolean diretoria() {
		return false;
	}

	@Override
	public boolean secretaria() {
		return true;
	}

	
}
