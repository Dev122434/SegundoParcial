package ws;

import java.util.List;

public class TestCrudAlumno {
    
    public List<Alumno> listaMaestros() {
        return readsProfesores();
    }
    
    public String crearAlumno(Alumno alumno) {
        return createAlumno(alumno);
    }
    
    public String eliminarAlumno(String matricula) {
        return deleteAlumno(matricula);
    }
    
    public Alumno buscarAlumno(String matricula) {
        return readAlumno(matricula);
    }
    
    public String modificarAlumno(Alumno alumno) {
        return updateAlumno(alumno);
    }

    private static String createAlumno(ws.Alumno alumno) {
        ws.OperacionesCrudAlumno_Service service = new ws.OperacionesCrudAlumno_Service();
        ws.OperacionesCrudAlumno port = service.getOperacionesCrudAlumnoPort();
        return port.createAlumno(alumno);
    }

    private static String deleteAlumno(java.lang.String matricula) {
        ws.OperacionesCrudAlumno_Service service = new ws.OperacionesCrudAlumno_Service();
        ws.OperacionesCrudAlumno port = service.getOperacionesCrudAlumnoPort();
        return port.deleteAlumno(matricula);
    }

    private static Alumno readAlumno(java.lang.String matricula) {
        ws.OperacionesCrudAlumno_Service service = new ws.OperacionesCrudAlumno_Service();
        ws.OperacionesCrudAlumno port = service.getOperacionesCrudAlumnoPort();
        return port.readAlumno(matricula);
    }
    

    private static String updateAlumno(ws.Alumno alumno) {
        ws.OperacionesCrudAlumno_Service service = new ws.OperacionesCrudAlumno_Service();
        ws.OperacionesCrudAlumno port = service.getOperacionesCrudAlumnoPort();
        return port.updateAlumno(alumno);
    }

    private static java.util.List<ws.Alumno> readsProfesores() {
        ws.OperacionesCrudAlumno_Service service = new ws.OperacionesCrudAlumno_Service();
        ws.OperacionesCrudAlumno port = service.getOperacionesCrudAlumnoPort();
        return port.readsProfesores();
    }
    
    
}
