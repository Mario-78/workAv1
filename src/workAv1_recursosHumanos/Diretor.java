package workAv1_recursosHumanos;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class Diretor extends Funcionario {
	
	private Fila<Pessoa> filaCoordenadores = new Fila<Pessoa>();	
	
	public Diretor() {
		
	}
	
	public Diretor(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);
	}
	
	public Fila<Pessoa> getFilaPessoas(){
		return filaCoordenadores;
	}
	
	public void listarContasDiretor(Diretor diretor) {
		System.out.println("Dados financeiros do diretor: \n");
		for(ContaCorrente cc : diretor.listaContaC) {
			System.out.println("Nome do titular:      " + diretor.getName());
			System.out.println("Conta corrente nº:    " + cc.getId());
		}
		System.out.println();
		for(ContaPoupanca cp : diretor.listaContaP) {
			System.out.println("Nome do titular:      " + diretor.getName());
			System.out.println("Conta poupança nº:    " + cp.getId());
		}
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}

	@Override
	public boolean diretoria() {
		return true;
	}

	@Override
	public boolean secretaria() {
		return false;
	}

	public String GetDiretorName(Integer id) {
		return name;
	}
	
	public void listarDadosDiretor(Diretor diretor) {
			System.out.println("Diretor:         " + diretor.name);
			System.out.println("Id do diretor:   " + diretor.id);
	}
	
}
