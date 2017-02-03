package epn.edu;

public class Lista {
	
	Nodo primero;
	Nodo ultimo;
	Nodo ver;

	Lista()
	{
		primero=null;
		ultimo=null;
	}

	public boolean estavacio()
	{
		if(primero==null)
		{
			return true;
		}
		else{
			return false;
		}
	}
	////////Agregar al inicio --concatena---
	public Lista AgregarAlumnos(String n, String a,String c,String mat,String m  )
	{
		//System.out.println(Descripci + Cantid + Mar);
		if(estavacio())
		{
			Nodo nuevo=new Nodo(n,a,c,mat,m);
			primero=nuevo;
			//ultimo= primero;
			ultimo= nuevo;
		}
		else{
			Nodo nuevo=new Nodo(n,a,c,mat,m);
			ultimo.Siguiente=nuevo;
			nuevo.Anterior=ultimo;
			ultimo=nuevo;
		}
		return this;
	}
	/////////borrar por Nombre
	public boolean borrarPorNombre(String Nom)
	{
		int a=NumeroAlumnos();
		a--;
		Nodo anterior=null;
		Nodo actual=primero;
		while(actual!=ultimo)
		{
			if(actual.Nombre.equals(Nom))
			{
				if(anterior==null)
				{
					primero=actual.Siguiente;
					primero.Anterior=null;
				}
				else{
					anterior.Siguiente=actual.Siguiente;
					Nodo temporal;
					temporal=actual.Siguiente;
					temporal.Anterior=anterior;
				}
				return true;
			}
			anterior=actual;
			actual=actual.Siguiente;
		}
		System.out.println("Tama�o: "+a);
		if(Nom.equals(ultimo.Nombre))
		{
			ultimo=actual.Anterior;
			return true;
		}
		return false;
	}
	/////////buscar por Nombre
	public boolean BuscarPorNombre(String Nom)
	{
		Nodo  aux =primero;
		boolean encontrado = false;
		while(aux != null )
		{
			if (Nom.equals(aux.getNombre()))
			{
				encontrado = true;
				System.out.print("[ " + aux.getNombre() + ","+aux.getCedula()+","+aux.getApellido()+","+aux.getMateria()+","+aux.isEstado()+"]" + "\n");
			}
			aux = aux.getSiguiente();
		}
		return encontrado;
	}
	//verificacion de la cedula duplicada
	
		public void cedulaDuplicada( String ced){
			Nodo  aux =primero;
			if (ced.equals(aux.getCedula()))
				{
					
					System.out.print("DUPLICADO");
				}else{
				aux = aux.getSiguiente();
				
					System.out.print("NO DUPLICADO");
				}
			}
		
	public void MostrarListaDematriculados()
	{
		if (!estavacio()) 
		{
			Nodo aux = ultimo;
			int i = 1;
			while(aux != null)
			{
				System.out.print(i + ".[ " + aux.getNombre() + "\t\t"+aux.getCedula()+"\t"+aux.getMateria()+"\t"+aux.matricula+"\t]" + "\n");
				aux = aux.getAnterior();
				i++;
			}
		}
	}

	
	/////tama�o
	public int NumeroAlumnos()
	{
		Nodo aux;
		int numAlumnos=0;
		aux = primero;
		//Recorremos
		while(aux != null)
		{
			numAlumnos++;
			aux = aux.getSiguiente();
		}
		return numAlumnos;
	}
}
