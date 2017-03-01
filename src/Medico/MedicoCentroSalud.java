package Medico;

public class MedicoCentroSalud extends Medico{
	protected CentroSalud  centroSalud;
	public MedicoCentroSalud(){
		super();
		centroSalud = new CentroSalud();
	
	}


	@Override
	public void mostrarDatos(){
			super.mostrarDatosMedico();
			centroSalud.
	}
	
	@Override
	public double calcularSalario(double horas,double salarioHoras) {
		
		double salario = horas*salarioHoras;
		return salario;
	}
	
	
	
	
	
	
	
}
