
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per paaInviaEsitoStornoRisposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="paaInviaEsitoStornoRisposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paaInviaEsitoStornoRisposta" type="{http://ws.pagamenti.telematici.gov/}tipoInviaEsitoStornoRisposta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paaInviaEsitoStornoRisposta", propOrder = {
    "paaInviaEsitoStornoRisposta"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
public class PaaInviaEsitoStornoRisposta {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    protected TipoInviaEsitoStornoRisposta paaInviaEsitoStornoRisposta;

    /**
     * Recupera il valore della proprietà paaInviaEsitoStornoRisposta.
     * 
     * @return
     *     possible object is
     *     {@link TipoInviaEsitoStornoRisposta }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public TipoInviaEsitoStornoRisposta getPaaInviaEsitoStornoRisposta() {
        return paaInviaEsitoStornoRisposta;
    }

    /**
     * Imposta il valore della proprietà paaInviaEsitoStornoRisposta.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInviaEsitoStornoRisposta }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public void setPaaInviaEsitoStornoRisposta(TipoInviaEsitoStornoRisposta value) {
        this.paaInviaEsitoStornoRisposta = value;
    }

}
