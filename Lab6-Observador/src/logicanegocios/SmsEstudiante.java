package logicanegocios;

public class SmsEstudiante extends Estudiante {
	
	public SmsEstudiante(Curso pEvaluacion) {
		asunto = pEvaluacion;
		asunto.attach(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Notificaci�n sms: La evaluaci�n ha cambiado: "+asunto.getCurso());
		
	}

}
