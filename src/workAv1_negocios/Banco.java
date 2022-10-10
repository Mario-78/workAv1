package workAv1_negocios;

import java.util.HashSet;
import java.util.Set;

import workAv1_recursosHumanos.Gerente;
import workAv1_recursosHumanos.Presidente;

public class Banco extends  Empresa{
	
	private Set<Presidente> listaPresidentes = new HashSet<Presidente>();
	private Set<Gerente> listaGerentes = new HashSet<Gerente>();
	private Set<Agencia> listaAgencias = new HashSet<Agencia>();
	
	public Banco() {
		
	}
	
	public Banco(Integer id, String name, String cnpj) {
		super(id, name, cnpj);
	}	
	
	public void addListaPresidente(Presidente presidente) {
		listaPresidentes.add(presidente);
	}
	
	public void removeListaPresidente(Presidente presidente) {
		listaPresidentes.remove(presidente);
	}
	
	public void listarPresidentes(Banco banco) {
		for(Presidente p : banco.listaPresidentes) {
			System.out.println("Nome do presidente:      " + p.getName());
			System.out.println("Id do presidente:        " + p.getId());
			System.out.println("Nome do banco:           " + banco.name);
			System.out.println("Id do banco:             " + banco.id);
			System.out.println("CNPJ do banco:           " + banco.cpf_cnpj);
		}
	}
	
	public Presidente findPresidente(Integer id, Banco banco) {
		Presidente findPresidente = new Presidente();
		for(Presidente p : banco.listaPresidentes) {
			if(p.getId() == id) {
				findPresidente = p;
			}
		}
		return findPresidente;
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
			for(Agencia a : listaAgencias) {
				if(g.getId() == a.getIdGerente()) {
					System.out.println("Nome da agencia:   " + a.getNameAg());
					System.out.println("Id da agência:     " + a.getIdAg());
				}
			}
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
	
	public void listaAgencias(Banco banco) {
		for(Agencia a : banco.listaAgencias) {
			System.out.println("Nome da agência:   " + a.getNameAg());
			System.out.println("Id da agência:     " + a.getIdAg());
		}
	}
	
	public void listarDadosAgencias(Banco banco) {
		for(Agencia a : banco.listaAgencias) {
			System.out.println("Nome do banco:     " + a.name);
			System.out.println("Id do banco:       " + a.id);
			System.out.println("Nome da agência:   " + a.getNameAg());
			System.out.println("Id da agência:     " + a.getIdAg());
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
