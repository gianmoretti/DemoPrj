
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pspInviaRichiestaStornoResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pspInviaRichiestaStornoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pspInviaRichiestaStornoResponse" type="{http://ws.pagamenti.telematici.gov/}tipoInviaRichiestaStornoResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pspInviaRichiestaStornoResponse", propOrder = {
    "pspInviaRichiestaStornoResponse"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class PspInviaRichiestaStornoResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected TipoInviaRichiestaStornoResponse pspInviaRichiestaStornoResponse;

    /**
     * Recupera il valore della proprietà pspInviaRichiestaStornoResponse.
     * 
     * @return
     *     possible object is
     *     {@link TipoInviaRichiestaStornoResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public TipoInviaRichiestaStornoResponse getPspInviaRichiestaStornoResponse() {
        return pspInviaRichiestaStornoResponse;
    }

    /**
     * Imposta il valore della proprietà pspInviaRichiestaStornoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInviaRichiestaStornoResponse }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setPspInviaRichiestaStornoResponse(TipoInviaRichiestaStornoResponse value) {
        this.pspInviaRichiestaStornoResponse = value;
    }

}
