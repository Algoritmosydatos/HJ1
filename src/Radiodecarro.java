//*******************************************************************
//Autores: Julio Castillo, Mario Galv�z, Darwin Rivas y Diego Rosales
//Seccion: 20
//
//Nobmbe de Archivo: Radiodecarro.java
//Breve Descripcion: implementa la interfaz Radio para modelar un
// radio de carro
//*******************************************************************

public class Radiodecarro implements Radio{
	private boolean estado;
	private int AMFM;
	private float[] botonesAM;
	private float[] botonesFM;
	private float estacion;
	private float intervalo;
	private float AM;
	private float FM;
	
	public Radiodecarro(){
		estado=false;
		AMFM=0;
		botonesAM=new float[12];
		botonesFM=new float[12];
		estacion=530.00f;
		intervalo=10.00f;
		AM=530.00f;
		FM=87.9f;
	}
	
	public void setEstado(boolean nEstado){
		estado=nEstado;
	}
	
	public boolean getEstado(){
		return estado;
	}
	
	public void setAMFM(int banda){
		if (AMFM==0){
			AM=estacion;
		}
		else{
			FM=estacion;
		}
		AMFM=banda;
		if (AMFM==0){
			intervalo=10.00f;
			estacion=AM;
		}
		else{
			intervalo=0.2f;
			estacion=FM;
		}
	}
	
	public int getAMFM(){
		return AMFM;
	}
	
	public void sintonizar(boolean ud){
		if (ud){
			estacion+=intervalo;
		}
		else{
			estacion-=intervalo;
		}
		
		
		if (AMFM==0){
			if (estacion>1610){
				estacion=530;
			}
			else if (estacion<530){
				estacion=1610;
			}
		}
		else{
			if (estacion>107.9){
				estacion=87.9f;
			}
			else if(estacion<87.9){
				estacion=107.9f;
			}
		}
	}
	
	public void guardar(int pos){
		if (AMFM==0){
			botonesAM[pos-1]=estacion;
		}
		else{
			botonesFM[pos-1]=estacion;
		}
	}
	
	public void memoria(int pos){
		if (AMFM==0){
			estacion=botonesAM[pos-1];
		}
		else{
			estacion=botonesFM[pos-1];
		}
	}
	
	public float getEmisora(){
		return estacion;
	}
	
	
	
	
	
}