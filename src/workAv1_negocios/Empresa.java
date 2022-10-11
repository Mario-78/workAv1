package workAv1_negocios;

import java.util.HashSet;
import java.util.Set;

import workAv1_recursosHumanos.Pessoa;
import workAv1_recursosHumanos.Presidente;

public abstract class Empresa extends Pessoa implements PessoaJuridica {
	
	private Set<Presidente> listaPresidentes = new HashSet<Presidente>();
	private Set<Faculdade> listaFaculdades = new HashSet<Faculdade>();
	private Set<Banco> listaBancos = new HashSet<Banco>();
	
	public Empresa() {
		
	}

	public Empresa(Integer id, String name, String cnpj) {
		super(id, name, cnpj);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnpj() {
		return cpf_cnpj;
	}

	public void setCnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}	

	public void addPresidente(Presidente presidente) {
		listaPresidentes.add(presidente);
	}
	
	public void removePresidente(Presidente presidente) {
		listaPresidentes.remove(presidente);
	}
	
	public void listarPresidentes() {
		System.out.println("\nLista de presidentes: ");
		for(Presidente p : listaPresidentes) {
			System.out.println("\nNome:      " + p.getName());
			System.out.println("\nId:        " + p.getId());
			//System.out.println("\nCPF:       " + p.getCpf_cnpj());
		}
	}
	
	public Presidente findPresidente(Integer id) {
		Presidente findPresidente = new Presidente();
		for(Presidente p : listaPresidentes) {
			if(p.getId() == id) {
				findPresidente = p;
			}
		}
		return findPresidente;
	}
	
	public void addListaFaculdade(Faculdade faculdade) {
		listaFaculdades.add(faculdade);
	}
	
	public void removeListaFaculdade(Faculdade faculdade) {
		listaFaculdades.remove(faculdade);
	}
	
	public void listarFaculdades() {
		for(Faculdade f : listaFaculdades) {
			System.out.println("Nome da faculdade:      " + f.name);
			System.out.println("Id da faculdade:        " + f.id);
			System.out.println("CNPJ da faculdade:      " + f.cpf_cnpj);
			System.out.println();
		}
		System.out.println();
	}
	
	public Faculdade findFaculdade(Integer id) {
		Faculdade findFaculdade = new Faculdade();
		for(Faculdade f : listaFaculdades) {
			if(f.id == id) {
				findFaculdade = f;
			}
		}
		return findFaculdade;
	}
	
	public void addListaBanco(Banco banco) {
		listaBancos.add(banco);
	}
	
	public void removeListaBanco(Banco banco) {
		listaBancos.remove(banco);
	}
	
	public void listarBancos() {
		for(Banco b : listaBancos) {
			System.out.println("Nome do banco:           " + b.name);
			System.out.println("Id do banco:             " + b.id);
			System.out.println("CNPJ do banco:           " + b.cpf_cnpj);
		}
	}
	
	public Banco findBanco(Integer id) {
		Banco findBanco = new Banco();
		for(Banco b : listaBancos) {
			if(b.id == id) {
				findBanco = b;
			}
		}
		return findBanco;
	}
	
	@Override
	public boolean pessoaJuridica() {
		return true;
	}
	
}
