package workAv1_negocios;

import java.util.HashSet;
import java.util.Set;

import workAv1_recursosHumanos.Gerente;
import workAv1_recursosHumanos.Presidente;

public class Banco extends  Empresa{
	
	private Presidente presidente = null;
	private Set<Gerente> listaGerentes = new HashSet<Gerente>();
	private Set<Agencia> listaAgencias = new HashSet<Agencia>();
	
	public Banco() {
		
	}
	
	public Banco(Integer id, String name, String cnpj) {
		super(id, name, cnpj);
	}	

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public void addListaGerente(Gerente gerente) {
		listaGerentes.add(gerente);
	}
	
	public void removeListaGerente(Gerente gerente) {
		listaGerentes.remove(gerente);
	}
	
	public void listarGerentes(Banco banco) {
		for(Gerente g : banco.listaGerentes) {
			System.out.println("Nome do gerente:   " + g.getName());
			System.out.println("Id do gerente:     " + g.getId());
			/*
			 * for(Agencia a : listaAgencias) { if(g.getId() == a.getIdGerente()) {
			 * System.out.println("Nome da agencia:   " + a.getNameAg());
			 * System.out.println("Id da agência:     " + a.getIdAg()); } }
			 */
		}
	}
	
	public Gerente findGerente(Integer id, Banco banco) {
		Gerente findGerente = new Gerente();
		for(Gerente g : banco.listaGerentes) {
			if(g.getId() == id) {
				findGerente = g;
			}
		}
		return findGerente;
	}
	
	public void addListaAgencia(Agencia agencia) {
		listaAgencias.add(agencia);
	}
	
	public void removeListaAgencia(Agencia agencia) {
		listaAgencias.remove(agencia);
	}
	
	public void listarAgencias(Banco banco) {
		System.out.println("\nLista de agências disponíveis: \n");
		for(Agencia a : banco.listaAgencias) {
			System.out.println("Nome do banco:     " + a.name);
			System.out.println("Id do banco:       " + a.id);
			System.out.println("Nome da agência:   " + a.getNameAgencia());
			System.out.println("Id da agência:     " + a.getIdAgencia());
			System.out.println();
		}
		System.out.println("\n");
	}
	
	public void listarDadosAgencias(Banco banco) {
		for(Agencia a : banco.listaAgencias) {
			System.out.println("Nome do banco:     " + a.name);
			System.out.println("Id do banco:       " + a.id);
			System.out.println("Nome da agência:   " + a.getNameAgencia());
			System.out.println("Id da agência:     " + a.getIdAgencia());
			for(Gerente g : banco.listaGerentes) {
				System.out.println("Nome do gerente:   " + g.getName());
				System.out.println("Id do gerente:     " + g.getId());
			}
		}
	}
	
	public Agencia findAgencia(Integer id, Banco banco) {
		Agencia findAgencia = new Agencia();
		for(Agencia a : banco.listaAgencias) {
			if(a.id == id) {
				findAgencia = a;
			}
		}
		return findAgencia;
	}

	@Override
	public boolean pessoaJuridica() {
		return true;
	}

}
