package modelo.beans;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.ConexionBD;
import modelo.pojos.Alumno;

@ManagedBean
@ViewScoped
public class AlumnoBean {

    private Alumno alumno = new Alumno();
    private List<Alumno> listaAlumnos = new ArrayList<>();

    public boolean agregarAlumno() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_agregar_alumno(?,?,?, ?)}");
                sentencia.setString(1, this.alumno.getMatricula());
                sentencia.setString(2, this.alumno.getNombre());
                sentencia.setInt(3, this.alumno.getEdad());
                sentencia.setString(4, this.alumno.getTelefono());

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

    public boolean buscarAlumno() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_buscar_alumno(?)}");
                sentencia.setString(1, this.alumno.getMatricula());

                ResultSet consulta = sentencia.executeQuery();

                if (consulta.next()) {//Existe al menos un registro
                    //this.alumno.setMatricula(consulta.getString("matricula"));
                    this.alumno.setNombre(consulta.getString("nombre"));
                    this.alumno.setTelefono(consulta.getString("telefono"));
                    this.alumno.setEdad(consulta.getInt("edad"));
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

    public boolean modificarAlumno() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_modificar_alumno(?,?,?,?)}");
                sentencia.setString(1, this.alumno.getMatricula());
                sentencia.setString(2, this.alumno.getNombre());
                sentencia.setInt(3, this.alumno.getEdad());
                sentencia.setString(4, this.alumno.getTelefono());
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

    public boolean eliminarAlumno() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_eliminar_alumno(?)}");
                sentencia.setString(1, this.alumno.getMatricula());

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

    public boolean listarAlumnos() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call catalogos.fn_listar_alumnos()}");

                ResultSet consulta = sentencia.executeQuery();

                this.listaAlumnos = new ArrayList<>();
                
                while (consulta.next()) {//Recorre todos los registros de la consulta
                    Alumno item = new Alumno();
                    
                    item.setMatricula(consulta.getString("matricula"));
                    item.setNombre(consulta.getString("nombre"));
                    item.setEdad(consulta.getInt("edad"));
                    item.setTelefono(consulta.getString("telefono"));
                    
                    this.listaAlumnos.add(item);
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

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
}
