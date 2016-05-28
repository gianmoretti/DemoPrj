
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per paaInviaRTRisposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="paaInviaRTRisposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paaInviaRTRisposta" type="{http://ws.pagamenti.telematici.gov/}esitoPaaInviaRT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paaInviaRTRisposta", propOrder = {
    "paaInviaRTRisposta"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
public class PaaInviaRTRisposta {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    protected EsitoPaaInviaRT paaInviaRTRisposta;

    /**
     * Recupera il valore della proprietà paaInviaRTRisposta.
     * 
     * @return
     *     possible object is
     *     {@link EsitoPaaInviaRT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public EsitoPaaInviaRT getPaaInviaRTRisposta() {
        return paaInviaRTRisposta;
    }

    /**
     * Imposta il valore della proprietà paaInviaRTRisposta.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitoPaaInviaRT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public void setPaaInviaRTRisposta(EsitoPaaInviaRT value) {
        this.paaInviaRTRisposta = value;
    }

}
