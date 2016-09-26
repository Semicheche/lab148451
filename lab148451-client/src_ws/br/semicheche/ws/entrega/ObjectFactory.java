
package br.semicheche.ws.entrega;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.semicheche.ws.entrega package. 
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

    private final static QName _EntregaResponse_QNAME = new QName("http://webservices.semicheche.br/", "entregaResponse");
    private final static QName _Entrega_QNAME = new QName("http://webservices.semicheche.br/", "entrega");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.semicheche.ws.entrega
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EntregaResponse }
     * 
     */
    public EntregaResponse createEntregaResponse() {
        return new EntregaResponse();
    }

    /**
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntregaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.semicheche.br/", name = "entregaResponse")
    public JAXBElement<EntregaResponse> createEntregaResponse(EntregaResponse value) {
        return new JAXBElement<EntregaResponse>(_EntregaResponse_QNAME, EntregaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.semicheche.br/", name = "entrega")
    public JAXBElement<Entrega> createEntrega(Entrega value) {
        return new JAXBElement<Entrega>(_Entrega_QNAME, Entrega.class, null, value);
    }

}
