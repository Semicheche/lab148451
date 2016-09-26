
package br.semicheche.ws.venda;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.semicheche.ws.venda package. 
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

    private final static QName _Venda_QNAME = new QName("http://webservices.semicheche.br/", "Venda");
    private final static QName _VendaResponse_QNAME = new QName("http://webservices.semicheche.br/", "VendaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.semicheche.ws.venda
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VendaResponse }
     * 
     */
    public VendaResponse createVendaResponse() {
        return new VendaResponse();
    }

    /**
     * Create an instance of {@link Venda }
     * 
     */
    public Venda createVenda() {
        return new Venda();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Venda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.semicheche.br/", name = "Venda")
    public JAXBElement<Venda> createVenda(Venda value) {
        return new JAXBElement<Venda>(_Venda_QNAME, Venda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.semicheche.br/", name = "VendaResponse")
    public JAXBElement<VendaResponse> createVendaResponse(VendaResponse value) {
        return new JAXBElement<VendaResponse>(_VendaResponse_QNAME, VendaResponse.class, null, value);
    }

}
