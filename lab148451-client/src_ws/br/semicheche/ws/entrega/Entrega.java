
package br.semicheche.ws.entrega;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entrega complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endereco_entrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_entrega" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entrega", propOrder = {
    "enderecoEntrega",
    "idEntrega"
})
public class Entrega {

    @XmlElement(name = "endereco_entrega")
    protected String enderecoEntrega;
    @XmlElement(name = "id_entrega")
    protected int idEntrega;

    /**
     * Gets the value of the enderecoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    /**
     * Sets the value of the enderecoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoEntrega(String value) {
        this.enderecoEntrega = value;
    }

    /**
     * Gets the value of the idEntrega property.
     * 
     */
    public int getIdEntrega() {
        return idEntrega;
    }

    /**
     * Sets the value of the idEntrega property.
     * 
     */
    public void setIdEntrega(int value) {
        this.idEntrega = value;
    }

}
