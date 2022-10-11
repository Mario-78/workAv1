package workAv1_recursosHumanos;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {
	
	T obj;
	
	List<T> fila = new ArrayList<T>();
	
	public Fila() {
		
	}
	
	public Fila(T obj) {
		
	}
	
	public void addFila(T obj) {
		fila.add(obj);
	}
	
	public void removeFila(T obj) {
		fila.remove(obj);
	}

}
