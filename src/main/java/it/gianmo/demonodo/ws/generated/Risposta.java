
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per risposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="risposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fault" type="{http://ws.pagamenti.telematici.gov/}faultBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "risposta", propOrder = {
    "fault"
})
@XmlSeeAlso({
    NodoChiediCopiaRTRisposta.class,
    NodoInviaRichiestaStornoRisposta.class,
    NodoChiediListaPendentiRPTRisposta.class,
    NodoChiediStatoRPTRisposta.class,
    NodoInviaRPTRisposta.class,
    NodoInviaCarrelloRPTRisposta.class,
    NodoChiediInformativaPSPRisposta.class,
    NodoChiediElencoQuadraturePARisposta.class,
    NodoChiediQuadraturaPARisposta.class,
    NodoChiediElencoFlussiRendicontazioneRisposta.class,
    NodoChiediFlussoRendicontazioneRisposta.class,
    NodoChiediSceltaWISPRisposta.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
public class Risposta {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    protected FaultBean fault;

    /**
     * Recupera il valore della proprietà fault.
     * 
     * @return
     *     possible object is
     *     {@link FaultBean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public FaultBean getFault() {
        return fault;
    }

    /**
     * Imposta il valore della proprietà fault.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultBean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public void setFault(FaultBean value) {
        this.fault = value;
    }

}
