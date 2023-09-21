package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	
	private static ArrayList<Pez> lista = new ArrayList<Pez>();
	private static Pez[] listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	
	public static int cantidadPeces(){
		return lista.size();
		}

}
