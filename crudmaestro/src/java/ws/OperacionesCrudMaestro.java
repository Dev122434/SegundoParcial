package ws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import modelo.beans.ProfesorBean;
import modelo.pojos.Profesor;

@WebService(serviceName = "OperacionesCrud")
@Stateless()
public class OperacionesCrudMaestro {
    
    

    /**
     * Web service operation
     * @param profesor objeto con los valores a modificar
     * @return mensaje indicando si se pudo realizar la operación
     */
    @WebMethod(operationName = "updateProfesor")
    public String updateProfesor(@WebParam(name = "profesor") Profesor profesor) {
        //TODO write your implementation code here:
        ProfesorBean profesorBean = new ProfesorBean();
        profesorBean.setProfesor(profesor);
        String mensaje = "";
        if (profesorBean.modificarProfesor()) {
            mensaje = "El profesor ha sido modificado";
        } else {
            mensaje = "El profesor no pudo ser modificado";
        }
        return mensaje;
    }

    /**
     * Web service operation
     * @param clave valor para realizar la busqueda
     * @return objeto con los valores del profesor
     */
    @WebMethod(operationName = "readProfesor")
    public Profesor readProfesor(@WebParam(name = "clave") String clave) {
        //TODO write your implementation code here:
        ProfesorBean profesorBean = new ProfesorBean();
        profesorBean.getProfesor().setClave(clave);
        Profesor profesor = new Profesor();
        if (!profesorBean.buscarProfesor()) {
            profesorBean.setProfesor(new Profesor());
        }
        return profesorBean.getProfesor();
    }

    /**
     * Web service operation
     * @param clave valor con el cual se va eliminar
     * @return mensaje indicando si se pudo realizar la operación
     */
    @WebMethod(operationName = "deleteProfesor")
    public String deleteProfesor(@WebParam(name = "clave") String clave) {
        //TODO write your implementation code here:
        ProfesorBean profesorBean = new ProfesorBean();
        profesorBean.getProfesor().setClave(clave);
        String mensaje = "";
        if (profesorBean.eliminarProfesor()) {
            mensaje = "El profesor ha sido eliminado";
        } else {
            mensaje = "El profesor no se pudo eliminar";
        }
        return mensaje;
    }

    /**
     * Web service operation
     * @param profesor
     * @return mensaje indicando si se pudo realizar la operacion
     */
    @WebMethod(operationName = "createProfesor")
    public String createProfesor(@WebParam(name = "profesor") Profesor profesor) {
        
        ProfesorBean profesorBean = new ProfesorBean();
        profesorBean.setProfesor(profesor); // Asgina los valores recibidos
        String mensaje = "";
        if (profesorBean.agregarProfesor()) {
            mensaje = "El profesor ha sido registrado";
        } else {
            mensaje = "El profesor no ha sido registrado";
        }
        return mensaje;
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "readsProfesores")
    public List<Profesor> readsProfesores() {
        ProfesorBean profesorBean = new ProfesorBean();
        
        if (!profesorBean.listarProfesores()) {
            profesorBean.setListaProfesores(new ArrayList<Profesor>());
        }
        return profesorBean.getListaProfesores();
    }
    
    
    
    
}