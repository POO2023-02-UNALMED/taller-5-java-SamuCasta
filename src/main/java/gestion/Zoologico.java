package gestion;

import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico(){}

	public Zoologico(String nombre1, String ubicacion1) {
        this.nombre = nombre1;
        this.ubicacion = ubicacion1;
        this.zonas = new ArrayList<Zona>();
        
	}
        
        public void agregarZonas(Zona NuevaZona) {
            zonas.add(NuevaZona); 
	}
        
        public int cantidadTotalAnimales() {
            int totalAnimales = 0;
            for (Zona i : zonas) {
                totalAnimales += i.cantidadAnimales();
            }
            return totalAnimales;
        }
        
        public String getNombre(){
        	return nombre;
        	}
        public String getUbicacion()
        {return ubicacion;
        }
        public ArrayList<Zona> getZona(){
        	return zonas;
        	}
}
