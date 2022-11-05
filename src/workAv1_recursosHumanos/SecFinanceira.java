package workAv1_recursosHumanos;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class SecFinanceira extends Funcionario {
	
	private Fila<Pessoa> filaPessoas = new Fila<Pessoa>();
	
	public SecFinanceira() {
		
	}

	public SecFinanceira(Integer id, String name, String cpf, String funcao) {
		super(id, name, cpf, funcao);
	}
	
	public Fila<Pessoa> getFilaPessoas(){
		return filaPessoas;
	}
		
	
	public void listarDadosSecFinanceira(SecFinanceira sec) {
		System.out.println("\nDados pessoais do secret�rio(a) financeiro(a)");
		System.out.println("\nNome:                     " + sec.name);
		System.out.println("\nId:                       " + sec.id);
		System.out.println("\nCPF:                      " + sec.cpf_cnpj);
		System.out.println();
	}
	
	public void listarContasSecFin(SecFinanceira sec) {
		System.out.println("\nDados financeiros do secret�rio(a) financeiro(a)");
		for(ContaCorrente cc : sec.listaContaC) {
			System.out.println("Nome do titular:      " + sec.name);
			System.out.println("Conta corrente n�     " + cc.getId());
		}
		for(ContaPoupanca cp : sec.listaContaP) {
			System.out.println("Nome do titular:      " + sec.name);
			System.out.println("Conta corrente n�     " + cp.getId());
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
