
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

    private final static QName _ReadProfesor_QNAME = new QName("http://ws/", "readProfesor");
    private final static QName _DeleteProfesorResponse_QNAME = new QName("http://ws/", "deleteProfesorResponse");
    private final static QName _DeleteProfesor_QNAME = new QName("http://ws/", "deleteProfesor");
    private final static QName _CreateProfesor_QNAME = new QName("http://ws/", "createProfesor");
    private final static QName _UpdateProfesorResponse_QNAME = new QName("http://ws/", "updateProfesorResponse");
    private final static QName _ReadProfesorResponse_QNAME = new QName("http://ws/", "readProfesorResponse");
    private final static QName _CreateProfesorResponse_QNAME = new QName("http://ws/", "createProfesorResponse");
    private final static QName _ReadsProfesores_QNAME = new QName("http://ws/", "readsProfesores");
    private final static QName _ReadsProfesoresResponse_QNAME = new QName("http://ws/", "readsProfesoresResponse");
    private final static QName _UpdateProfesor_QNAME = new QName("http://ws/", "updateProfesor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadProfesor }
     * 
     */
    public ReadProfesor createReadProfesor() {
        return new ReadProfesor();
    }

    /**
     * Create an instance of {@link DeleteProfesorResponse }
     * 
     */
    public DeleteProfesorResponse createDeleteProfesorResponse() {
        return new DeleteProfesorResponse();
    }

    /**
     * Create an instance of {@link DeleteProfesor }
     * 
     */
    public DeleteProfesor createDeleteProfesor() {
        return new DeleteProfesor();
    }

    /**
     * Create an instance of {@link CreateProfesor }
     * 
     */
    public CreateProfesor createCreateProfesor() {
        return new CreateProfesor();
    }

    /**
     * Create an instance of {@link UpdateProfesorResponse }
     * 
     */
    public UpdateProfesorResponse createUpdateProfesorResponse() {
        return new UpdateProfesorResponse();
    }

    /**
     * Create an instance of {@link ReadProfesorResponse }
     * 
     */
    public ReadProfesorResponse createReadProfesorResponse() {
        return new ReadProfesorResponse();
    }

    /**
     * Create an instance of {@link CreateProfesorResponse }
     * 
     */
    public CreateProfesorResponse createCreateProfesorResponse() {
        return new CreateProfesorResponse();
    }

    /**
     * Create an instance of {@link ReadsProfesores }
     * 
     */
    public ReadsProfesores createReadsProfesores() {
        return new ReadsProfesores();
    }

    /**
     * Create an instance of {@link ReadsProfesoresResponse }
     * 
     */
    public ReadsProfesoresResponse createReadsProfesoresResponse() {
        return new ReadsProfesoresResponse();
    }

    /**
     * Create an instance of {@link UpdateProfesor }
     * 
     */
    public UpdateProfesor createUpdateProfesor() {
        return new UpdateProfesor();
    }

    /**
     * Create an instance of {@link Profesor }
     * 
     */
    public Profesor createProfesor() {
        return new Profesor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadProfesor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readProfesor")
    public JAXBElement<ReadProfesor> createReadProfesor(ReadProfesor value) {
        return new JAXBElement<ReadProfesor>(_ReadProfesor_QNAME, ReadProfesor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProfesorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteProfesorResponse")
    public JAXBElement<DeleteProfesorResponse> createDeleteProfesorResponse(DeleteProfesorResponse value) {
        return new JAXBElement<DeleteProfesorResponse>(_DeleteProfesorResponse_QNAME, DeleteProfesorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProfesor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteProfesor")
    public JAXBElement<DeleteProfesor> createDeleteProfesor(DeleteProfesor value) {
        return new JAXBElement<DeleteProfesor>(_DeleteProfesor_QNAME, DeleteProfesor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProfesor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createProfesor")
    public JAXBElement<CreateProfesor> createCreateProfesor(CreateProfesor value) {
        return new JAXBElement<CreateProfesor>(_CreateProfesor_QNAME, CreateProfesor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfesorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateProfesorResponse")
    public JAXBElement<UpdateProfesorResponse> createUpdateProfesorResponse(UpdateProfesorResponse value) {
        return new JAXBElement<UpdateProfesorResponse>(_UpdateProfesorResponse_QNAME, UpdateProfesorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadProfesorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readProfesorResponse")
    public JAXBElement<ReadProfesorResponse> createReadProfesorResponse(ReadProfesorResponse value) {
        return new JAXBElement<ReadProfesorResponse>(_ReadProfesorResponse_QNAME, ReadProfesorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProfesorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createProfesorResponse")
    public JAXBElement<CreateProfesorResponse> createCreateProfesorResponse(CreateProfesorResponse value) {
        return new JAXBElement<CreateProfesorResponse>(_CreateProfesorResponse_QNAME, CreateProfesorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadsProfesores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readsProfesores")
    public JAXBElement<ReadsProfesores> createReadsProfesores(ReadsProfesores value) {
        return new JAXBElement<ReadsProfesores>(_ReadsProfesores_QNAME, ReadsProfesores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadsProfesoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readsProfesoresResponse")
    public JAXBElement<ReadsProfesoresResponse> createReadsProfesoresResponse(ReadsProfesoresResponse value) {
        return new JAXBElement<ReadsProfesoresResponse>(_ReadsProfesoresResponse_QNAME, ReadsProfesoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfesor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateProfesor")
    public JAXBElement<UpdateProfesor> createUpdateProfesor(UpdateProfesor value) {
        return new JAXBElement<UpdateProfesor>(_UpdateProfesor_QNAME, UpdateProfesor.class, null, value);
    }

}
