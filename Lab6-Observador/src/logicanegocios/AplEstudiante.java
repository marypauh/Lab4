package logicanegocios;

public class AplEstudiante {
	
	public static void main (String[] args) {
		
		TecDigital tecDigital= new TecDigital();
		Estudiante estudiante1 = new CorreoEstudiante(tecDigital);
		Estudiante estudiante2 = new CorreoEstudiante(tecDigital);		
		System.out.println("Cambio un curso a dise�o");
		tecDigital.setCursos("Dise�o");
		System.out.println("Cambio un curso a bases");
		tecDigital.setCursos("Bases ");
		}

}
