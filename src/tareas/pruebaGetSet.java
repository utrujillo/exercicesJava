package tareas;

public class pruebaGetSet {

	public static void main(String[] args) {
		getset gs = new getset();
		
		System.out.println("Valor: "+ gs.getPerimetro());
		gs.setPerimetro(100);
		System.out.println("Valor: "+ gs.getPerimetro());
		
		gs.getSaludo();
		gs.setSaludo("Otro parametro desde la clase padre");
		gs.getSaludo();

	}

}
