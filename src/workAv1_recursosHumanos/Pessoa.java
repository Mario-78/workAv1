package workAv1_recursosHumanos;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.Conta;

public abstract class Pessoa {
	
	private Integer id;
	private String name;
	private String cpf;
	private Set<Conta> conta = new HashSet<Conta>();
	
	public Pessoa(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
