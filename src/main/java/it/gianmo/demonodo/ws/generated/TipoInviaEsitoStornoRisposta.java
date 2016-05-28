
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoInviaEsitoStornoRisposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoInviaEsitoStornoRisposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.pagamenti.telematici.gov/}risposta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInviaEsitoStornoRisposta", propOrder = {
    "esito"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
public class TipoInviaEsitoStornoRisposta
    extends it.gianmo.demonodo.ws.generated.Risposta
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    protected String esito;

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public String getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public void setEsito(String value) {
        this.esito = value;
    }

}
