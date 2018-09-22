/**
 * 
 */
package prueba;

import java.util.LinkedList;

/**
 * @author cervantesac
 *
 */
public class Estudiante extends Persona {
	LinkedList<String> programas;
	
	public Estudiante(String nombre,String appelido) {
		super(nombre, appelido);
		this.programas = new LinkedList<String>();
	}

	public void setProgramas(LinkedList<String> programas) {
		this.programas = programas;
	}
	
	public String getListaProgramas() {
		String salida = "{ ";
		int i = 1;
		for (String string : programas) {
			if(i != programas.size())
				salida = salida + string+ ", " ;
			else
				salida = salida + string;
			i++;
		}
		salida = salida + " }";
		return salida;
	}

	
}
