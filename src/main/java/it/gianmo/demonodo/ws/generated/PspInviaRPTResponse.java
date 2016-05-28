
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pspInviaRPTResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pspInviaRPTResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pspInviaRPTResponse" type="{http://ws.pagamenti.telematici.gov/}esitoPspInviaRPT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pspInviaRPTResponse", propOrder = {
    "pspInviaRPTResponse"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class PspInviaRPTResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected EsitoPspInviaRPT pspInviaRPTResponse;

    /**
     * Recupera il valore della proprietà pspInviaRPTResponse.
     * 
     * @return
     *     possible object is
     *     {@link EsitoPspInviaRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public EsitoPspInviaRPT getPspInviaRPTResponse() {
        return pspInviaRPTResponse;
    }

    /**
     * Imposta il valore della proprietà pspInviaRPTResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitoPspInviaRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setPspInviaRPTResponse(EsitoPspInviaRPT value) {
        this.pspInviaRPTResponse = value;
    }

}
