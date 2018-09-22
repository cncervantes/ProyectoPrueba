/**
 * 
 */
package prueba;

/**
 * @author cervantesac
 *
 */
public class Funcionario extends Persona {

	private String area;
	private String cargo;
	/**
	 * 
	 */
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param apellido
	 */
	public Funcionario(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
