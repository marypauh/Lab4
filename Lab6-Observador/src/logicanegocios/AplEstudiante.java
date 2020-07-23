package logicanegocios;

public class AplEstudiante {
	
	public static void main (String[] args) {
		
		Curso evaluacion = new Curso();
		
		Estudiante estudiante1 = new CorreoEstudiante(evaluacion);
		Estudiante estudiante2 = new SmsEstudiante(evaluacion);
		
		System.out.println("Cambio una evaluacion a examen");
		evaluacion.setCursos("Examen");
		
		System.out.println("Cambio una evaluacion a quiz");
		evaluacion.setCursos("Quiz");
		}

}
