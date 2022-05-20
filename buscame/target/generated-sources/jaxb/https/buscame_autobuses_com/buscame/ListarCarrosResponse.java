//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.16 a las 11:59:24 PM CDT 
//


package https.buscame_autobuses_com.buscame;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carro" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="ruta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="empresa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="conductor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carro"
})
@XmlRootElement(name = "ListarCarrosResponse")
public class ListarCarrosResponse {

    @XmlElement(required = true)
    protected List<ListarCarrosResponse.Carro> carro;

    /**
     * Gets the value of the carro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListarCarrosResponse.Carro }
     * 
     * 
     */
    public List<ListarCarrosResponse.Carro> getCarro() {
        if (carro == null) {
            carro = new ArrayList<ListarCarrosResponse.Carro>();
        }
        return this.carro;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="ruta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="empresa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="conductor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "ruta",
        "empresa",
        "conductor",
        "placa"
    })
    public static class Carro {

        protected int id;
        @XmlElement(required = true)
        protected String ruta;
        @XmlElement(required = true)
        protected String empresa;
        @XmlElement(required = true)
        protected String conductor;
        @XmlElement(required = true)
        protected String placa;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad ruta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuta() {
            return ruta;
        }

        /**
         * Define el valor de la propiedad ruta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuta(String value) {
            this.ruta = value;
        }

        /**
         * Obtiene el valor de la propiedad empresa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmpresa() {
            return empresa;
        }

        /**
         * Define el valor de la propiedad empresa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmpresa(String value) {
            this.empresa = value;
        }

        /**
         * Obtiene el valor de la propiedad conductor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConductor() {
            return conductor;
        }

        /**
         * Define el valor de la propiedad conductor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConductor(String value) {
            this.conductor = value;
        }

        /**
         * Obtiene el valor de la propiedad placa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaca() {
            return placa;
        }

        /**
         * Define el valor de la propiedad placa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaca(String value) {
            this.placa = value;
        }

    }

}
