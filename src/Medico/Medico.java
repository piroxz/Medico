package Medico;

public abstract class Medico {

	protected String nombre;
	protected int edad;
	protected String sexo;
	protected double horas;
	protected double salarioHoras;
	
	public Medico(){
		nombre = "roberto";
		edad = 23;
		sexo = "Varon";
		horas = 40;
		salarioHoras = 12;
	}
	public Medico(String nombre,int edad,String sexo,double horas,double salarioHoras){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.horas = horas;
		this.salarioHoras = salarioHoras;
	}
	

	
	public abstract double calcularSalario(double horas , double salarioHoras);
	
	
}
