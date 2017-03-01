package Medico;

public class CentroSalud {

	protected int identificador;
	protected String nombre;
	protected String domicilio;
	protected int codigoPostal;
	
	
	public CentroSalud(){
		identificador = 01;
		nombre = "C.S Ana";
		domicilio = "Calle los Canes 2";
		codigoPostal = 28029;
	}
	
	
	public void mostrarDatos(){
		System.out.println("Los datosl centro son :\nidentificador"+identificador+"\nnombre"+nombre+"\ndomicilio"+domicilio+"\ncodigo Postal"+codigoPostal);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getidentificador(){
		return identificador;
	}
	
	public String getnombre(){
		return nombre;
	}
	public String getdomicilio(){
		return domicilio;
	}
	public int getcodigoPostal(){
		return codigoPostal;
	}
	
	
	public void setindentificador(int identificador){
		this.identificador = identificador;
	}
	public void setnombre(String nombre){
		this.nombre = nombre;
	}
	public void setdomicilio(String domicilio){
		this.domicilio = domicilio;
	}
	public void setcodigoPostal(int codigoPostal){
		this.codigoPostal = codigoPostal;
	}
	
	
	
	
	
	
}
