package workAv1_recursosHumanos;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class Presidente extends Funcionario {
	
	public Presidente() {
		
	}

	public Presidente(Integer id, String name, String cpf, String funcao) {
		super(id, name, cpf, funcao);		
	}
	
	public void listarContasPresidente(Presidente presidente) {
		System.out.println("Dados financeiros do presidente: \n");
		for(ContaCorrente cc : presidente.listaContaC) {
			System.out.println("Nome do titular:      " + presidente.getName());
			System.out.println("Conta corrente n�:    " + cc.getId());
		}
		System.out.println();
		for(ContaPoupanca cp : presidente.listaContaP) {
			System.out.println("Nome do titular:      " + presidente.getName());
			System.out.println("Conta poupan�a n�:    " + cp.getId());
		}
	}
	
	public void listarDadosPresidente(Presidente presidente) {
		System.out.println("\nDados pessoais do presidente: ");
		System.out.println("\nNome:                         " + presidente.name);
		System.out.println("\nId:                           " + presidente.id);
		System.out.println("\nCPF:                          " + presidente.cpf_cnpj);
	}

	@Override
	public boolean secretaria() {
		return false;
	}

	@Override
	public boolean diretoria() {
		return true;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}
	
	

}
