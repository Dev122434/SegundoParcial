
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AccederUsuario_QNAME = new QName("http://ws/", "accederUsuario");
    private final static QName _AccederUsuarioResponse_QNAME = new QName("http://ws/", "accederUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccederUsuario }
     * 
     */
    public AccederUsuario createAccederUsuario() {
        return new AccederUsuario();
    }

    /**
     * Create an instance of {@link AccederUsuarioResponse }
     * 
     */
    public AccederUsuarioResponse createAccederUsuarioResponse() {
        return new AccederUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccederUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "accederUsuario")
    public JAXBElement<AccederUsuario> createAccederUsuario(AccederUsuario value) {
        return new JAXBElement<AccederUsuario>(_AccederUsuario_QNAME, AccederUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccederUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "accederUsuarioResponse")
    public JAXBElement<AccederUsuarioResponse> createAccederUsuarioResponse(AccederUsuarioResponse value) {
        return new JAXBElement<AccederUsuarioResponse>(_AccederUsuarioResponse_QNAME, AccederUsuarioResponse.class, null, value);
    }

}
