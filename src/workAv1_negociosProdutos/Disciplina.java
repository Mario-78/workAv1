package workAv1_negociosProdutos;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {
	
	private Integer id;
	private String name;
	private Integer idProfessor;
	private Set<Object> listaAlunos = new HashSet<Object>();
	
	public Disciplina() {
		
	}
	
	public Disciplina(Integer id, String name, Integer idProfessor) {
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

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}	
	
	public void addListaAluno(Object aluno) {
		listaAlunos.add(aluno);
	}
	
	public void removeListaAluno(Object aluno) {
		listaAlunos.remove(aluno);
	}
	
	public void listarAlunos() {
		System.out.println("Lista de alunos matriculados na disciplina " + this.name);
		listaAlunos.forEach(a -> System.out.println(a.toString()));
	}

}
