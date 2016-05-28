
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ctStatoDelMessaggioReferenziato complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ctStatoDelMessaggioReferenziato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statoMessaggioReferenziato" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stStatoMessaggio"/&gt;
 *         &lt;element name="motivazioneStatoErrato" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}ctMotivazioneStatoErrato" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctStatoDelMessaggioReferenziato", propOrder = {
    "statoMessaggioReferenziato",
    "motivazioneStatoErrato"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class CtStatoDelMessaggioReferenziato {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected StStatoMessaggio statoMessaggioReferenziato;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected CtMotivazioneStatoErrato motivazioneStatoErrato;

    /**
     * Recupera il valore della proprietà statoMessaggioReferenziato.
     * 
     * @return
     *     possible object is
     *     {@link StStatoMessaggio }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public StStatoMessaggio getStatoMessaggioReferenziato() {
        return statoMessaggioReferenziato;
    }

    /**
     * Imposta il valore della proprietà statoMessaggioReferenziato.
     * 
     * @param value
     *     allowed object is
     *     {@link StStatoMessaggio }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setStatoMessaggioReferenziato(StStatoMessaggio value) {
        this.statoMessaggioReferenziato = value;
    }

    /**
     * Recupera il valore della proprietà motivazioneStatoErrato.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivazioneStatoErrato }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public CtMotivazioneStatoErrato getMotivazioneStatoErrato() {
        return motivazioneStatoErrato;
    }

    /**
     * Imposta il valore della proprietà motivazioneStatoErrato.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivazioneStatoErrato }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setMotivazioneStatoErrato(CtMotivazioneStatoErrato value) {
        this.motivazioneStatoErrato = value;
    }

}
