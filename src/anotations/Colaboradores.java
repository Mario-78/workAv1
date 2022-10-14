package anotations;

public @interface Colaboradores {
	
	String[] colaboradores() default " ";
	String versao();
	
}
