
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pspChiediListaRTResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pspChiediListaRTResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pspChiediListaRTResponse" type="{http://ws.pagamenti.telematici.gov/}chiediListaRTResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pspChiediListaRTResponse", propOrder = {
    "pspChiediListaRTResponse"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class PspChiediListaRTResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected ChiediListaRTResponse pspChiediListaRTResponse;

    /**
     * Recupera il valore della proprietà pspChiediListaRTResponse.
     * 
     * @return
     *     possible object is
     *     {@link ChiediListaRTResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public ChiediListaRTResponse getPspChiediListaRTResponse() {
        return pspChiediListaRTResponse;
    }

    /**
     * Imposta il valore della proprietà pspChiediListaRTResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ChiediListaRTResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setPspChiediListaRTResponse(ChiediListaRTResponse value) {
        this.pspChiediListaRTResponse = value;
    }

}
