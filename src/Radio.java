//*******************************************************************
//Autores: Julio Castillo, Mario Galvéz, Darwin Rivas y Diego Rosales
//Seccion: 20
//
//Nobmbe de Archivo: Radio.java
//Breve Descripcion: interfaz que describe el comportamiento de una 
// radio capaz de encenderse, apagarse, cambiar entre AM y FM, 
// sintonizar distintas estaciones y guardar en memoria estaciones
//*******************************************************************



public interface Radio{

	public void setEstado(boolean nEstado);
	
	public boolean getEstado();
	
	public int getAMFM();
	
	public void setAMFM(int banda);
	
	public void sintonizar(boolean ud);
	
	public void guardar(int pos);
	
	public void memoria(int pos);
	
	public float getEmisora();

}