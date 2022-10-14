package exceptions;

public class SaldoInsuficienteException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException() {
		
	}
	
	public SaldoInsuficienteException(Double saldo, Double valor) {
		System.out.println("Saldo insuficiente!!!");
		System.out.println("Saldo atual: " + saldo);
		System.out.println("Para efetuar esta operação seu saldo tem que ser maior que : " + (saldo - valor));
	}

}
