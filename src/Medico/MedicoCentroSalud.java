package Medico;

public class MedicoCentroSalud extends Medico{

	public MedicoCentroSalud(){
		super();
	
	}


	
	public void mostrarDatos(){
		
	}
	
	@Override
	public double calcularSalario(double horas,double salarioHoras) {
		
		double salario = horas*salarioHoras;
		return salario;
	}
	
	
	
	
	
	
	
}
