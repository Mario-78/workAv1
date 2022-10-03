package workAv1_negociosProdutos;

import java.util.HashSet;
import java.util.Set;

public class Curso {
	
	private Integer id;
	private Integer idCoordenador;
	private Set<Disciplina> disciplinas = new HashSet<Disciplina>();
		
	public Curso(Integer id, Integer idCoordenador) {
		super();
		this.id = id;
		this.idCoordenador = idCoordenador;
	}
	
	

}
