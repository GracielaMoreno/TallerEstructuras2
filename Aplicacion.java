package epn.edu;


public class Aplicacion {
	public static void main(String[] args) { 
		Lista a=new Lista();
		
		
		a.AgregarAlumnos("GRACIELA","MORENO", "12345","MATEMATICAS","MATRICULADO");
		a.AgregarAlumnos("ALEXA","MACAS"," 4532233","CALCULO","  MATRICULADO");
		
		
		a.AgregarAlumnos("ALEXANDER","MACIAS", "4987233","VECTORIAL","MATRICULADO");
		
		
		
		
		System.out.println("\n<<--------------- alumnos ingresados ------------->>\n"); 
		System.out.println(" ~ nombre\t~~~~~~ Cedula~~~~~~ materia\t estado");
		a.MostrarListaDematriculados();
		
		System.out.println("verificar si la cedula esta duplicada\n");
		
		a.cedulaDuplicada("12345");
		
	    System.out.println("\nBuscar por nombre el GRACIELA Y VER SI ESTA MATRICULADO\n"); 
		a.BuscarPorNombre("GRACIELA");
		 System.out.println("borrar por nombre el GRACIELA \n"); 
					
		a.borrarPorNombre("GRACIELA");
		a.MostrarListaDematriculados();
		 System.out.println("Numero de Alumnos\n:"); 
			a.NumeroAlumnos();
	}}
	

