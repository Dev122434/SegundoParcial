package ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import modelo.beans.AlumnoBean;
import modelo.pojos.Alumno;

@WebService(serviceName = "OperacionesCrudAlumno")
@Stateless()
public class OperacionesCrudAlumno {
    

    /**
     * Web service operation
     * @param alumno
     * @return 
     */
    @WebMethod(operationName = "updateAlumno")
    public String updateAlumno(@WebParam(name = "alumno") Alumno alumno) {
        //TODO write your implementation code here:
        AlumnoBean alumnoBean = new AlumnoBean();
        alumnoBean.setAlumno(alumno);
        String mensaje = "";
        if (alumnoBean.modificarAlumno()) {
            mensaje = "El alumno ha sido modificado";
        } else {
            mensaje = "El alumno no pudo ser modificado";
        }
        return mensaje;
    }

    /**
     * Web service operation
     * @param clave valor para realizar la busqueda
     * @return objeto con los valores del profesor
     */
    @WebMethod(operationName = "readAlumno")
    public Alumno readAlumno(@WebParam(name = "matricula") String matricula) {
        //TODO write your implementation code here:
        AlumnoBean alumnoBean = new AlumnoBean();
        alumnoBean.getAlumno().setMatricula(matricula);
        Alumno alumno = new Alumno();
        if (!alumnoBean.buscarAlumno()) {
            alumnoBean.setAlumno(new Alumno());
        }
        return alumnoBean.getAlumno();
    }

    /**
     * Web service operation
     * @param matricula
     * @return mensaje indicando si se pudo realizar la operación
     */
    @WebMethod(operationName = "deleteAlumno")
    public String deleteAlumno(@WebParam(name = "matricula") String matricula) {
        //TODO write your implementation code here:
        AlumnoBean alumnoBean = new AlumnoBean();
        alumnoBean.getAlumno().setMatricula(matricula);
        String mensaje = "";
        if (alumnoBean.eliminarAlumno()) {
            mensaje = "El alumno ha sido eliminado";
        } else {
            mensaje = "El alumno no se pudo eliminar";
        }
        return mensaje;
    }

    /**
     * Web service operation
     * @param alumno
     * @return mensaje indicando si se pudo realizar la operacion
     */
    @WebMethod(operationName = "createAlumno")
    public String createAlumno(@WebParam(name = "alumno") Alumno alumno) {
        
        AlumnoBean alumnoBean = new AlumnoBean();
        alumnoBean.setAlumno(alumno); // Asgina los valores recibidos
        String mensaje = "";
        if (alumnoBean.agregarAlumno()) {
            mensaje = "El alumno ha sido registrado";
        } else {
            mensaje = "El alumno no ha sido registrado";
        }
        return mensaje;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "readsProfesores")
    public List<Alumno> readsProfesores() {
        AlumnoBean alumnoBean = new AlumnoBean();
        
        if (!alumnoBean.listarAlumnos()) {
            alumnoBean.setListaAlumnos(new ArrayList<Alumno>());
        }
        return alumnoBean.getListaAlumnos();
    }
    
    
    
    
}