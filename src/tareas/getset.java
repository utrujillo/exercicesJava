package tareas;

public class getset {
	private Integer perimetro;
	private String saludo = "Hola Mundo";
	public String mensaje = "Haciendo tarea";
	
	public Integer getPerimetro(){
		return this.perimetro;
	}
	
	public Integer setPerimetro(Integer valor){
		return this.perimetro = valor;
	}
	
	public void getSaludo(){
		System.out.println(this.saludo);
	}
	
	public void setSaludo(String cadena){
		this.saludo = cadena;
	}
	
}
