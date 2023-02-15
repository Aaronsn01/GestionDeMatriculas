package GestionMatriculas;

	import java.util.*;

public class Matricula {

	private Date fMatriculacion;
	private int importeFinal;
	private int añoCurso;
	
	public Asignatura asignatura;
	
	public Matricula() {
		
	}
	
	public void agrupar(Asignatura a) {
		asignatura =a;
	}
}
