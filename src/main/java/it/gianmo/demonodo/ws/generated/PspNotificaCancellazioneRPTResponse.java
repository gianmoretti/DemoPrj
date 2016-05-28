
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pspNotificaCancellazioneRPTResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pspNotificaCancellazioneRPTResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pspNotificaCancellazioneRPTResponse" type="{http://ws.pagamenti.telematici.gov/}valoreNotificaCancellazioneRPT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pspNotificaCancellazioneRPTResponse", propOrder = {
    "pspNotificaCancellazioneRPTResponse"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class PspNotificaCancellazioneRPTResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected ValoreNotificaCancellazioneRPT pspNotificaCancellazioneRPTResponse;

    /**
     * Recupera il valore della proprietà pspNotificaCancellazioneRPTResponse.
     * 
     * @return
     *     possible object is
     *     {@link ValoreNotificaCancellazioneRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public ValoreNotificaCancellazioneRPT getPspNotificaCancellazioneRPTResponse() {
        return pspNotificaCancellazioneRPTResponse;
    }

    /**
     * Imposta il valore della proprietà pspNotificaCancellazioneRPTResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ValoreNotificaCancellazioneRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setPspNotificaCancellazioneRPTResponse(ValoreNotificaCancellazioneRPT value) {
        this.pspNotificaCancellazioneRPTResponse = value;
    }

}
