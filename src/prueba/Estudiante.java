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

	
}
