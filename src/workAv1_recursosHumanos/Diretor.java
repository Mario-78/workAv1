package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

public class Diretor extends Funcionario {
	
	private Set<Object> filaCoordenadores = new HashSet<Object>();	
	
	public Diretor() {
		
	}
	
	public Diretor(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);
	}
	
	public void addFilaCoordenadores(Object coordenador) {
		filaCoordenadores.add(coordenador);
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}

	@Override
	public boolean diretoria() {
		return true;
	}

	@Override
	public boolean secretaria() {
		return false;
	}

	
}
