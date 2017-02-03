package epn.edu;

public class Nodo {
	String Nombre;
	String Cedula;
	String apellido;
	String materia;
	String matricula;
	boolean Estado;

	Nodo Siguiente;
	Nodo Anterior;

	Nodo (String n, String a,String c,String mat,String m )
	{  
		this.Nombre=n;
		this.apellido=a;
		this.Cedula=c;
		this.materia=mat;
		this.matricula=m;
		if (this.matricula=="MATRICULADO")
		{	
			this.Estado= true;	
		}
		else{
			this.Estado=false;
		}
		this.Siguiente=null;
		this.Anterior=null;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCedula() {
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}

	public Nodo getSiguiente() {
		return Siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		Siguiente = siguiente;
	}

	public Nodo getAnterior() {
		return Anterior;
	}

	public void setAnterior(Nodo anterior) {
		Anterior = anterior;
	}

	

}
