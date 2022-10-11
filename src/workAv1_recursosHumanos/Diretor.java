package workAv1_recursosHumanos;

import java.util.ArrayList;
import java.util.List;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class Diretor extends Funcionario {
	
	private List<Coordenador> filaCoordenadores = new ArrayList<Coordenador>();	
	
	public Diretor() {
		
	}
	
	public Diretor(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);
	}
	
	public void addFilaCoordenadores(Coordenador coordenador) {
		filaCoordenadores.add(coordenador);
	}
	
	public void removeFilaCoordenador(Coordenador coordenador) {
		filaCoordenadores.remove(coordenador);
	}
	
	public void listarFilaCoordenadores(Diretor diretor) {
		System.out.println("Lista de coordenadores aguardando atendimento: \n");		
		for(Coordenador c : diretor.filaCoordenadores) {
			System.out.println("Nome do coordenador:     " + c.getName());
			System.out.println("Id do coordenador:       " + c.getId());
		}
		System.out.println();
	}
	
	public Coordenador realizarAtendimento(Diretor diretor) {
		Coordenador findCoordenador = new Coordenador();
		int i = 0;
		for(Coordenador c : diretor.filaCoordenadores) {
			if(i == filaCoordenadores.size()) {
				findCoordenador = c;
			}
		}
		return findCoordenador;
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
