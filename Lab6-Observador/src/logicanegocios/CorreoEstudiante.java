package logicanegocios;

public class CorreoEstudiante extends Estudiante {
	
	public CorreoEstudiante(Curso pEvaluacion) {
		asunto = pEvaluacion;
		asunto.attach(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Notificación correo: La evaluación ha cambiado: "+asunto.getCurso());
		
	}

}
