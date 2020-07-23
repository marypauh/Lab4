package logicanegocios;

public class CorreoEstudiante extends Estudiante {
	
	public CorreoEstudiante(Curso pEvaluacion) {
		asunto = pEvaluacion;
		asunto.attach(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Notificaci�n correo: La evaluaci�n ha cambiado: "+asunto.getCurso());
		
	}

}
