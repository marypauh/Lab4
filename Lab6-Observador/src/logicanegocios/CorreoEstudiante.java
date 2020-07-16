package logicanegocios;

public class CorreoEstudiante extends Estudiante {
	
	public CorreoEstudiante(TecDigital pTecDigital) {
		asunto =pTecDigital;
		asunto.attach(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Los cursos han cambiado: "+asunto.getCurso());
		
	}

}
