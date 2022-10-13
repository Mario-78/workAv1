package workAv1_negociosProdutos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private Integer id;
	private String name;
	private Integer idCoordenador;
	private Set<Disciplina > listaDisciplinas = new HashSet<Disciplina >();
	
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
	
	public Set<Disciplina> getDisciplina(){
		return listaDisciplinas;
	}
	
	public void addDisciplina(Disciplina  disciplina) {
		listaDisciplinas.add(disciplina);
	}
	
	public void removeDisciplina(Disciplina  disciplina) {
		listaDisciplinas.add(disciplina);
	}
	
	public void listarDisciplinas(Curso curso) {
		System.out.println("\nLista de disciplinas do curso: " + curso.name);
		System.out.println();
		for(Disciplina disc : curso.listaDisciplinas) {
			System.out.println("Nome:      " + disc.getName());
			System.out.println("Id:        " + disc.getId());
			System.out.println();
		}
		System.out.println();
	}
	
	public Disciplina findDisciplina(Integer idDisc, Curso curso) {
		Disciplina disciplina = new Disciplina();
		for(Disciplina d : curso.listaDisciplinas) {
			if(d.getId() == idDisc) {
				disciplina = d;
			}
		}
		return disciplina;
	}
		
}
