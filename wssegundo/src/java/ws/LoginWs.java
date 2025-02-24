package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import modelo.beans.UsuarioBean;
import modelo.pojos.Usuario;

@WebService(serviceName = "LoginWs")
@Stateless()
public class LoginWs {

    /**
     * Web service operation
     * @param user
     * @param password
     * @return 
     */
    @WebMethod(operationName = "accederUsuario")
    public boolean accederUsuario(@WebParam(name = "user") String user, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        Usuario usuario = new Usuario();
        usuario.setNickname(user);
        usuario.setPassword(password);
        
        UsuarioBean usuarioBean = new UsuarioBean();
        usuarioBean.setUsuario(usuario);
        
        return usuarioBean.verificarAcceso();
    }
    
    


    
    
    
    
}
