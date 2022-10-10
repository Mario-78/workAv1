package workAv1_negocios;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;
import workAv1_negociosProdutos.Curso;
import workAv1_negociosProdutos.Disciplina;
import workAv1_recursosHumanos.Coordenador;
import workAv1_recursosHumanos.Diretor;
import workAv1_recursosHumanos.Professor;
import workAv1_recursosHumanos.SecAcademica;
import workAv1_recursosHumanos.SecFinanceira;

public class Faculdade extends Empresa {
	
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
		System.out.println("\nLista de cursos disponíveis: \n");
		for(Curso c : faculdade.listaCursos) {
			System.out.println("Nome do curso:  " + c.getName());
			System.out.println("Id do curso:    " + c.getId());
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
		System.out.println("\nLista de disciplinas: \n");
		for(Disciplina d : faculdade.listaDisciplinas) {
			System.out.println("Nome da disciplina:      " + d.getName());
			System.out.println("Id da disciplina:        \n" + d.getId());			
		}
	}
	
	public void addListaCoordenador(Coordenador coordenador) {
		listaCoordenadores.add(coordenador);
	}
	
	public void removeListaCoordenador(Coordenador coordenador) {
		listaCoordenadores.remove(coordenador);
	}
	
	public void listarCoordenadores(Faculdade faculdade) {
		System.out.println("\nLista de coordenadores: ");
		for(Coordenador c : faculdade.listaCoordenadores) {
			System.out.println("Nome:    " + c.getName());
			System.out.println("Id:      " + c.getId());
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
		System.out.println("Lista de secretários(as) academicos(as): \n");
		for(SecAcademica sec : faculdade.listaSecAcademicas) {
			System.out.println("Nome:        " + sec.getName());
			System.out.println("Id:          " + sec.getId());
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
		System.out.println("Lista de secretários(as) financeiros(as): \n");
		for(SecFinanceira sec : faculdade.listaSecFinanceiras) {
			System.out.println("Nome:      " + sec.getName());
			System.out.println("Id:        " + sec.getId());
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
	
	public void addDiretor(Diretor diretor) {
		listaDiretores.add(diretor);
	}
	
	public void removeDiretor(Diretor diretor) {
		listaDiretores.remove(diretor);
	}
	
	public void listarDiretores(Faculdade faculdade) {
		for(Diretor d : faculdade.listaDiretores) {
			System.out.println("\nNome do diretor:         " + d.getName());
			System.out.println("\nId do diretor:           " + d.getId());
			System.out.println("\nNome da faculdade:       " + faculdade.name);
			System.out.println("\nCNPJ:                    " + faculdade.cpf_cnpj);
			System.out.println("\nId da faculdade:         " + faculdade.id);
		}
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
	
	public void listarDadosDiretor(Diretor diretor) {
		System.out.println("\nNome do diretor:         " + diretor.getName());
		System.out.println("\nId do diretor:           " + diretor.getId());
	}
	
	public void addProfessor(Professor professor) {
		listaProfessores.add(professor);
	}
	
	public void removeProfessor(Professor professor) {
		listaProfessores.remove(professor);
	}
	
	public void listarProfessores(Faculdade faculdade) {
		System.out.println("\nLista de professores da faculdade " + faculdade.name);
		for(Professor p : faculdade.listaProfessores) {
			System.out.println("\nNome:                    " + p.getName());
			System.out.println("\nId:                      " + p.getId());
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
		System.out.println("Dados das contas bancárias da faculdade " + faculdade.name);
		for(ContaCorrente cc : faculdade.listaContaC) {
			System.out.println("\nConta corrente nº:        " + cc.getId());
			System.out.println("\nNome titular da conta:    " + faculdade.name);
		}
		for(ContaPoupanca cp : faculdade.listaContaP) {
			System.out.println("\nConta corrente nº:        " + cp.getId());
			System.out.println("\nNome titular da conta:    " + faculdade.name);
		}
		System.out.println();
	}

	@Override
	public boolean pessoaJuridica() {
		return true;
	}
	
	public void listarDadosFaculdade(Faculdade faculdade) {
		System.out.println("\nFaculdade:               " + faculdade.name);
		System.out.println("\nCNPJ:                    " + faculdade.cpf_cnpj);
		System.out.println("\nId da faculdade:         " + faculdade.id);
		System.out.println();
	}
}
