//*******************************************************************
//Autores: Julio Castillo, Mario Galvez, Darwin Rivas y Diego Rosales
//Seccion: 20
//
//Nobmbe de Archivo: Radio.java
//Breve Descripcion: interfaz que describe el comportamiento de una 
// radio capaz de encenderse, apagarse, cambiar entre AM y FM, 
// sintonizar distintas estaciones y guardar en memoria estaciones
//*******************************************************************



public interface Radio{

	public void setEstado(boolean estado);
	//
	//pre:ninguna
	//post:Cambia el atributo estado por la enviada en el parametro
	
	public boolean getEstado();
	//
	//pre:
	//post:
	
	public int getAMFM();
	//
	//pre:
	//post:
	
	public void setAMFM(int amfm);
	//
	//pre:ninguna
	//post:Cambia el tributo AMFM por el valor enviado en el parametro
	
	public void sintonizar(boolean direccion);
	//Descripcion: barre frecuencias escalon por escalon
	//pre:ninguna
	//post:cambia el valor de la estacion dependiendo si es true o false
	//si es true le suma si es false le resta
	
	public void guardar(int pos);
	//Descripcion: guarda frecuecias en las memorias disponibles
	//pre:
	//post:guarda el valor actual de la frecuencia en la posicion
	//recibida en el parametro
	
	public void memoria(int pos);
	//Descripcion: sintoniza frecuencias guardadas en memoria
	//pre:
	//post:cambia el valor de la frecuencia por el valor guardado en la 
	//posicion recibida en el parametro
	
	public float getEmisora();
	//
	//pre:
	//popst:

}