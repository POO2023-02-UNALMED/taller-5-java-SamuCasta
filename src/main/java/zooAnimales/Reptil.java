package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	
	private static ArrayList<Reptil> lista = new ArrayList<Reptil>();
	private static Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	
	public static int cantidadReptiles(){
		return lista.size();
		}

}
