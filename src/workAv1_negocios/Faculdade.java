package workAv1_negocios;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;
import workAv1_negociosProdutos.Curso;
import workAv1_negociosProdutos.Disciplina;
import workAv1_recursosHumanos.Coordenador;
import workAv1_recursosHumanos.Diretor;
import workAv1_recursosHumanos.Presidente;
import workAv1_recursosHumanos.Professor;
import workAv1_recursosHumanos.SecAcademica;
import workAv1_recursosHumanos.SecFinanceira;

public class Faculdade extends Empresa {
	
	private Presidente presidente = null;
	private Integer idDiretor;
	private Set<Curso> listaCursos = new HashSet<Curso>();
	private Set<Disciplina> listaDisciplinas = new HashSet<Disciplina>();
	private Set<Coordenador> listaCoordenadores = new HashSet<Coordenador>();
	private Set<SecAcademica> listaSecAcademicas = new HashSet<SecAcademica>();
	private Set<SecFinanceira> listaSecFinanceiras = new HashSet<SecFinanceira>();	 
	private Set<Professor> listaProfessores = new HashSet<Professor>();
	private Set<Diretor> listaDiretores = new HashSet<Diretor>();
	
	public Faculdade() {
		
	}
	
	public Faculdade(Integer id, String name, String cnpj, Integer idDiretor) {
		super(id, name, cnpj);
		this.idDiretor = idDiretor;
	}
	
	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public Integer getIdDiretor() {
		return idDiretor;
	}
	
	public void addListaCurso(Curso curso) {
		listaCursos.add(curso);
	}
	
	public void removeListaCurso(Curso curso) {
		listaCursos.remove(curso);
	}
	
	public void listarCursos(Faculdade faculdade) {
		System.out.println("\nLista de cursos disponíveis na faculdade " + faculdade.name);
		System.out.println();
		for(Curso c : faculdade.listaCursos) {
			System.out.println("Nome do curso:  " + c.getName());
			System.out.println("Id do curso:    " + c.getId());
			System.out.println();
		}
		System.out.println();
	}
	
	public Curso findCurso(Integer id, Faculdade faculdade) {
		Curso curso = new Curso();
		for(Curso c : faculdade.listaCursos) {
			if(c.getId() == id) {
				curso = c;
			}
		}
		return curso;
	}
	
	public void addListaDisciplina(Disciplina disciplina) {
		listaDisciplinas.add(disciplina);
	}
	
	public void removeListaDisciplina(Disciplina disciplina) {
		listaDisciplinas.remove(disciplina);
	}
	
	public void listarDisciplinas(Faculdade faculdade) {
		System.out.println("\nLista de disciplinas da faculdade " + faculdade.name);
		System.out.println();
		for(Disciplina d : faculdade.listaDisciplinas) {
			System.out.println("Nome da disciplina:      " + d.getName());
			System.out.println("Id da disciplina:        " + d.getId());	
			System.out.println();
		}
		System.out.println();
	}
	
	public void addListaCoordenador(Coordenador coordenador) {
		listaCoordenadores.add(coordenador);
	}
	
	public void removeListaCoordenador(Coordenador coordenador) {
		listaCoordenadores.remove(coordenador);
	}
	
	public void listarCoordenadores(Faculdade faculdade) {
		System.out.println("\nLista de coordenadores da faculdade " + faculdade.name);
		System.out.println();
		for(Coordenador c : faculdade.listaCoordenadores) {
			System.out.println("Nome:    " + c.getName());
			System.out.println("Id:      " + c.getId());
			System.out.println();
		}
		System.out.println();
	}
	
	public Coordenador findCoordenador(Integer id, Faculdade faculdade) {
		Coordenador findCoordenador = new Coordenador();
		for(Coordenador c : faculdade.listaCoordenadores) {
			if(c.getId() == id) {
				findCoordenador = c;
			}
		}
		return findCoordenador;
	}
	
	
	public void addListaSecAcademica(SecAcademica sec) {
		listaSecAcademicas.add(sec);
	}
	
	public void removeSecAcademica(SecAcademica sec) {
		listaSecAcademicas.remove(sec);
	}
	
	public void listarSecAcademicas(Faculdade faculdade) {
		System.out.println("Lista de secretários(as) academicos(as) da faculdade " + faculdade.name);
		System.out.println();
		for(SecAcademica sec : faculdade.listaSecAcademicas) {
			System.out.println("Nome:        " + sec.getName());
			System.out.println("Id:          " + sec.getId());
			System.out.println();
		}
		System.out.println();
	}
	
	public SecAcademica findSecAcademica(Integer id, Faculdade faculdade) {
		SecAcademica findSec = new SecAcademica();
		for(SecAcademica sec : faculdade.listaSecAcademicas) {
			if(sec.getId() == id) {
				findSec = sec;
			}
		}
		return findSec;
	}
	
	public void addSecFinanceira(SecFinanceira sec) {
		listaSecFinanceiras.add(sec);
	}
	
	public void removeSecFinanceira(SecFinanceira sec) {
		listaSecFinanceiras.remove(sec);
	}
	
	public void listarSecFinanceiras(Faculdade faculdade) {
		System.out.println("Lista de secretários(as) financeiros(as) da faculdade " + faculdade.name);
		System.out.println();
		for(SecFinanceira sec : faculdade.listaSecFinanceiras) {
			System.out.println("Nome:      " + sec.getName());
			System.out.println("Id:        " + sec.getId());
			System.out.println();
		}
		System.out.println();
	}
	
	public SecFinanceira findSecFinanceira(Integer id, Faculdade faculdade) {
		SecFinanceira findSec = new SecFinanceira();
		for(SecFinanceira sec : faculdade.listaSecFinanceiras) {
			if(sec.getId() == id) {
				findSec = sec;
			}
		}
		return findSec;
	}
	
	public void addListaDiretor(Diretor diretor) {
		listaDiretores.add(diretor);
	}
	
	public void removeListaDiretor(Diretor diretor) {
		listaDiretores.remove(diretor);
	}
	
	public void listarDiretores(Faculdade faculdade) {
		System.out.println("\nLista de diretores(as) disponíveis da faculdade " + faculdade.name);
		System.out.println();
		for(Diretor d : faculdade.listaDiretores) {
			System.out.println("Nome do diretor:         " + d.getName());
			System.out.println("Id do diretor:           " + d.getId());
			System.out.println();
		}
		System.out.println();
	}
	
	public Diretor findDiretor(Integer id, Faculdade faculdade) {
		Diretor findDiretor = new Diretor();
		for(Diretor d : faculdade.listaDiretores) {
			if(d.getId() == id) {
				findDiretor = d;
			}
		}
		return findDiretor;
	}
	
	public void addProfessor(Professor professor) {
		listaProfessores.add(professor);
	}
	
	public void removeProfessor(Professor professor) {
		listaProfessores.remove(professor);
	}
	
	public void listarProfessores(Faculdade faculdade) {
		System.out.println("\nLista de professores da faculdade " + faculdade.name);
		System.out.println();
		for(Professor p : faculdade.listaProfessores) {
			System.out.println("Nome:                    " + p.getName());
			System.out.println("Id:                      " + p.getId());
			System.out.println();
		}
		System.out.println();
	}
	
	public Professor findProfessor(Integer id, Faculdade faculdade) {
		Professor findProfessor = new Professor();
		for(Professor p : faculdade.listaProfessores) {
			if(p.getId() == id) {
				findProfessor = p;
			}
		}
		return findProfessor;
	}
	
	public void listarContasBancarias(Faculdade faculdade) {
		System.out.println("\nDados das contas bancárias da faculdade " + faculdade.name);
		System.out.println();
		if(faculdade.listaContaC.isEmpty() == true) {
			System.out.println("\nNăo há contas corrente cadastradas para a faculdade!!!!!!!!!!!! " + faculdade.name);
		}
		
		else {
			System.out.println("\nLista das contas corrente: \n");
			for(ContaCorrente cc : faculdade.listaContaC) {
				System.out.println("Conta corrente nş:        " + cc.getId());
				System.out.println("Nome titular da conta:    " + faculdade.name);
				System.out.println();
			}
			System.out.println();
		}
		
		if(faculdade.listaContaP.isEmpty() == true) {
			System.out.println("\nNăo há contas poupança cadastradas para a faculdade!!!!!!!!!!!!! " + faculdade.name);
		}
		else { 
			System.out.println("\nLista das contas poupança: \n");
			for(ContaPoupanca cp : faculdade.listaContaP) {
				System.out.println("Conta corrente nş:        " + cp.getId());
				System.out.println("Nome titular da conta:    " + faculdade.name);
				System.out.println();
			}
			System.out.println("\n");
		}
	}

	public void listarDadosFaculdade(Faculdade faculdade) {
		System.out.println("\nDados da empresa: Faculdade " + faculdade.name);
		System.out.println();
		System.out.println("Nome da faculdade:       " + faculdade.name);
		System.out.println("CNPJ:                    " + faculdade.cpf_cnpj);
		System.out.println("Id da faculdade:         " + faculdade.id);
		System.out.println();
	}

	@Override
	public boolean pessoaJuridica() {
		return true;
	}
}
