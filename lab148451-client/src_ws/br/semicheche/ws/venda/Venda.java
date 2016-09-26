
package br.semicheche.ws.venda;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Venda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Venda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaVenda" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id_venda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descricao_venda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor_venda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Venda", propOrder = {
    "listaVenda",
    "idVenda",
    "descricaoVenda",
    "valorVenda"
})
public class Venda {

    protected List<String> listaVenda;
    @XmlElement(name = "id_venda")
    protected int idVenda;
    @XmlElement(name = "descricao_venda")
    protected String descricaoVenda;
    @XmlElement(name = "valor_venda")
    protected BigDecimal valorVenda;

    /**
     * Gets the value of the listaVenda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaVenda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaVenda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaVenda() {
        if (listaVenda == null) {
            listaVenda = new ArrayList<String>();
        }
        return this.listaVenda;
    }

    /**
     * Gets the value of the idVenda property.
     * 
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * Sets the value of the idVenda property.
     * 
     */
    public void setIdVenda(int value) {
        this.idVenda = value;
    }

    /**
     * Gets the value of the descricaoVenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    /**
     * Sets the value of the descricaoVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoVenda(String value) {
        this.descricaoVenda = value;
    }

    /**
     * Gets the value of the valorVenda property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    /**
     * Sets the value of the valorVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorVenda(BigDecimal value) {
        this.valorVenda = value;
    }

}
