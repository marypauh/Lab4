package logicanegocios;
import java.util.ArrayList;

public class TecDigital {
	
	private String curso;
	private ArrayList<Estudiante> estudiantes;
	
	
	public TecDigital() {
		estudiantes = new ArrayList<>();
	}
	
	public String getCurso() {
		return curso;
	}
	
	
	public void setCursos(String pCursos) {
		curso = pCursos;
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
