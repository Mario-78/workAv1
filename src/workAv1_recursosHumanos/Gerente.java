package workAv1_recursosHumanos;

import java.util.ArrayList;
import java.util.List;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class Gerente extends Funcionario  {
	
	private Fila<Pessoa> filaPessoas = new Fila<Pessoa>();
	private Integer idAgencia;
	
	
	
	public Gerente() {
		
	}

	public Gerente(Integer id, String name, String cpf, String funcao, Integer idAgencia) {
		super(id, name, cpf, funcao);
		this.idAgencia = idAgencia;
	}
	
	public Fila<Pessoa> getFilaPessoas(){
		return filaPessoas;
	}
	
	public Integer getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(Integer idAgencia) {
		this.idAgencia = idAgencia;
	}
	
	public void listarContasGernte(Gerente gerente) {
		System.out.println("Dados financeiros do gerente: \n");
		for(ContaCorrente cc : gerente.listaContaC) {
			System.out.println("Nome do titular:      " + gerente.getName());
			System.out.println("Conta corrente nº:    " + cc.getId());
		}
		System.out.println();
		for(ContaPoupanca cp : gerente.listaContaP) {
			System.out.println("Nome do titular:      " + gerente.getName());
			System.out.println("Conta poupança nº:    " + cp.getId());
		}
		System.out.println();
	}
	
	/*public void listarFilaPessoas(Gerente gerente){
		System.out.println("\nPessoas na fila aguardando atendimento do(a) gerente: ");
		if(gerente.filaPessoas.isEmpty()) {
			System.out.println("\nNão há pessoas aguardando na fila!!!!!");
		}else {
			for(Pessoa p : gerente.filaPessoas) {
				System.out.println("\nNome:                         " + p.name);
				System.out.println("\nCPF:                          " + p.cpf_cnpj);
				System.out.println("\nPosição da pessoa na fila:    " + gerente.filaPessoas.indexOf(p) + 1);
			}
			System.out.println();
		}
		System.out.println();
	}*/
	
	public void listarDadosGerente(Gerente gerente) {
		System.out.println("\nDados do gerente: ");
		System.out.println("\nNome:                         " + gerente.name);
		System.out.println("\nId:                           " + gerente.id);
		System.out.println("\nCPF:                          " + gerente.cpf_cnpj);
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
		return false;
	}

	

	
}
