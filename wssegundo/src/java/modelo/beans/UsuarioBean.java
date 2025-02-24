/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.beans;

import modelo.ConexionBD;
import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import modelo.pojos.Usuario;

/**
 *
 * @author alejandromontesmoreno
 */
@ManagedBean
@SessionScoped
public class UsuarioBean implements Serializable{

    private Usuario usuario = new Usuario();

    public boolean verificarAcceso() {
        boolean estado = true;
        if (ConexionBD.establecerConexionBD()) {
            try {
                CallableStatement sentencia
                        = ConexionBD.getConexion().
                                prepareCall("{call sistema.fn_buscar_usuario(?,?)}");
                sentencia.setString(1, this.usuario.getNickname());
                sentencia.setString(2, this.usuario.getPassword());
                
                ResultSet consulta = sentencia.executeQuery();
                
                if(consulta.next()){//Existe al menos un registro
                    this.usuario.setNombre(consulta.getString("nombre"));
                }else{ //No existen registros en la consulta
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
