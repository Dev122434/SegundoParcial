package modelo.beans;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.ConexionBD;
import modelo.pojos.Profesor;

@ManagedBean
@ViewScoped
public class ProfesorBean {

    private Profesor profesor = new Profesor();
    private List<Profesor> listaProfesores = new ArrayList<>();

    public boolean agregarProfesor() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_agregar_profesor(?,?,?)}");
                sentencia.setString(1, this.profesor.getClave());
                sentencia.setString(2, this.profesor.getNombre());
                sentencia.setString(3, this.profesor.getTitulo());

                sentencia.execute();
            } catch (SQLException e) {
                System.out.println("Error SQL:" + e);
                estado = false;
            }
        } else {
            estado = false;
        }

        ConexionBD.cerrarConexionBD();
        return estado;
    }

    public boolean buscarProfesor() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_buscar_profesor(?)}");
                sentencia.setString(1, this.profesor.getClave());

                ResultSet consulta = sentencia.executeQuery();

                if (consulta.next()) {//Existe al menos un registro
                    //this.alumno.setMatricula(consulta.getString("matricula"));
                    this.profesor.setNombre(consulta.getString("nombre"));
                    this.profesor.setTitulo(consulta.getString("titulo"));
                } else { //No existen registros en la consulta
                    System.out.println("No existen registros");
                    estado = false;
                }
            } catch (SQLException e) {
                System.out.println("Error SQL:" + e);
                estado = false;
            }
        } else {
            estado = false;
        }

        ConexionBD.cerrarConexionBD();
        return estado;
    }

    public boolean modificarProfesor() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_modificar_profesor(?,?,?,?)}");
                sentencia.setString(1, this.profesor.getClave());
                sentencia.setString(2, this.profesor.getNombre());
                sentencia.setString(3, this.profesor.getTitulo());
                sentencia.execute();
            } catch (SQLException e) {
                System.out.println("Error SQL:" + e);
                estado = false;
            }
        } else {
            estado = false;
        }

        ConexionBD.cerrarConexionBD();
        return estado;
    }

    public boolean eliminarProfesor() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_eliminar_profesor(?)}");
                sentencia.setString(1, this.profesor.getClave());

                sentencia.execute();
            } catch (SQLException e) {
                System.out.println("Error SQL:" + e);
                estado = false;
            }
        } else {
            estado = false;
        }

        ConexionBD.cerrarConexionBD();
        return estado;
    }

    public void limpiarFormulario() {
        this.profesor = new Profesor();
    }

    public boolean listarProfesores() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_listar_maestros()}");

                ResultSet consulta = sentencia.executeQuery();

                this.listaProfesores = new ArrayList<>();
                
                while (consulta.next()) {//Recorre todos los registros de la consulta
                    Profesor item = new Profesor();
                    
                    item.setClave(consulta.getString("clave"));
                    item.setNombre(consulta.getString("nombre"));
                    item.setTitulo(consulta.getString("titulo"));
                    
                    this.listaProfesores.add(item);
                } 
            } catch (SQLException e) {
                System.out.println("Error SQL:" + e);
                estado = false;
            }
        } else {
            estado = false;
        }

        ConexionBD.cerrarConexionBD();
        return estado;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(List<Profesor> listaProfesores) {
        this.listaProfesores= listaProfesores;
    }
}
