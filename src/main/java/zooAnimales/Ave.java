package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> lista = new ArrayList<Ave>();
	private static Ave[] listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	
	
	public static int cantidadAves(){
		return lista.size();
		}

}

