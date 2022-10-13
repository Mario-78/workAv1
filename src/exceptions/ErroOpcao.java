package exceptions;

public class ErroOpcao extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private int codErro;
	
	Integer menor;
	public ErroOpcao() {
		super();
		
	}

	public ErroOpcao(String message, int codErro) {
		super(message);
		this.codErro = codErro;
	}	
	
	

}
