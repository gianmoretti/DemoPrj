
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pspChiediAvanzamentoRPTResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pspChiediAvanzamentoRPTResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pspChiediAvanzamentoRPTResponse" type="{http://ws.pagamenti.telematici.gov/}valoreAvanzamentoRPT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pspChiediAvanzamentoRPTResponse", propOrder = {
    "pspChiediAvanzamentoRPTResponse"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class PspChiediAvanzamentoRPTResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected ValoreAvanzamentoRPT pspChiediAvanzamentoRPTResponse;

    /**
     * Recupera il valore della proprietà pspChiediAvanzamentoRPTResponse.
     * 
     * @return
     *     possible object is
     *     {@link ValoreAvanzamentoRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public ValoreAvanzamentoRPT getPspChiediAvanzamentoRPTResponse() {
        return pspChiediAvanzamentoRPTResponse;
    }

    /**
     * Imposta il valore della proprietà pspChiediAvanzamentoRPTResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ValoreAvanzamentoRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setPspChiediAvanzamentoRPTResponse(ValoreAvanzamentoRPT value) {
        this.pspChiediAvanzamentoRPTResponse = value;
    }

}
