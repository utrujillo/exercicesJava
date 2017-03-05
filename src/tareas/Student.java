package tareas;

public class Student {
	private Integer matricula = null;
	private String nombre = null;
	private String direccion = null;
	private String telefono = null;
	private String rfc = null;
	
	public Student(Integer matricula, String nombre, String direccion, String telefono, String rfc) {
		this.matricula = matricula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.rfc = rfc;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getRFC() {
		return rfc;
	}
	
	
}
