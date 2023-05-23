//Crear clase Persona.

//Crear variables las privadas edad, nombre y telefono de la clase Persona.

//Crear gets y sets de cada propiedad.

//Crear un objeto persona en el main.

//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.

package tema8openbootcamp;

public class Persona {
	  private int edad;
	  private String nombre;
	  private String telefono;

	  public int getEdad() {
	      return edad;
	  }
	  public void setEdad(int edad) {
	      this.edad = edad;
	  }

	  public String getNombre() {
	      return nombre;
	  }
	  public void setNombre(String nombre) {
	      this.nombre = nombre;
	  }

	  public String getTelefono() {
	      return telefono;
	  }
	  public void setTelefono(String telefono) {
	      this.telefono = telefono;
	  }
	

public static void main(String[] args) {
	  Persona persona1 = new Persona();
	  persona1.setEdad(25);
	  persona1.setNombre("Juan");
	  persona1.setTelefono("555-555-5555");

	  System.out.println("Nombre: " + persona1.getNombre() + ", Edad: " + persona1.getEdad() + ", Telefono: " + persona1.getTelefono());
	}
}