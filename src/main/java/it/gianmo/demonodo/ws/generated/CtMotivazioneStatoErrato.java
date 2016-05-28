
package it.gianmo.demonodo.ws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ctMotivazioneStatoErrato complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ctMotivazioneStatoErrato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codiceErrore" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stCodiceErrore"/&gt;
 *         &lt;element name="elementoReferenziato" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stElementoReferenziato" minOccurs="0"/&gt;
 *         &lt;element name="InformazioniAggiuntive" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stInformazioniAggiuntive" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctMotivazioneStatoErrato", propOrder = {
    "codiceErrore",
    "elementoReferenziato",
    "informazioniAggiuntive"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class CtMotivazioneStatoErrato {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String codiceErrore;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String elementoReferenziato;
    @XmlElement(name = "InformazioniAggiuntive")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected List<String> informazioniAggiuntive;

    /**
     * Recupera il valore della proprietà codiceErrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getCodiceErrore() {
        return codiceErrore;
    }

    /**
     * Imposta il valore della proprietà codiceErrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setCodiceErrore(String value) {
        this.codiceErrore = value;
    }

    /**
     * Recupera il valore della proprietà elementoReferenziato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getElementoReferenziato() {
        return elementoReferenziato;
    }

    /**
     * Imposta il valore della proprietà elementoReferenziato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setElementoReferenziato(String value) {
        this.elementoReferenziato = value;
    }

    /**
     * Gets the value of the informazioniAggiuntive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informazioniAggiuntive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformazioniAggiuntive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public List<String> getInformazioniAggiuntive() {
        if (informazioniAggiuntive == null) {
            informazioniAggiuntive = new ArrayList<String>();
        }
        return this.informazioniAggiuntive;
    }

}
