package logicanegocios;
import java.util.ArrayList;

public class Curso {
	
	private String evaluacion;
	private ArrayList<Estudiante> estudiantes;
	
	
	public Curso() {
		estudiantes = new ArrayList<>();
	}
	
	public String getCurso() {
		return evaluacion;
	}
	
	
	public void setCursos(String pEvaluacion) {
		evaluacion = pEvaluacion;
		notificarEstudiantes();		
	}
	
	public void attach(Estudiante pEstudiante) {
		estudiantes.add(pEstudiante);
	}
	
	public void notificarEstudiantes() {
		for(int i=0;i<estudiantes.size();i++) {
			estudiantes.get(i).actualizar();
		}
	}

}
