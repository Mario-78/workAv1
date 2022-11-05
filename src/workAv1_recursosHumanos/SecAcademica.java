package workAv1_recursosHumanos;

import workAv1_negociosProdutos.ContaCorrente;
import workAv1_negociosProdutos.ContaPoupanca;

public class SecAcademica extends Funcionario {
	
	private Fila<Pessoa> filaAlunos = new Fila<Pessoa>();
	
	public SecAcademica() {
		
	}

	public SecAcademica(Integer id, String name, String cpf, String funcao) {
		super(id, name, cpf, funcao);
	}
	
	public Fila<Pessoa> getFilaAlunos(){
		return filaAlunos;
	}
	
	public void listarDadosSecAcademica(SecAcademica sec) {
		System.out.println("\nDados pessoais do secret�rio(a) academico(a)");
		System.out.println("\nNome:                     " + sec.name);
		System.out.println("\nId:                       " + sec.id);
		System.out.println("\nCPF:                      " + sec.cpf_cnpj);
		System.out.println();
	}
	
	public void listarContasSecAcad(SecAcademica sec) {
		System.out.println("\nDados financeiros do secret�rio(a) academico(a)");
		for(ContaCorrente cc : sec.listaContaC) {
			System.out.println("Nome do titular:      " + sec.name);
			System.out.println("Conta corrente n�     " + cc.getId());
		}
		for(ContaPoupanca cp : sec.listaContaP) {
			System.out.println("Nome do titular:      " + sec.name);
			System.out.println("Conta corrente n�     " + cp.getId());
		}
		System.out.println();
	}

	@Override
	public boolean pessoaFisica() {
		return true;
	}

	@Override
	public boolean diretoria() {
		return false;
	}

	@Override
	public boolean secretaria() {
		return true;
	}
	
}
