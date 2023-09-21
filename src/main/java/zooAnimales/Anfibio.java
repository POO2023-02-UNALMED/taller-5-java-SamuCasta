package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	
	private static ArrayList<Anfibio> lista = new ArrayList<Anfibio>();
	private static Anfibio[] listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	
	public static int cantidadAnfibios(){
		return lista.size();
		}

}
