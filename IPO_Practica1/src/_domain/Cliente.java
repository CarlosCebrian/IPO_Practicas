package _domain;

public class Cliente {
	private	String nombre;
	private	String apellidos;
	private	String nivelEstudios;
	private boolean estadoCivil; //false= soltero; true=casado
	private int	numHijos;
	
	//Constructores
	public Cliente(String nomb, String apell, String nivelEst, boolean estadoCiv, int numHij){
		nombre = nomb;
		apellidos = apell;
		nivelEstudios = nivelEst;
		estadoCivil = estadoCiv;
		numHijos = numHij;
	}
	
	//Métodos set
	public void setNombre(String nomb){
		nombre = nomb;
	}
	
	public void setApellidos(String apell){
		apellidos = apell;
	}
	
	public void setNivelEstudios(String	nivelEst){
		nivelEstudios =	nivelEst;
	}
	
	public void setEstadoCivil(boolean estadoCiv){
		estadoCivil	= estadoCiv;
	}
	
	public void setNumHijos(int	numHij){
		numHijos = numHij;
	}
	
	//Métodos get
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellidos(){
		return apellidos;
	}
	
	public String getNivelEstudios(){
		return nivelEstudios;
	}
	
	public boolean getEstadoCivil(){ 
		return estadoCivil;
	}
	
	public int getNumHijos(){ 
		return numHijos;
	}
}
