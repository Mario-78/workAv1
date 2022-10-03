package workAv1_negocios;

import java.util.HashSet;
import java.util.Set;

import workAv1_negociosProdutos.Curso;
import workAv1_recursosHumanos.Coordenador;
import workAv1_recursosHumanos.SecAcademica;
import workAv1_recursosHumanos.SecFinanceira;

public class Faculdade extends Empresa implements PessoaJuridica{
	
	private Integer idDiretor;
	private Set<Curso> cursos = new HashSet<Curso>();
	private Set<Coordenador> coordenadores = new HashSet<Coordenador>();
	private Set<SecAcademica> secAcademicas = new HashSet<SecAcademica>();
	private Set<SecFinanceira> secFinanceiras = new HashSet<SecFinanceira>();
	
	
	
	public Faculdade(Integer id, String name, Integer idDiretor) {
		super(id, name);
		this.idDiretor = idDiretor;
	}



	@Override
	public void cadCnpj() {
		// TODO Auto-generated method stub
		
	}	

}
