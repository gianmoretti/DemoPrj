
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pspInviaCarrelloRPTResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pspInviaCarrelloRPTResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pspInviaCarrelloRPTResponse" type="{http://ws.pagamenti.telematici.gov/}esitoPspInviaCarrelloRPT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pspInviaCarrelloRPTResponse", propOrder = {
    "pspInviaCarrelloRPTResponse"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class PspInviaCarrelloRPTResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected EsitoPspInviaCarrelloRPT pspInviaCarrelloRPTResponse;

    /**
     * Recupera il valore della proprietà pspInviaCarrelloRPTResponse.
     * 
     * @return
     *     possible object is
     *     {@link EsitoPspInviaCarrelloRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public EsitoPspInviaCarrelloRPT getPspInviaCarrelloRPTResponse() {
        return pspInviaCarrelloRPTResponse;
    }

    /**
     * Imposta il valore della proprietà pspInviaCarrelloRPTResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitoPspInviaCarrelloRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setPspInviaCarrelloRPTResponse(EsitoPspInviaCarrelloRPT value) {
        this.pspInviaCarrelloRPTResponse = value;
    }

}
