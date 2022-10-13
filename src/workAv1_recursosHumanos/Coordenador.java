package workAv1_recursosHumanos;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class Coordenador extends Funcionario {
	
	private Fila<Aluno> filaAlunos = new Fila<Aluno>();
	private Fila<Professor> filaProfessores = new Fila<Professor>();
	
	public Coordenador() {
		
	}

	public Coordenador(Integer id, String name, String cpf, String função) {
		super(id, name, cpf, função);
	}
	
	public Fila<Aluno> getFilaAlunos(){
		return filaAlunos;
	}
	
	public Fila<Professor> getFilaProfessores(){
		return filaProfessores;
	}
	
	public void listarDadosCoordenador(Coordenador coordenador) {
		System.out.println("Dados do coordenador: \n");
		System.out.println("Nome:      " + coordenador.name);
		System.out.println("Id:        " + coordenador.id);
		System.out.println("CPF:       " + coordenador.cpf_cnpj);
		System.out.println();
	}
	
	public void listarContasCoordenador(Coordenador coordenador) {
		System.out.println("Dados financeiros do coordenador: \n");
		for(ContaCorrente cc : coordenador.listaContaC) {
			System.out.println("Nome do titular:      " + coordenador.name);
			System.out.println("Conta corrente nº     " + cc.getId());
		}
		for(ContaPoupanca cp : coordenador.listaContaP) {
			System.out.println("Nome do titular:      " + coordenador.name);
			System.out.println("Conta corrente nº     " + cp.getId());
		}
	}
	
	@Override
	public boolean secretaria() {
		return false;
	}

	@Override
	public boolean diretoria() {
		return true;
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}	

}
