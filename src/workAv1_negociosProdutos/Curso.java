package workAv1_negociosProdutos;

import java.util.HashSet;
import java.util.Set;

public class Curso {
	
	private Integer id;
	private String name;
	private Integer idCoordenador;
	private Set<Object> disciplinas = new HashSet<Object>();
	
	public Curso() {
		
	}
		
	public Curso(Integer id, String name, Integer idCoordenador) {
		super();
		this.id = id;
		this.name = name;
		this.idCoordenador = idCoordenador;
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

	public Integer getIdCoordenador() {
		return idCoordenador;
	}

	public void setIdCoordenador(Integer idCoordenador) {
		this.idCoordenador = idCoordenador;
	}
	
	public void addDisciplina(Object disciplina) {
		disciplinas.add(disciplina);
	}
	
	public void removeDisciplina(Object disciplina) {
		disciplinas.add(disciplina);
	}
	
	public void listarDisciplinas() {
		System.out.println("Disciplinas que compõem o curso " + this.name);
		disciplinas.forEach(d -> System.out.println(d.toString()));
	}

}
