package logicanegocios;

public class SmsEstudiante extends Estudiante {
	
	public SmsEstudiante(Curso pEvaluacion) {
		asunto = pEvaluacion;
		asunto.attach(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Notificación sms: La evaluación ha cambiado: "+asunto.getCurso());
		
	}

}
