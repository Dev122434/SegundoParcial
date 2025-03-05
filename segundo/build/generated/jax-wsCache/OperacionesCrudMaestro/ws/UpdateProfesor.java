
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para updateProfesor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateProfesor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profesor" type="{http://ws/}profesor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateProfesor", propOrder = {
    "profesor"
})
public class UpdateProfesor {

    protected Profesor profesor;

    /**
     * Obtiene el valor de la propiedad profesor.
     * 
     * @return
     *     possible object is
     *     {@link Profesor }
     *     
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Define el valor de la propiedad profesor.
     * 
     * @param value
     *     allowed object is
     *     {@link Profesor }
     *     
     */
    public void setProfesor(Profesor value) {
        this.profesor = value;
    }

}
