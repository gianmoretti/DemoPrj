
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pspInviaAckRTResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pspInviaAckRTResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pspInviaAckRTResponse" type="{http://ws.pagamenti.telematici.gov/}tipoInviaAckRTResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pspInviaAckRTResponse", propOrder = {
    "pspInviaAckRTResponse"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class PspInviaAckRTResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected TipoInviaAckRTResponse pspInviaAckRTResponse;

    /**
     * Recupera il valore della proprietà pspInviaAckRTResponse.
     * 
     * @return
     *     possible object is
     *     {@link TipoInviaAckRTResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public TipoInviaAckRTResponse getPspInviaAckRTResponse() {
        return pspInviaAckRTResponse;
    }

    /**
     * Imposta il valore della proprietà pspInviaAckRTResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInviaAckRTResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setPspInviaAckRTResponse(TipoInviaAckRTResponse value) {
        this.pspInviaAckRTResponse = value;
    }

}
