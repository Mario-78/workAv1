package workAv1_negocios;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.Curso;
import workAv1_recursosHumanos.Coordenador;
import workAv1_recursosHumanos.SecAcademica;
import workAv1_recursosHumanos.SecFinanceira;

public class Faculdade extends Empresa {
	
	private Integer idDiretor;
	private Set<Curso> listaCursos = new HashSet<Curso>();
	private Set<Coordenador> listaCoordenadores = new HashSet<Coordenador>();
	private Set<SecAcademica> listaSecAcademicas = new HashSet<SecAcademica>();
	private Set<SecFinanceira> listaSecFinanceiras = new HashSet<SecFinanceira>();
	
	public Faculdade() {
		
	}
	
	public Faculdade(Integer id, String name, String cnpj, Integer idDiretor) {
		super(id, name, cnpj);
		this.idDiretor = idDiretor;
	}	

	public Integer getIdDiretor() {
		return idDiretor;
	}

	public void setIdDiretor(Integer idDiretor) {
		this.idDiretor = idDiretor;
	}
	
	public void addListaCurso(Curso curso) {
		listaCursos.add(curso);
	}
	
	public void removeListaCurso(Curso curso) {
		listaCursos.remove(curso);
	}
	
	public void listarCursos() {
		System.out.println("Cursos disponíveis: ");
		listaCursos.forEach(c -> System.out.println(c.toString()));
	}
	
	public void addListaCoordenador(Coordenador coordenador) {
		listaCoordenadores.add(coordenador);
	}
	
	public void removeListaCoordenador(Coordenador coordenador) {
		listaCoordenadores.remove(coordenador);
	}
	
	public void listarCoordenadores() {
		System.out.println("Lista de coordenadores: ");
		listaCoordenadores.forEach(c -> System.out.println(c.toString()));
	}
	
	public void addListaSecAcademica(SecAcademica sec) {
		listaSecAcademicas.add(sec);
	}
	
	public void removeSecAcademica(SecAcademica sec) {
		listaSecAcademicas.remove(sec);
	}
	
	public void listarSecAcademicas() {
		System.out.println("Lista de secretários(as) academicos(as): ");
		listaSecAcademicas.forEach(s -> System.out.println(s.toString()));
	}
	
	public void addSecFinanceira(SecFinanceira sec) {
		listaSecFinanceiras.add(sec);
	}
	
	public void removeSecFinanceira(SecFinanceira sec) {
		listaSecFinanceiras.remove(sec);
	}
	
	public void listarSecFinanceiras() {
		System.out.println("Lista de secretários(as) financeiros(as): ");
		listaSecFinanceiras.forEach(s -> System.out.println(s.toString()));
	}

	@Override
	public boolean pessoaJuridica() {
		return true;
	}

}
