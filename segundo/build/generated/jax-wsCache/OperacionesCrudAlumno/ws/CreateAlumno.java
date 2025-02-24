
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createAlumno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createAlumno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alumno" type="{http://ws/}alumno" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAlumno", propOrder = {
    "alumno"
})
public class CreateAlumno {

    protected Alumno alumno;

    /**
     * Obtiene el valor de la propiedad alumno.
     * 
     * @return
     *     possible object is
     *     {@link Alumno }
     *     
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * Define el valor de la propiedad alumno.
     * 
     * @param value
     *     allowed object is
     *     {@link Alumno }
     *     
     */
    public void setAlumno(Alumno value) {
        this.alumno = value;
    }

}
