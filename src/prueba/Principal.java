/**
 * 
 */
package prueba;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author cervantesac
 *
 */
public class Principal {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Persona persona1 = new Persona("César Augusto", "Cervantes Camargo");
		Persona persona2 = new Persona("Jhonatan Alberto", "Consuegra Lara");
		Persona persona3 = new Persona("William Alberto", "Pareja Navarro");
		Persona persona4 = new Persona("Victor Manuel", "Peralta Martinez");
		
		LinkedList<Persona> listPersonas = new LinkedList<Persona>();
		listPersonas.add(persona1);
		listPersonas.add(persona2);
		listPersonas.add(persona3);
		listPersonas.add(persona4);
		System.out.println("-----------------------------------------------------------");
		System.out.println("Listado de personas - Ingresar Información");
		System.out.println("-----------------------------------------------------------");	
		Scanner sc = new Scanner(System.in);
		for (Persona persona : listPersonas) {
			System.out.println(persona.getNombreCompleto());
			System.out.print("Digite dirección: ");
			String direccion = sc.nextLine();
			persona.setDireccion(direccion);
			System.out.print("Digite teléfono: ");
			String telefono = sc.nextLine();
			persona.setTelefono(telefono);
			System.out.print("Digite correo: ");
			String correo = sc.nextLine();
			persona.setCorreo(correo);			
			
		}	
		sc.close();
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Listado de personas");
		System.out.println("-----------------------------------------------------------");	
		for (Persona persona : listPersonas) {
			System.out.println(persona.getNombreCompleto()+" "+persona.getDireccion()			
			+" "+persona.getTelefono()
			+" "+persona.getCorreo());		
			
		}		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println(persona1.getNombreCompleto()+" "+persona1.getDireccion()+" "+persona1.getTelefono()+" "+persona1.getCorreo());	
		System.out.println(persona2.getNombreCompleto()+" "+persona2.getDireccion()+" "+persona2.getTelefono()+" "+persona2.getCorreo());		
		System.out.println(persona3.getNombreCompleto()+" "+persona3.getDireccion()+" "+persona3.getTelefono()+" "+persona3.getCorreo());		
		System.out.println(persona4.getNombreCompleto()+" "+persona4.getDireccion()+" "+persona4.getTelefono()+" "+persona4.getCorreo());		
		
		Funcionario funcionario1 = new Funcionario("David", "Velasquez");
		funcionario1.setCargo("Ingeniero");
		funcionario1.setArea("DTIC");
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println(funcionario1.getNombreCompleto()+" "+funcionario1.getCargo()+" "+funcionario1.getArea());
		
		Estudiante estudiante1 = new Estudiante("Orlando", "Martinez");
		LinkedList<String>  listProgramas = new LinkedList<String>();
		listProgramas.add("Negocios Internacional");
		listProgramas.add("Finanzas");
		listProgramas.add("Educación");
		estudiante1.setProgramas(listProgramas);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println(estudiante1.getNombreCompleto()+" "+estudiante1.getListaProgramas());
		
		
	}

}
