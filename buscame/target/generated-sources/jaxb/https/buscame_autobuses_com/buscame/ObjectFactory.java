//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.16 a las 11:59:24 PM CDT 
//


package https.buscame_autobuses_com.buscame;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.buscame_autobuses_com.buscame package. 
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

    private final static QName _ListarCarrosRequest_QNAME = new QName("https://buscame.autobuses.com/buscame", "ListarCarrosRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.buscame_autobuses_com.buscame
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarCarrosResponse }
     * 
     */
    public ListarCarrosResponse createListarCarrosResponse() {
        return new ListarCarrosResponse();
    }

    /**
     * Create an instance of {@link CrearRequest }
     * 
     */
    public CrearRequest createCrearRequest() {
        return new CrearRequest();
    }

    /**
     * Create an instance of {@link CrearResponse }
     * 
     */
    public CrearResponse createCrearResponse() {
        return new CrearResponse();
    }

    /**
     * Create an instance of {@link ListarCarrosResponse.Carro }
     * 
     */
    public ListarCarrosResponse.Carro createListarCarrosResponseCarro() {
        return new ListarCarrosResponse.Carro();
    }

    /**
     * Create an instance of {@link QuitarCarroRequest }
     * 
     */
    public QuitarCarroRequest createQuitarCarroRequest() {
        return new QuitarCarroRequest();
    }

    /**
     * Create an instance of {@link QuitarCarroResponse }
     * 
     */
    public QuitarCarroResponse createQuitarCarroResponse() {
        return new QuitarCarroResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://buscame.autobuses.com/buscame", name = "ListarCarrosRequest")
    public JAXBElement<Object> createListarCarrosRequest(Object value) {
        return new JAXBElement<Object>(_ListarCarrosRequest_QNAME, Object.class, null, value);
    }

}
