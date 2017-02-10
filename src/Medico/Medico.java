package Medico;

public abstract class Medico {

	protected String nombre;
	protected int edad;
	protected String sexo;
	protected double horas;
	protected double salarioHora;
	
	public Medico(){
		nombre = "roberto";
		edad = 23;
		sexo = "Varon";
		horas = 40;
		salarioHora = 12;
	}
	public Medico(String nombre,int edad,String sexo,double horas,double salarioHora){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.horas = horas;
		this.salarioHora = salarioHora;
	}
	
	
	
	
	
	abstract void calcularSalario(double horas , double salarioHora);
		
	public void montrarDatosMedico(){
		System.out.println("los datos de : "+this.getClass().getSimpleName()+nombre + edad + sexo + horas + salarioHora + calcularSalario);
		
	}

	
}
	