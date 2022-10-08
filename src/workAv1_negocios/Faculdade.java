package workAv1_negocios;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.Curso;
import workAv1_recursosHumanos.Coordenador;
import workAv1_recursosHumanos.Professor;
import workAv1_recursosHumanos.SecAcademica;
import workAv1_recursosHumanos.SecFinanceira;

public class Faculdade extends Empresa {
	
	private Integer idDiretor;
	private Set<Curso> listaCursos = new HashSet<Curso>();
	private Set<Coordenador> listaCoordenadores = new HashSet<Coordenador>();
	private Set<SecAcademica> listaSecAcademicas = new HashSet<SecAcademica>();
	private Set<SecFinanceira> listaSecFinanceiras = new HashSet<SecFinanceira>();
	private Set<Professor> listaProfessores = new HashSet<Professor>();
	
	public Faculdade() {
		
	}
	
	public Faculdade(Integer id, String name, String cnpj, Integer idDiretor) {
		super(id, name, cnpj);
		this.idDiretor = idDiretor;
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
	
	public void listarCursos() {
		System.out.println("\nLista de cursos disponíveis: \n");
		for(Curso c : listaCursos) {
			System.out.println("Nome do curso:  " + c.getName());
			System.out.println("Id do curso:    " + c.getId());
		}
		System.out.println();
	}
	
	public Curso findCurso(Integer id) {
		Curso curso = new Curso();
		for(Curso c : listaCursos) {
			if(c.getId() == id) {
				curso = c;
			}
		}
		return curso;
	}
	
	public void addListaCoordenador(Coordenador coordenador) {
		listaCoordenadores.add(coordenador);
	}
	
	public void removeListaCoordenador(Coordenador coordenador) {
		listaCoordenadores.remove(coordenador);
	}
	
	public void listarCoordenadores() {
		System.out.println("Lista de coordenadores: \n");
		for(Coordenador c : listaCoordenadores) {
			System.out.println("Nome:    " + c.getName());
			System.out.println("Id:      " + c.getId());
		}
		System.out.println();
	}
	
	public Coordenador findCoordenador(Integer id) {
		Coordenador findCoordenador = new Coordenador();
		for(Coordenador c : listaCoordenadores) {
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
	
	public void listarSecAcademicas() {
		System.out.println("Lista de secretários(as) academicos(as): \n");
		for(SecAcademica sec : listaSecAcademicas) {
			System.out.println("Nome:        " + sec.getName());
			System.out.println("Id:          " + sec.getId());
		}
		System.out.println();
	}
	
	public SecAcademica findSecAcademica(Integer id) {
		SecAcademica findSec = new SecAcademica();
		for(SecAcademica sec : listaSecAcademicas) {
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
	
	public void listarSecFinanceiras() {
		System.out.println("Lista de secretários(as) financeiros(as): \n");
		for(SecFinanceira sec : listaSecFinanceiras) {
			System.out.println("Nome:      " + sec.getName());
			System.out.println("Id:        " + sec.getId());
		}
		System.out.println();
	}
	
	public SecFinanceira findSecFinanceira(Integer id) {
		SecFinanceira findSec = new SecFinanceira();
		for(SecFinanceira sec : listaSecFinanceiras) {
			if(sec.getId() == id) {
				findSec = sec;
			}
		}
		return findSec;
	}
	
	public void addProfessor(Professor professor) {
		listaProfessores.add(professor);
	}
	
	public void removeProfessor(Professor professor) {
		listaProfessores.remove(professor);
	}
	
	public void listarProfessores() {
		System.out.println("Lista de professores: \n");
		for(Professor p : listaProfessores) {
			System.out.println("Nome:    " + p.getName());
			System.out.println("Id:      " + p.getId());
		}
		System.out.println();
	}
	
	public Professor findProfessor(Integer id) {
		Professor findProfessor = new Professor();
		for(Professor p : listaProfessores) {
			if(p.getId() == id) {
				findProfessor = p;
			}
		}
		return findProfessor;
	}

	@Override
	public boolean pessoaJuridica() {
		return true;
	}
	
	public void printDadosFaculdade() {
		System.out.println("Faculdade:       " + getName());
		System.out.println("CNPJ:            " + getCnpj());
		System.out.println("Id da faculdade: " + getId());
		System.out.println();
	}
}
