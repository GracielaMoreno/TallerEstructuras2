package epn.edu;


public class Aplicacion {
	public static void main(String[] args) { 
		Lista a=new Lista();
		
        
		System.out.println("<<-- Lista Completa-->>\n");

		a.AgregarAlumnos("GRACIELA","MORENO", 12345,"MATEMATICAS","MATRICULADO");
		a.AgregarAlumnos("ALEXA","MACAS", 4532233,"CALCULO"," MATRICULADO");
		a.AgregarAlumnos("ALEXANDER","MACIAS", 4987233,"VECTORIAL","MATRICULADO");
		
		System.out.println(" ~ Descripcion\t Cantidad\tEstado\n");
		a.MostrarNoMatriculados();
		System.out.println("\n<<-- Productos aun no comprados -->>\n"); 
		System.out.println(" ~ nombre\t Cedula\t ,materia\t estado");
		a.MostrarListaDematriculados();
			//a.MostrarNoMatriculados();
				System.out.println("buscar por nombre el Atun"); 
				a.BuscarPorNombre("GRACIELA");
			//	System.out.println("borrar por nombre el Atun");
			//	a.borrarPorProducto("Atun");
			//
	}}
	

