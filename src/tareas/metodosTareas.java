package tareas;
import java.util.Scanner;

public class metodosTareas {
	private Scanner sc = new Scanner(System.in);
	public float centigrados;
	public float farenheit;
	public float valorDolar = 19.95f;
	public float valorEuro = 21.41f;
	public float valorYen = 0.17f;
	public float perimetro;
	public float PI = 3.1416f;
	
	// Metodos generales
	public void imprime(String valor){
		System.out.println(valor);
	}
	
	public void imprimel(String valor){
		System.out.print(valor);
	}
	
	public void limpiaPantalla(int lineas){
		for (int i = 0; i < lineas; i++) {
			this.imprime("");
		}
	}
	
	public void repeat(String tarea){
		String volver;
		this.imprime("Deseas realizar otra acción? S/N: ");
		volver = sc.next();

		if (volver.charAt(0) == 'S' || volver.charAt(0) == 's') {
			this.limpiaPantalla(10);
			switch (tarea) {
				case "t1": this.menu1(); break;
				case "t2": this.menu2(); break;
				case "t3": this.menu3(); break;
			}
		} else {
			this.imprime("Gracias por usar el sistema");
		}
	}
	
	// Metodos de tarea 1
	public void menu1(){
		Integer opcion = 0;
		this.imprime("Convertidor de Temperatura");
		this.imprime("Selecciona el numero de opcion que deseas realizar");
		this.imprime("1.- Centigrados -> Farenheith");
		this.imprime("2.- Farentheit -> Centigrados");
		
		
		try {
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				this.centigradosAFarenheit();
				break;
			case 2:
				this.farenheitACentigrados();
				break;
			default:
				this.imprime("Opcion no valida, favor de seleccionar una correcta");
				this.menu1();
				break;
			}
		} catch (Exception ex) {
			this.imprime("Error!! seleccionar solo numeros enteros, volver a ejecutar");
			
		}
	}
	
	public void centigradosAFarenheit(){
		this.imprimel("Grados centigrados: ");
		
		try {
			centigrados = sc.nextFloat();
			// Formula C = C * 1.8 + 32
			farenheit = (float) (centigrados * 1.8 + 32);
			imprime("Centigrados: "+ centigrados +" => Farenheit: "+ farenheit);
		} catch (Exception ex) {
			this.imprime("Error!! seleccionar solo numeros enteros, volver a ejecutar");
		}
		
		this.repeat("t1");
		
	}
	
	public void farenheitACentigrados(){
		this.imprime("Grados Farenheit: ");
		
		try {
			farenheit = sc.nextFloat();
			// Formula F = F - 32 / 1.8
			centigrados = (float) ((farenheit - 32)/1.8);
			imprime("Farenheit: "+ farenheit +" => Centigrados: "+ centigrados);
		} catch (Exception ex) {
			this.imprime("Error!! seleccionar solo numeros enteros, volver a ejecutar");
		}
		
		this.repeat("t1");
	}
	
	// Tarea 2
	public void menu2(){
		Integer opcion = 0;
		this.imprime("Convertidor de Monedas");
		this.imprime("Selecciona el numero de opcion que deseas realizar");
		this.imprime("Dolar: 19.95	 	Euro: 21.41 	 Yen: 0.1786 ");
		this.imprime("1.- Peso -> Dolar");
		this.imprime("2.- Peso -> Euro");
		this.imprime("3.- Peso -> Yen");
		this.imprime("4.- Dolar -> Peso");
		this.imprime("5.- Euro -> Peso");
		this.imprime("6.- Yen -> Peso");
		
		
		try {
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				this.conversorMoneda("peso->dolar");
				break;
			case 2:
				this.conversorMoneda("peso->euro");
				break;
			case 3:
				this.conversorMoneda("peso->yen");
				break;
			case 4:
				this.conversorMoneda("dolar->peso");
				break;
			case 5:
				this.conversorMoneda("euro->peso");
				break;
			case 6:
				this.conversorMoneda("yen->peso");
				break;
			default:
				this.imprime("Opcion no valida, favor de seleccionar una correcta");
				this.menu2();
				break;
			}
		} catch (Exception ex) {
			this.imprime("Error!! seleccionar solo numeros enteros, volver a ejecutar");
			
		}
	}
	
	public void conversorMoneda(String opcion){
		Float valorPrincipal = null, valorConvertido = null; 
		
		this.imprime("El proceso de conversion fue:"+ opcion);
		this.imprimel("Ingresa el monto a transformar: ");
		valorPrincipal = sc.nextFloat();
		switch (opcion) {
		case "peso->dolar":
			valorConvertido = valorPrincipal / valorDolar;
			break;
		case "peso->euro":
			valorConvertido = valorPrincipal / valorEuro;
			break;
		case "peso->yen":
			valorConvertido = valorPrincipal / valorYen;
			break;
		case "dolar->peso":
			valorConvertido = valorPrincipal * valorDolar;
			break;
		case "euro->peso":
			valorConvertido = valorPrincipal * valorEuro;
			break;
		case "yen->peso":
			valorConvertido = valorPrincipal * valorYen;
			break;
		}
		
		this.imprime("El valor original era de: "+ valorPrincipal +" convertido es: "+ valorConvertido);
		
		this.repeat("t2");
	}
	
	// Metodos tarea3
	public void menu3(){
		Integer opcion = 0;
		this.imprime("Calculo de perimetro");
		this.imprime("Selecciona el numero de opcion que deseas realizar");
		this.imprime("1.- Rectangulo");
		this.imprime("2.- Triangulo");
		this.imprime("3.- Cuadrado");
		this.imprime("4.- Circulo");
		
		
		try {
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				this.perimetroRectangulo();
				break;
			case 2:
				this.perimetroTriangulo();
				break;
			case 3:
				this.perimetroCuadrado();
				break;
			case 4:
				this.perimetroCirculo();
				break;
			default:
				this.imprime("Opcion no valida, favor de seleccionar una correcta");
				this.menu2();
				break;
			}
		} catch (Exception ex) {
			this.imprime("Error!! seleccionar solo numeros enteros, volver a ejecutar");
			
		}
	}
	
	public void perimetroRectangulo(){
		Float base = null, altura = null;
		// Formula P = 2(b+h)
		this.imprimel("Base: ");
		base = sc.nextFloat();
		this.imprimel("Altura: ");
		altura = sc.nextFloat();
		
		perimetro = 2 * (base + altura);
		
		this.imprime("El perimetro del rectangulo es: "+ perimetro);
		
		this.repeat("t3");	
	}		
	
	public void perimetroTriangulo(){
		Float ladoA = null, ladoB = null, ladoC = null;
		// Formula P = a + b + c
		this.imprime("Valor del lado A: ");
		ladoA = sc.nextFloat();
		
		this.imprime("Valor del lado B: ");
		ladoB = sc.nextFloat();
		
		this.imprime("Valor del lado C: ");
		ladoC = sc.nextFloat();
		
		perimetro = ladoA + ladoB + ladoC;
		
		this.imprime("El perimetro del triangulo es: "+ perimetro);
		
		this.repeat("t3");
	}
	
	public void perimetroCuadrado(){
		Float lado;
		// Formula P = a + b + c + d || P = a * 4;

		this.imprime("Valor de un lado: ");
		lado = sc.nextFloat();
		
		perimetro = lado * 4;
		
		this.imprime("El perimetro del cuadrado es: "+ perimetro);
		
		this.repeat("t3");
	}
	
	public void perimetroCirculo(){
		Float radio = null;
		// Formula P = 2 x PI x r
		
		this.imprime("Valor del radio: ");
		radio = sc.nextFloat();
		perimetro = 2 * PI * radio;
		
		this.imprime("El perimetro del circulo es: "+ perimetro);
		
		this.repeat("t3");
	}
	
}
