package exceptions;

public class ErroOpcaoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	Integer limiteInf;
	Integer limiteSup;

	public ErroOpcaoException() {
		super();
		
	}

	public ErroOpcaoException(Integer li, Integer ls)  {
		
		limiteInf = li;
		limiteSup = ls;
		
		System.out.println("Op��o inv�lida!!!!!!"
				+ "\nMenor valor suportado: " + li
				+ "\nMaior valor suportado: " + ls);

	}	
	
	

}
