package workAv1_negociosProdutos;

import exceptions.SaldoInsuficienteException;

public interface Conta {
	
	public void deposito(Double valor);
	public void saque(Double valor) throws SaldoInsuficienteException;
	public void saldo();

}
