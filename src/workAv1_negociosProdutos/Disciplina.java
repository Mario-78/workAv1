package workAv1_negociosProdutos;

import java.util.HashSet;
import java.util.Set;

import workAv1_negocios.Faculdade;
import workAv1_recursosHumanos.Aluno;
import workAv1_recursosHumanos.Professor;

public class Disciplina {
	
	private Integer id;
	private Integer idCurso;
	private String name;
	private Integer idProfessor;
	private Set<Aluno> listaAlunos = new HashSet<Aluno>();
	
	public Disciplina() {
		
	}
	
	public Disciplina(Integer id, Integer idCurso, String name, Integer idProfessor) {
		this.id = id;
		this.name = name;
		this.idProfessor = idProfessor;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}	
	
	public void addListaAluno(Aluno aluno) {
		listaAlunos.add(aluno);
	}
	
	public void removeListaAluno(Aluno aluno) {
		listaAlunos.remove(aluno);
	}
	
	
	public void listarAlunos(Disciplina disciplina) {
		System.out.println("\nAlunos Matriculados: ");
		for(Aluno a : disciplina.listaAlunos) {
			System.out.println("\nNome do aluno:           " + a.getName());
			System.out.println("\nId do aluno:             " + a.getId());
		}
		System.out.println();
	}
	
	
	public Aluno findAluno(Integer id, Disciplina disciplina) {
		Aluno findAluno = new Aluno();
		for(Aluno aluno : disciplina.listaAlunos) {
			if(id == aluno.getId()) {
				findAluno = aluno;
			}
		}
		return findAluno;
	}
	
	public void listarDadosDiscilina(Disciplina d, Curso c, Professor p, Faculdade f) {
		System.out.println("\nDados da disciplina: ");
		System.out.println("\nNome da faculdade:       " + f.getName());
		System.out.println("\nNome do curso:           " + c.getName());
		System.out.println("\nNome da disciplina:      " + d.name);
		System.out.println("\nId da disciplina:        " + d.id);
		System.out.println("\nNome do professor:       " + p.getName());
	}

}
