/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

/**
 *
 * @author 5-12
 */
public class TestLoginWs {
    
    public boolean acceder(String user, String password) {
        return accederUsuario(user, password);
    }

    private static boolean accederUsuario(java.lang.String user, java.lang.String password) {
        ws.LoginWs_Service service = new ws.LoginWs_Service();
        ws.LoginWs port = service.getLoginWsPort();
        return port.accederUsuario(user, password);
    }
    
    
}