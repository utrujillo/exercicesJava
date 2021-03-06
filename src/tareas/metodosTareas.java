package tareas;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class metodosTareas {
	private Scanner sc = new Scanner(System.in);
	public float centigrados;
	public float farenheit;
	public float valorDolar = 19.95f;
	public float valorEuro = 21.41f;
	public float valorYen = 0.17f;
	public float perimetro;
	public float PI = 3.1416f;
	public Integer MAX = 10;
	public Object[][] datos = new Object[MAX][2];
	public Integer posicion = 0;
	public ArrayList<Student> datosAL = new ArrayList<Student>();
	public File path = new File("/Users/codehero/Desktop");
	public String nameFile = "alumnos.txt";
	public String productFile = "productos.txt";
	public ArrayList<Producto> productosAL = new ArrayList<Producto>();
	
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
				case "t4": this.menu4(); break;
				case "t5": this.menu5(); break;
				case "t6": this.menu6(); break;
				case "t7": this.menu7(); break;
				default: this.imprime("Opcion no encontrada"); break;
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
	
	// Tarea 4
	public void menu4(){
		Integer opcion = 0;
		this.imprime("Trabajando con arreglos");
		this.imprime("1.- Registrar Alumno");
		this.imprime("2.- Buscar alumno por matricula");
		this.imprime("3.- Listar alumnos");
		this.imprime("4.- Eliminar alumno");
		
		try {
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: this.registraAlumno(); break;
			case 2: this.buscaAlumno(); break;
			case 3: this.listarAlumnos(); break;
			case 4: this.eliminarAlumno(); break;
			default:
				this.imprime("Opcion no valida, favor de seleccionar una correcta");
				this.menu4();
				break;
			}
		} catch (Exception e) {
			this.imprime("Error!! seleccionar solo numeros enteros, volver a ejecutar");
		}
	}
	
	public void registraAlumno(){
		String alumno = "";
		Integer matricula = null;
		try {
			if (posicion < MAX) {
				this.imprime("Ingresa el nombre del alumno\t");
				alumno = sc.next();
				
				this.imprime("Ingresa la matricula\t");
				matricula = sc.nextInt();
				
				datos[posicion][0] = alumno;
				datos[posicion][1] = matricula;
			
				this.posicion++;
				this.repeat("t4");
			} else {
				this.imprime("Se ha alcanzado el numero maximo de elementos que se pueden ingresar al arreglo, por favor elimina algun registro");
			}
		} catch (Exception e) {
			this.imprime("Error!! seleccionar solo numeros enteros, volver a ejecutar");
		}
	}
	
	public Integer buscaMatricula(Integer matricula){
		Integer encontrado = -1;
		
		for (int i = 0; i < datos.length; i++) {
			if ((Integer)datos[i][1] == (Integer)matricula) {
				encontrado = i;
				break;
			}
		}
		
		return encontrado;
	}
	
	public void buscaAlumno(){
		this.imprime("Matricula a buscar: \t");
		Integer matriculaSrc = sc.nextInt();
		Integer found = this.buscaMatricula(matriculaSrc);
		
		if (found >= 0) {
			this.imprime("Encontrado en posicion ["+ found +"] "+ datos[found][0] +" -> "+ datos[found][1]);
		} else {
			this.imprime("Matricula no encontrada");
		}
		this.repeat("t4");
		
	}
	
	public void ordenaAlumnos(){
		String alumnoTmp = null;
		Integer matriculaTmp = null;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos.length - 1; j++) {
				
				if( datos[j][1] != null && datos[j+1][1] != null ){
					
					if ( (Integer) datos[j][1] > (Integer) datos[j+1][1] ) {
						// Asignando la variable temporal
						alumnoTmp = (String) datos[j+1][0];
						matriculaTmp = (Integer) datos[j+1][1];
						
						// Haciendo el cambio de valores
						datos[j+1][0] = datos[j][0];
						datos[j+1][1] = datos[j][1];
						
						// Asignando la variable temporal al nuevo valor
						datos[j][0] = alumnoTmp;
						datos[j][1] = matriculaTmp;
						
					}
				
				}
				
			}
		}
	}
	
	public void listarAlumnos(){
		this.ordenaAlumnos();
		this.imprime("Alumnos registrados a la fecha");
		for (int i = 0; i < datos.length; i++) {
			if (datos[i][0] != null && datos[i][1] != null) {
				System.out.println( "Posicion ["+ i +"] "+ datos[i][0] +" -> "+ datos[i][1] );
			}
		}
		
		this.repeat("t4");
	}
	
	public void eliminarAlumno(){
		this.imprime("Ingresa la matricula a eliminar");
		Integer matriculaSrc = sc.nextInt();
		Integer found = this.buscaMatricula(matriculaSrc);
		
		if (found >= 0) {
			datos[found][0] = null;
			datos[found][1] = null;
		} else {
			this.imprime("Matricula no encontrada");
		}
		this.repeat("t4");
	}
	
	// Tarea 5 - utilizando arrayList
	public void menu5(){
		Integer opcion = 0;
		this.imprime("Trabajando con arrayList y objectas");
		this.imprime("1.- Registrar Alumno");
		this.imprime("2.- Buscar alumno por matricula");
		this.imprime("3.- Listar alumnos");
		this.imprime("4.- Eliminar alumno");
		
		try {
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: this.registraAlumnoAL(); break;
			case 2: this.buscaAlumnoAL(); break;
			case 3: this.listarAlumnosAL(); break;
			case 4: this.eliminarAlumnoAL(); break;
			default:
				this.imprime("Opcion no valida, favor de seleccionar una correcta");
				this.menu5();
				break;
			}
		} catch (Exception e) {
			this.imprime("Error!! seleccionar solo numeros enteros, volver a ejecutar");
		}
	}
	
	public void registraAlumnoAL(){
		Integer matricula = null;
		String alumno = null, direccion = null, telefono = null, rfc = null;

		try {
			
			this.imprime("Ingresa la matricula: ");
			matricula = sc.nextInt();
			sc.nextLine();
			
			this.imprime("Ingresa el nombre: ");
			alumno = sc.nextLine();
			
			this.imprime("Ingresa la direccion: ");
			direccion = sc.nextLine();
			
			this.imprime("Ingresa el telefono: ");
			telefono = sc.nextLine();
			
			this.imprime("Ingresa el RFC: ");
			rfc = sc.nextLine();
			
			Student st = new Student(matricula, alumno, direccion, telefono, rfc);
			datosAL.add(st);
		
			this.repeat("t5");
			
		} catch (Exception e) {
			System.out.println( e.getLocalizedMessage() );
		}
	}
	
	public Student buscaMatriculaAL(Integer matricula){
		for(Student obj : datosAL){
			if( obj.getMatricula().equals(matricula) ){
				return obj;
			}
		}
		return null;
	}
	
	public void buscaAlumnoAL(){
		this.imprime("Matricula a buscar: ");
		Integer matriculaSrc = sc.nextInt();
		Student found = this.buscaMatriculaAL(matriculaSrc);
		
		if (found != null) {
			this.imprime("Matricula encontrada "+ found.getMatricula() +" -> "+ found.getNombre() );
		} else {
			this.imprime("Matricula no encontrada");
		}
		this.repeat("t5");
	}
	
	public void ordenaAlumnosAL(){
		/* El ordenamiento lo saque de este video
		 * https://www.youtube.com/watch?v=wzWFQTLn8hI
		 */
		Collections.sort(datosAL, new Comparator<Student>() 
		{
			public int compare(Student s1, Student s2){
				return Integer.valueOf(s1.getMatricula()).compareTo(s2.getMatricula());
			}
		});
	}
	
	public void listarAlumnosAL(){
		this.ordenaAlumnosAL();
		for(Student obj : datosAL){
			this.imprime("Matricula: "+ obj.getMatricula() 
						+" Nombre: "+ obj.getNombre() 
						+" Direccion: "+ obj.getDireccion() 
						+" Telefono: "+ obj.getTelefono() 
						+" RFC: "+ obj.getRFC());
		}
		
		this.repeat("t5");
	}
	
	public void eliminarAlumnoAL(){
		this.imprime("Matricula a buscar: ");
		Integer matriculaSrc = sc.nextInt();
		Boolean matDeleted = false;
		
		for (int i = 0; i < datosAL.size(); i++) {
			if( datosAL.get(i).getMatricula().equals(matriculaSrc) ){
				datosAL.remove(i);
				matDeleted = true;
			}
		}
		
		if (matDeleted) {
			this.imprime("Matricula eliminada");
		}else{
			this.imprime("No se ha eliminado la matricula pues no fue encontrada");
		}
		
		this.repeat("t5");
	}
	
	// tarea 6
	public void menu6(){
		Integer opcion = 0;
		this.imprime("Trabajando con archivos");
		this.imprime("1.- Agregar Alumno");
		this.imprime("2.- Eliminar alumno");
		this.imprime("3.- Buscar alumno");
		this.imprime("4.- Listar alumnos");
		
		try {
			opcion = sc.nextInt();
			switch (opcion) {
			case 1: this.agregaAlumnoArchivo(); break;
			case 2: this.eliminaAlumnoArchivo(); break;
			case 3: this.buscaAlumnoArchivo(); break;
			case 4: this.listaAlumnoArchivo(); break;
			default:
				this.imprime("Opcion no valida, favor de seleccionar una correcta");
				this.menu4();
				break;
			}
		} catch (Exception e) {
			this.imprime("Error!! seleccionar solo numeros enteros, volver a ejecutar");
		}
	}
	
	public void agregaAlumnoArchivo(){
		PrintStream ps = null;
        FileOutputStream fos = null;
        
        File archivo = new File(this.path, this.nameFile);
        
        try{         
            this.imprime("Agregar información a la agenda");
            sc.nextLine();

            this.imprime("Matricula: ");
            String matricula = sc.nextLine();
            
            this.imprime("Nombre: ");
            String nombre = sc.nextLine();
            
            this.imprime("Direccion: ");
            String direccion = sc.nextLine();
            
            this.imprime("Telefono: ");
            String telefono = sc.nextLine();
            
            this.imprime("RFC: ");
            String rfc = sc.nextLine();
            
            fos = new FileOutputStream(archivo,true);
            ps = new PrintStream(fos);
            ps.println(matricula +"-"+ nombre +"-"+ direccion +"-"+ telefono +"-"+ rfc);
            
            
        }catch(IOException ex){
            System.out.printf("\nHa ocurrido un error: %s", ex.toString() );
        }finally{
            try{
                System.out.println("Los datos han sido guardados");
                this.repeat("t6");
                ps.close();
            }catch(Exception ex){
                System.out.printf("Error al cerrar el flujo: %s", ex.toString());
            }            
        }
	}
	public void eliminaAlumnoArchivo(){}
	
	public Integer buscaMatriculaArchivo(String matricula){
		File archivo = new File(path, nameFile);
		
		Integer found = null, contador = 1;
        
        try{
            if(archivo.exists()){
                FileInputStream fis = new FileInputStream(archivo);
                Scanner sc = new Scanner(fis);
                
                while(sc.hasNext()){
                	String parts[] = sc.nextLine().split("-");
                	
                	if (matricula.equals(parts[0])) {
						found = contador;
					}
                	contador ++;
                }
                sc.close();
            }else{
                this.imprime("El archivo que deseas leer no existe");
                this.repeat("t6");
            }
        }catch(IOException ex){
            System.out.printf("Error: %s", ex.toString());
        }
        
        return found;
	}
	public void buscaAlumnoArchivo(){
		this.imprime("Matricula a buscar: ");
		sc.nextLine();
		String matriculaSrc = sc.nextLine();
		Integer found = this.buscaMatriculaArchivo(matriculaSrc);
		
		if (found != null) {
			this.imprime("Matricula encontrada en la linea "+ found);
		} else {
			this.imprime("Matricula no encontrada");
		}
		this.repeat("t6");
	}
	public void listaAlumnoArchivo(){
		File archivo = new File(path, nameFile);            
        
        try{
            if(archivo.exists()){
                FileInputStream fis = new FileInputStream(archivo);
                Scanner sc = new Scanner(fis);
                while(sc.hasNext()){
                    this.imprime(sc.nextLine());
                }
                sc.close();
                this.repeat("t6");
            }else{
                this.imprime("El archivo que deseas leer no existe");
                this.repeat("t6");
            }
        }catch(IOException ex){
            System.out.printf("Error: %s", ex.toString());
        }
	}
	
	// tarea 7
	public void menu7(){
		Integer opcion = 0;
		this.imprime("Trabajando con archivos y arrayList");
		this.imprime("1.- Alta de productos");
		this.imprime("2.- Entrada de productos");
		this.imprime("3.- Salida de productos");
		this.imprime("4.- Listar productos");
		this.imprime("5.- Salir");
		
		try {
			opcion = sc.nextInt();
			switch (opcion) {
			
			case 1: this.altaProducto(); break;
			case 2: this.entradaProducto(); break;
			case 3: this.salidaProducto(); break;
			case 4: this.listarProductos(); break;
			case 5: this.guardarProductos(); break;
			default:
				this.imprime("Opcion no valida, favor de seleccionar una correcta");
				this.menu7();
				break;
			}
		} catch (Exception e) {
			this.imprime("Error!!: "+ e.toString());
		}
	}
	
	public void backToMenu(String opcion){
		String volver;
		this.imprime("Deseas volver al menu? S/N: ");
		volver = sc.next();

		if (volver.charAt(0) == 'N' || volver.charAt(0) == 'n') {
			switch (opcion) {
				case "altaProducto": this.altaProducto(); break;
				case "entradaProducto": this.entradaProducto(); break;
				case "salidaProducto": this.salidaProducto(); break;
				default: this.imprime("Opcion no encontrada"); break;
			}
		} else {
			this.menu7();
		}
	}
	
	public void cargaArchivoProductos(){
		File archivo = new File(this.path, this.productFile);
        Integer line = 0;
        try{
            if(archivo.exists()){
                FileInputStream fis = new FileInputStream(archivo);
                Scanner sc = new Scanner(fis);
                
                while(sc.hasNext()){
                	String parts[] = sc.nextLine().split("\t");
                	//System.out.println( Arrays.toString(parts) );
                	if(parts.length == 7 && line >= 2){
                		Producto prod = new Producto();
                		prod.setCodigo( Integer.parseInt(parts[0]) );
                		prod.setDescripcion( parts[1] );
                		prod.setMedida( parts[2] );
                		prod.setCategoria( parts[3] );
                		prod.setCantidad( Integer.parseInt( parts[4] ) );
                		prod.setpCompra( Float.parseFloat( parts[5] ) );
                		prod.setpVenta( Float.parseFloat( parts[6] ) );
                		
                		productosAL.add( prod );
                	}
                	line++;
                }
                sc.close();
                this.imprime("Datos cargados correctamente");
            }
        }catch(IOException ex){
            System.out.printf("Error: %s", ex.toString());
        }
	}
	
	public void altaProducto(){
		try {
			Producto prod = new Producto();
			
			this.imprime("Ingresa los datos del Producto: ");
			
			
			this.imprime("Codigo: ");
			prod.setCodigo(sc.nextInt());
			sc.nextLine();
			
			this.imprime("Descripción: ");
			prod.setDescripcion(sc.nextLine());
			
			this.imprime("Medida: ");
			prod.setMedida(sc.nextLine());
			
			this.imprime("Categoría: ");
			prod.setCategoria(sc.nextLine());
			
			prod.setCantidad(0);
			prod.setpCompra(0f);
			prod.setpVenta(0f);
			
			productosAL.add(prod);
		
			this.backToMenu("altaProducto");
			
		} catch (Exception e) {
			System.out.println( e.getLocalizedMessage() );
		}
	}
	
	public Producto buscaCodigoProducto(Integer codigo){
		for(Producto item : productosAL){
			if( item.getCodigo().equals(codigo) ){
				return item;
			}
		}
		return null;
	}
	
	public void muestraProducto(Producto item){
		this.imprime("Codigo\tDescripción\tMedida\tCategoria\tCantidad\tP. Compra\tP. Venta");
		this.imprime("----------------------------------------------------------------------------------------");
		this.imprime(item.getCodigo() 
					+"\t"+ item.getDescripcion()
					+"\t"+ item.getMedida()
					+"\t"+ item.getCategoria()
					+"\t"+ item.getCantidad()
					+"\t"+ item.getpCompra()
					+"\t"+ item.getpVenta() );
	}
	
	public void entradaProducto(){
		this.imprime("Codigo a buscar: ");
		Integer codigoSrc = sc.nextInt();
		Producto item = this.buscaCodigoProducto(codigoSrc);
		
		if (item != null) {
			// Mostrando datos del item
			this.muestraProducto(item);
			
			// Agregando datos del producto
			this.imprime("Para agregar la entrada de datos es necesario mostrar los siguientes valores");
			this.imprime("Cantidad: ");
			item.setCantidad(sc.nextInt());
			
			this.imprime("P. Compra: ");
			item.setpCompra(sc.nextFloat());
			
			this.imprime("P. Venta: ");
			item.setpVenta(sc.nextFloat());
			
		} else {
			this.imprime("Codigo no encontrado");
		}
		this.backToMenu("entradaProducto");
	}
	
	public void salidaProducto(){
		this.imprime("Codigo a buscar: ");
		Integer codigoSrc = sc.nextInt();
		Producto item = this.buscaCodigoProducto(codigoSrc);
		
		if (item != null) {
			// Mostrando datos del item
			this.muestraProducto(item);
			
			// Salida de productos
			this.imprime("Salida de producto");
			this.imprime("Cantidad: ");
			Integer cantidadSalida = sc.nextInt();
			
			if( item.getCantidad() - cantidadSalida > 0 ){
				Float costo = cantidadSalida * item.getpVenta();
				this.imprime("El costo es: "+ costo);
				item.setCantidad(item.getCantidad() - cantidadSalida);
			}else{
				this.imprime("No contamos con esa cantidad, lo sentimos");
				this.salidaProducto();
			}
			
		} else {
			this.imprime("Codigo no encontrado");
		}
		this.backToMenu("salidaProducto");
	}
	
	public void ordenaProductos(){
		Collections.sort(productosAL, new Comparator<Producto>() 
		{
			public int compare(Producto p1, Producto p2){
				return Integer.valueOf(p1.getCodigo()).compareTo(p2.getCodigo());
			}
		});
	}
	
	public void listarProductos(){
		// Ordenamos los productos
		this.ordenaProductos();
		
		// Listamos los productos
		this.imprime("Codigo\tDescripción\tMedida\tCategoria\tCantidad\tP. Compra\tP. Venta");
		this.imprime("----------------------------------------------------------------------------------------");
		for(Producto item : productosAL){
			this.imprime(item.getCodigo() 
					+"\t"+ item.getDescripcion()
					+"\t"+ item.getMedida()
					+"\t"+ item.getCategoria()
					+"\t"+ item.getCantidad()
					+"\t"+ item.getpCompra()
					+"\t"+ item.getpVenta() );
		}
		
		this.imprime("");
		this.menu7();
	}
	
	public void guardarProductos(){
		PrintStream ps = null;
        FileOutputStream fos = null;
        
        File archivo = new File(this.path, this.productFile);
        
        try{
        	// Borramos el archivo
            archivo.delete();
        	
            // Ordenamos los productos
            this.ordenaProductos();
            
            // Guardamos productos en el archivo
    		fos = new FileOutputStream(archivo,true);
            ps = new PrintStream(fos);
            ps.println("Codigo\tDescripción\tMedida\tCategoria\tCantidad\tP. Compra\tP. Venta");
            ps.println("----------------------------------------------------------------------------------------");
        	
        	for(Producto item : productosAL){
    			ps.println(item.getCodigo() 
    						+"\t"+ item.getDescripcion()
    						+"\t"+ item.getMedida()
    						+"\t"+ item.getCategoria()
    						+"\t"+ item.getCantidad()
    						+"\t"+ item.getpCompra()
    						+"\t"+ item.getpVenta() );
    		}

        }catch(IOException ex){
            System.out.printf("\nHa ocurrido un error: %s", ex.toString() );
        }finally{
            try{
                System.out.println("Los datos han sido guardados");
                ps.close();
            }catch(Exception ex){
                System.out.printf("Error al cerrar el flujo: %s", ex.toString());
            }            
        }
	}
	
}
