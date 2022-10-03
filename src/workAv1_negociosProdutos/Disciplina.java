package workAv1_negociosProdutos;

import java.util.HashSet;
import java.util.Set;

import workAv1_recursosHumanos.Aluno;

public class Disciplina {
	
	private Integer id;
	private Integer idProfessor;
	private Set<Aluno> alunos = new HashSet<Aluno>();
	
	public Disciplina(Integer id, Integer idProfessor) {
		super();
		this.id = id;
		this.idProfessor = idProfessor;
	}	

}
