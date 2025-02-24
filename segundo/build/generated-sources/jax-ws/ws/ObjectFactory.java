
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

    private final static QName _ReadAlumnoResponse_QNAME = new QName("http://ws/", "readAlumnoResponse");
    private final static QName _CreateAlumno_QNAME = new QName("http://ws/", "createAlumno");
    private final static QName _DeleteAlumno_QNAME = new QName("http://ws/", "deleteAlumno");
    private final static QName _ReadAlumno_QNAME = new QName("http://ws/", "readAlumno");
    private final static QName _UpdateAlumno_QNAME = new QName("http://ws/", "updateAlumno");
    private final static QName _UpdateAlumnoResponse_QNAME = new QName("http://ws/", "updateAlumnoResponse");
    private final static QName _ReadsProfesores_QNAME = new QName("http://ws/", "readsProfesores");
    private final static QName _ReadsProfesoresResponse_QNAME = new QName("http://ws/", "readsProfesoresResponse");
    private final static QName _DeleteAlumnoResponse_QNAME = new QName("http://ws/", "deleteAlumnoResponse");
    private final static QName _CreateAlumnoResponse_QNAME = new QName("http://ws/", "createAlumnoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadAlumnoResponse }
     * 
     */
    public ReadAlumnoResponse createReadAlumnoResponse() {
        return new ReadAlumnoResponse();
    }

    /**
     * Create an instance of {@link CreateAlumno }
     * 
     */
    public CreateAlumno createCreateAlumno() {
        return new CreateAlumno();
    }

    /**
     * Create an instance of {@link DeleteAlumno }
     * 
     */
    public DeleteAlumno createDeleteAlumno() {
        return new DeleteAlumno();
    }

    /**
     * Create an instance of {@link ReadAlumno }
     * 
     */
    public ReadAlumno createReadAlumno() {
        return new ReadAlumno();
    }

    /**
     * Create an instance of {@link UpdateAlumno }
     * 
     */
    public UpdateAlumno createUpdateAlumno() {
        return new UpdateAlumno();
    }

    /**
     * Create an instance of {@link UpdateAlumnoResponse }
     * 
     */
    public UpdateAlumnoResponse createUpdateAlumnoResponse() {
        return new UpdateAlumnoResponse();
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
     * Create an instance of {@link DeleteAlumnoResponse }
     * 
     */
    public DeleteAlumnoResponse createDeleteAlumnoResponse() {
        return new DeleteAlumnoResponse();
    }

    /**
     * Create an instance of {@link CreateAlumnoResponse }
     * 
     */
    public CreateAlumnoResponse createCreateAlumnoResponse() {
        return new CreateAlumnoResponse();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readAlumnoResponse")
    public JAXBElement<ReadAlumnoResponse> createReadAlumnoResponse(ReadAlumnoResponse value) {
        return new JAXBElement<ReadAlumnoResponse>(_ReadAlumnoResponse_QNAME, ReadAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createAlumno")
    public JAXBElement<CreateAlumno> createCreateAlumno(CreateAlumno value) {
        return new JAXBElement<CreateAlumno>(_CreateAlumno_QNAME, CreateAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteAlumno")
    public JAXBElement<DeleteAlumno> createDeleteAlumno(DeleteAlumno value) {
        return new JAXBElement<DeleteAlumno>(_DeleteAlumno_QNAME, DeleteAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "readAlumno")
    public JAXBElement<ReadAlumno> createReadAlumno(ReadAlumno value) {
        return new JAXBElement<ReadAlumno>(_ReadAlumno_QNAME, ReadAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateAlumno")
    public JAXBElement<UpdateAlumno> createUpdateAlumno(UpdateAlumno value) {
        return new JAXBElement<UpdateAlumno>(_UpdateAlumno_QNAME, UpdateAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "updateAlumnoResponse")
    public JAXBElement<UpdateAlumnoResponse> createUpdateAlumnoResponse(UpdateAlumnoResponse value) {
        return new JAXBElement<UpdateAlumnoResponse>(_UpdateAlumnoResponse_QNAME, UpdateAlumnoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "deleteAlumnoResponse")
    public JAXBElement<DeleteAlumnoResponse> createDeleteAlumnoResponse(DeleteAlumnoResponse value) {
        return new JAXBElement<DeleteAlumnoResponse>(_DeleteAlumnoResponse_QNAME, DeleteAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "createAlumnoResponse")
    public JAXBElement<CreateAlumnoResponse> createCreateAlumnoResponse(CreateAlumnoResponse value) {
        return new JAXBElement<CreateAlumnoResponse>(_CreateAlumnoResponse_QNAME, CreateAlumnoResponse.class, null, value);
    }

}
