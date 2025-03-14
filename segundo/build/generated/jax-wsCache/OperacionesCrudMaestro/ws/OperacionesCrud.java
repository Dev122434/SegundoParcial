
package ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OperacionesCrud", targetNamespace = "http://ws/", wsdlLocation = "http://10.0.89.252:8080/OperacionesCrud/OperacionesCrudMaestro?WSDL")
public class OperacionesCrud
    extends Service
{

    private final static URL OPERACIONESCRUD_WSDL_LOCATION;
    private final static WebServiceException OPERACIONESCRUD_EXCEPTION;
    private final static QName OPERACIONESCRUD_QNAME = new QName("http://ws/", "OperacionesCrud");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.0.89.252:8080/OperacionesCrud/OperacionesCrudMaestro?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERACIONESCRUD_WSDL_LOCATION = url;
        OPERACIONESCRUD_EXCEPTION = e;
    }

    public OperacionesCrud() {
        super(__getWsdlLocation(), OPERACIONESCRUD_QNAME);
    }

    public OperacionesCrud(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERACIONESCRUD_QNAME, features);
    }

    public OperacionesCrud(URL wsdlLocation) {
        super(wsdlLocation, OPERACIONESCRUD_QNAME);
    }

    public OperacionesCrud(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERACIONESCRUD_QNAME, features);
    }

    public OperacionesCrud(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OperacionesCrud(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperacionesCrudMaestro
     */
    @WebEndpoint(name = "OperacionesCrudMaestroPort")
    public OperacionesCrudMaestro getOperacionesCrudMaestroPort() {
        return super.getPort(new QName("http://ws/", "OperacionesCrudMaestroPort"), OperacionesCrudMaestro.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperacionesCrudMaestro
     */
    @WebEndpoint(name = "OperacionesCrudMaestroPort")
    public OperacionesCrudMaestro getOperacionesCrudMaestroPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "OperacionesCrudMaestroPort"), OperacionesCrudMaestro.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERACIONESCRUD_EXCEPTION!= null) {
            throw OPERACIONESCRUD_EXCEPTION;
        }
        return OPERACIONESCRUD_WSDL_LOCATION;
    }

}
