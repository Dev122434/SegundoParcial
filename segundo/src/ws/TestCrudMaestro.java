/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 5-12
 */
public class TestCrudMaestro {
    
    private List<Profesor> listaProfesores = new ArrayList<>();
    
    public void consultarMaestros() {
        this.listaProfesores = readsProfesores();
    }

    public String crearProfesor(Profesor profesor) {
        return createProfesor(profesor);
    }

    public String eliminarProfesor(String clave) {
        return deleteProfesor(clave);
    }

    public Profesor buscarProfesor(String clave) {
        return readProfesor(clave);
    }

    public String modificarProfesor(Profesor profesor) {
        return updateProfesor(profesor);
    }

    private static String createProfesor(ws.Profesor profesor) {
        ws.OperacionesCrud service = new ws.OperacionesCrud();
        ws.OperacionesCrudMaestro port = service.getOperacionesCrudMaestroPort();
        return port.createProfesor(profesor);
    }

    private static String deleteProfesor(java.lang.String clave) {
        ws.OperacionesCrud service = new ws.OperacionesCrud();
        ws.OperacionesCrudMaestro port = service.getOperacionesCrudMaestroPort();
        return port.deleteProfesor(clave);
    }

    private static Profesor readProfesor(java.lang.String clave) {
        ws.OperacionesCrud service = new ws.OperacionesCrud();
        ws.OperacionesCrudMaestro port = service.getOperacionesCrudMaestroPort();
        return port.readProfesor(clave);
    }

    private static java.util.List<ws.Profesor> readsProfesores() {
        ws.OperacionesCrud service = new ws.OperacionesCrud();
        ws.OperacionesCrudMaestro port = service.getOperacionesCrudMaestroPort();
        return port.readsProfesores();
    }

    private static String updateProfesor(ws.Profesor profesor) {
        ws.OperacionesCrud service = new ws.OperacionesCrud();
        ws.OperacionesCrudMaestro port = service.getOperacionesCrudMaestroPort();
        return port.updateProfesor(profesor);
    }

    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

}
