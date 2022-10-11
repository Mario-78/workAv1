package workAv1_recursosHumanos;

import java.util.ArrayList;
import java.util.List;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class SecFinanceira extends Funcionario {
	
	private List<Pessoa> filaPessoas = new ArrayList<Pessoa>();
	
	public SecFinanceira() {
		
	}

	public SecFinanceira(Integer id, String name, String cpf, String fun��o) {
		super(id, name, cpf, fun��o);
	}
	
	public void addFilaPessoa(Pessoa pessoa) {
		filaPessoas.add(pessoa);
	}
	
	public void removeFilaPessoa(Pessoa pessoa) {
		filaPessoas.remove(pessoa);
	}
	
	
	
	public void listarFilaPessoas(SecFinanceira sec) {
		System.out.println("\nPessoas na fila aguardando atendimento do(a) secret�rio(a) financeiro(a)");
		if(sec.filaPessoas.isEmpty()) {
			System.out.println("\nN�o h� pessoas aguardando na fila!!!!!");
		}else {
			for(Pessoa p : sec.filaPessoas) {
				System.out.println("\nNome:                         " + p.name);
				System.out.println("\nCPF:                          " + p.cpf_cnpj);
				System.out.println("\nPosi��o da pessoa na fila:    " + sec.filaPessoas.indexOf(p));
			System.out.println();
			}
		}
		System.out.println();
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
	
	public Integer findIdPrimeiraPessoaFila(SecFinanceira sec) {
		Integer i = 0, findId = 0;
		for(Pessoa p : sec.filaPessoas) {
			if(i == sec.filaPessoas.size()) {
				findId = p.id;
			}
			i++;
		}
		
		return findId;
	}
	
	public void realizarAtendimento(Integer id, SecFinanceira sec) {
		for(Pessoa p : sec.filaPessoas) {
			if(p.id == id) {
				sec.removeFilaPessoa(p);
			}
		}
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
