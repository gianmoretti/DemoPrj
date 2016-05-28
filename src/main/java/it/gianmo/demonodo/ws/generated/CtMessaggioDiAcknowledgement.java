
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ctMessaggioDiAcknowledgement complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ctMessaggioDiAcknowledgement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificativoACK" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stIdentificativoMessaggio"/&gt;
 *         &lt;element name="dataOraACK" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stISODateTime"/&gt;
 *         &lt;element name="mittenteACK" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stMittenteMessaggio"/&gt;
 *         &lt;element name="datiMessaggioReferenziato" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}ctDatiMessaggioReferenziato"/&gt;
 *         &lt;element name="informazioniStatoMessaggioReferenziato" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}ctStatoDelMessaggioReferenziato"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctMessaggioDiAcknowledgement", propOrder = {
    "identificativoACK",
    "dataOraACK",
    "mittenteACK",
    "datiMessaggioReferenziato",
    "informazioniStatoMessaggioReferenziato"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class CtMessaggioDiAcknowledgement {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoACK;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar dataOraACK;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String mittenteACK;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected CtDatiMessaggioReferenziato datiMessaggioReferenziato;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected CtStatoDelMessaggioReferenziato informazioniStatoMessaggioReferenziato;

    /**
     * Recupera il valore della proprietà identificativoACK.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoACK() {
        return identificativoACK;
    }

    /**
     * Imposta il valore della proprietà identificativoACK.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoACK(String value) {
        this.identificativoACK = value;
    }

    /**
     * Recupera il valore della proprietà dataOraACK.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getDataOraACK() {
        return dataOraACK;
    }

    /**
     * Imposta il valore della proprietà dataOraACK.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setDataOraACK(XMLGregorianCalendar value) {
        this.dataOraACK = value;
    }

    /**
     * Recupera il valore della proprietà mittenteACK.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getMittenteACK() {
        return mittenteACK;
    }

    /**
     * Imposta il valore della proprietà mittenteACK.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setMittenteACK(String value) {
        this.mittenteACK = value;
    }

    /**
     * Recupera il valore della proprietà datiMessaggioReferenziato.
     * 
     * @return
     *     possible object is
     *     {@link CtDatiMessaggioReferenziato }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public CtDatiMessaggioReferenziato getDatiMessaggioReferenziato() {
        return datiMessaggioReferenziato;
    }

    /**
     * Imposta il valore della proprietà datiMessaggioReferenziato.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDatiMessaggioReferenziato }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setDatiMessaggioReferenziato(CtDatiMessaggioReferenziato value) {
        this.datiMessaggioReferenziato = value;
    }

    /**
     * Recupera il valore della proprietà informazioniStatoMessaggioReferenziato.
     * 
     * @return
     *     possible object is
     *     {@link CtStatoDelMessaggioReferenziato }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public CtStatoDelMessaggioReferenziato getInformazioniStatoMessaggioReferenziato() {
        return informazioniStatoMessaggioReferenziato;
    }

    /**
     * Imposta il valore della proprietà informazioniStatoMessaggioReferenziato.
     * 
     * @param value
     *     allowed object is
     *     {@link CtStatoDelMessaggioReferenziato }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setInformazioniStatoMessaggioReferenziato(CtStatoDelMessaggioReferenziato value) {
        this.informazioniStatoMessaggioReferenziato = value;
    }

}
