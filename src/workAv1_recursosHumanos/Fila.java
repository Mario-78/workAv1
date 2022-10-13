package workAv1_recursosHumanos;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {
	
	T obj;
	List<Pessoa> fila = new ArrayList<Pessoa>();
	
	public Fila() {
		
	}
	
	public Fila(T obj) {
		this.obj = obj;
		
	}
	
	public void addFila(Pessoa p) {
		fila.add(p);
	}
	
	public void removeFila(Pessoa p) {
		if(fila.indexOf(p) == 0) {
			fila.remove(p); 
		}
	}
	
	public void atualizarFila(List<Pessoa> list) {
		fila.addAll(list);
	}
	
	public List<Pessoa> findListaAlunosProfessor(Professor professor){
		List<Pessoa> findList = new ArrayList<Pessoa>();		
		for(Pessoa p : professor.getFilaAlunos().fila) {
			findList.add(p);
		}
		
		return findList;
	}
	
	public List<Pessoa> findListaAlunosCoordenador(Coordenador coordenador){
		List<Pessoa> findList = new ArrayList<Pessoa>();
		
		for(Pessoa p : coordenador.getFilaAlunos().fila) {
			findList.add(p);
		}
		
		return findList;
	}
	
	public List<Pessoa> findListaProfessoresCoordenador(Coordenador coordenador){
		List<Pessoa> findList = new ArrayList<Pessoa>();
		
		for(Pessoa p : coordenador.getFilaProfessores().fila) {
			findList.add(p);
		}
		
		return findList;
	}
	
	public List<Pessoa> findListPessoasSecFinancira(SecFinanceira sec){
		List<Pessoa> findList = new ArrayList<Pessoa>();
		
		for(Pessoa p : sec.getFilaPessoas().fila) {
			findList.add(p);
		}
		
		return findList;
	}
	
	public List<Pessoa> findListPessoasGrente(Gerente gerente){
		List<Pessoa> findList = new ArrayList<Pessoa>();
		
		for(Pessoa p : gerente.getFilaPessoas().fila) {
			findList.add(p);
		}
		
		return findList;
	}
	
	public List<Pessoa> findListPessoasDiretor(Diretor diretor){
		List<Pessoa> findList = new ArrayList<Pessoa>();
		
		for(Pessoa p : diretor.getFilaPessoas().fila) {
			findList.add(p);
		}
		
		return findList;		
	}
	
	public void listarFila(List<? extends Pessoa> list) {
		for(Pessoa p : list) {
			System.out.println();
			System.out.println("Nome da pessoa: " + p.name);
			System.out.println("Posição da pessoa na fila: " + list.indexOf(p));
			System.out.println();
		}
	}
		//System.out.println("Lista de alunos aguardando atendimento: \n");
		//for(Pessoa aluno : professor.getFila().fila) {
			//System.out.println("Nome do aluno:              " + aluno.name);
			//System.out.println("Posição do aluno na fila:   " + professor.getFila().fila.indexOf(aluno));
		//}
	//}

}
