package workAv1_recursosHumanos;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {
	
		List<Pessoa> fila = new ArrayList<Pessoa>();
	
	public Fila() {
		
	}
	
	public List<Pessoa> getFila(){
		return fila;
	}
	
	public void addFila(Pessoa p) {
		fila.add(p);
	}
	
	public void removeFila(Pessoa p) {
			fila.remove(p); 
	}
	
	/*
	 * public void atualizarFila(List<Pessoa> list) { fila.addAll(list); }
	 */
	
	/*
	 * public List<Pessoa> findListaAlunosProfessor(Professor professor){
	 * List<Pessoa> findList = new ArrayList<Pessoa>(); for(Pessoa p :
	 * professor.getFilaAlunos().fila) { findList.add(p); }
	 * 
	 * return findList; }
	 */
	
	public void listarFilaProfessor(Professor professor) {
		for(Pessoa p : professor.getFilaAlunos().fila) {
			System.out.println();
			System.out.println("Nome da pessoa: " + p.name);
			System.out.println("Posição da pessoa na fila: " + professor.getFilaAlunos().fila.indexOf(p));
			System.out.println();
		}
	}
	
	/*
	 * public List<Pessoa> findListaAlunosCoordenador(Coordenador coordenador){
	 * List<Pessoa> findList = new ArrayList<Pessoa>();
	 * 
	 * for(Pessoa p : coordenador.getFilaAlunos().fila) { findList.add(p); }
	 * 
	 * return findList; }
	 */

	public void listarFilaCoordenadorA(Coordenador coordenador) {
		for(Pessoa p : coordenador.getFilaAlunos().fila) {
			System.out.println();
			System.out.println("Nome da pessoa: " + p.name);
			System.out.println("Posição da pessoa na fila: " + coordenador.getFilaAlunos().fila.indexOf(p));
			System.out.println();
		}
	}
	
	/*
	 * public List<Pessoa> findListaProfessoresCoordenador(Coordenador coordenador){
	 * List<Pessoa> findList = new ArrayList<Pessoa>();
	 * 
	 * for(Pessoa p : coordenador.getFilaProfessores().fila) { findList.add(p); }
	 * 
	 * return findList; }
	 */
	
	public void listarFilaCoordenadorP(Coordenador coordenador) {
		for(Pessoa p : coordenador.getFilaProfessores().fila) {
			System.out.println();
			System.out.println("Nome da pessoa: " + p.name);
			System.out.println("Posição da pessoa na fila: " + coordenador.getFilaProfessores().fila.indexOf(p));
			System.out.println();
		}
	}
	
	/*
	 * public List<Pessoa> findListPessoasSecAcademica(SecAcademica sec){
	 * List<Pessoa> findList = new ArrayList<Pessoa>();
	 * 
	 * for(Pessoa p : sec.getFilaAlunos().fila) { findList.add(p); }
	 * 
	 * return findList; }
	 */
	
	public void listarFilaSecAcademica(SecAcademica sec) {
		for(Pessoa p : sec.getFilaAlunos().fila) {
			System.out.println();
			System.out.println("Nome da pessoa: " + p.name);
			System.out.println("Posição da pessoa na fila: " + sec.getFilaAlunos().fila.indexOf(p));
			System.out.println();
		}
	}
	
	/*
	 * public List<Pessoa> findListPessoasSecFinancira(SecFinanceira sec){
	 * List<Pessoa> findList = new ArrayList<Pessoa>();
	 * 
	 * for(Pessoa p : sec.getFilaPessoas().fila) { findList.add(p); }
	 * 
	 * return findList; }
	 */
	
	public void listarFilaSecFinanceira(SecFinanceira sec) {
		for(Pessoa p : sec.getFilaPessoas().fila) {
			System.out.println();
			System.out.println("Nome da pessoa: " + p.name);
			System.out.println("Posição da pessoa na fila: " + sec.getFilaPessoas().fila.indexOf(p));
			System.out.println();
		}
	}
	
	public List<Pessoa> findListPessoasGrente(Gerente gerente){
		List<Pessoa> findList = new ArrayList<Pessoa>();
		
		for(Pessoa p : gerente.getFilaPessoas().fila) {
			findList.add(p);
		}
		
		return findList;
	}
	
	public void listarFilaGerente(Gerente gerente) {
		for(Pessoa p : gerente.getFilaPessoas().fila) {
			System.out.println();
			System.out.println("Nome da pessoa: " + p.name);
			System.out.println("Posição da pessoa na fila: " + gerente.getFilaPessoas().fila.indexOf(p));
			System.out.println();
		}
	}
	
	/*
	 * public List<Pessoa> findListPessoasDiretor(Diretor diretor){ List<Pessoa>
	 * findList = new ArrayList<Pessoa>();
	 * 
	 * for(Pessoa p : diretor.getFilaPessoas().fila) { findList.add(p); }
	 * 
	 * return findList; }
	 */
	
	public void listarFilaDiretor(Diretor diretor) {
		for(Pessoa p : diretor.getFilaCoordenadores().fila) {
			System.out.println();
			System.out.println("Nome da pessoa: " + p.name);
			System.out.println("Posição da pessoa na fila: " + diretor.getFilaCoordenadores().fila.indexOf(p));
			System.out.println();
		}
	}
	
	/*
	 * public void listarFila(List<? extends Pessoa> list) { for(Pessoa p : list) {
	 * System.out.println(); System.out.println("Nome da pessoa: " + p.name);
	 * System.out.println("Posição da pessoa na fila: " + list.indexOf(p));
	 * System.out.println(); } }
	 */
	
}
