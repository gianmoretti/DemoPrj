
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ctDatiMessaggioReferenziato complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ctDatiMessaggioReferenziato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificativoDominio" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stIdentificativoDominio"/&gt;
 *         &lt;element name="identificativoUnivocoVersamento" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stIdentificativoUnivocoVersamento"/&gt;
 *         &lt;element name="codiceContestoPagamento" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stCodiceContestoPagamento"/&gt;
 *         &lt;element name="identificativoMessaggioReferenziato" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stIdentificativoMessaggioReferenziato"/&gt;
 *         &lt;element name="dataOraMessaggioReferenziato" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stISODateTime"/&gt;
 *         &lt;element name="tipologiaMessaggioReferenziato" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stTipologiaMessaggioReferenziato"/&gt;
 *         &lt;element name="mittenteMessaggioReferenziato" type="{http://www.cnipa.gov.it/schemas/2010/Pagamenti/Ack_1_0/}stMittenteMessaggio"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctDatiMessaggioReferenziato", propOrder = {
    "identificativoDominio",
    "identificativoUnivocoVersamento",
    "codiceContestoPagamento",
    "identificativoMessaggioReferenziato",
    "dataOraMessaggioReferenziato",
    "tipologiaMessaggioReferenziato",
    "mittenteMessaggioReferenziato"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class CtDatiMessaggioReferenziato {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoDominio;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoUnivocoVersamento;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String codiceContestoPagamento;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoMessaggioReferenziato;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar dataOraMessaggioReferenziato;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected StTipologiaMessaggioReferenziato tipologiaMessaggioReferenziato;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String mittenteMessaggioReferenziato;

    /**
     * Recupera il valore della proprietà identificativoDominio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoDominio() {
        return identificativoDominio;
    }

    /**
     * Imposta il valore della proprietà identificativoDominio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoDominio(String value) {
        this.identificativoDominio = value;
    }

    /**
     * Recupera il valore della proprietà identificativoUnivocoVersamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoUnivocoVersamento() {
        return identificativoUnivocoVersamento;
    }

    /**
     * Imposta il valore della proprietà identificativoUnivocoVersamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoUnivocoVersamento(String value) {
        this.identificativoUnivocoVersamento = value;
    }

    /**
     * Recupera il valore della proprietà codiceContestoPagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getCodiceContestoPagamento() {
        return codiceContestoPagamento;
    }

    /**
     * Imposta il valore della proprietà codiceContestoPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setCodiceContestoPagamento(String value) {
        this.codiceContestoPagamento = value;
    }

    /**
     * Recupera il valore della proprietà identificativoMessaggioReferenziato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoMessaggioReferenziato() {
        return identificativoMessaggioReferenziato;
    }

    /**
     * Imposta il valore della proprietà identificativoMessaggioReferenziato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoMessaggioReferenziato(String value) {
        this.identificativoMessaggioReferenziato = value;
    }

    /**
     * Recupera il valore della proprietà dataOraMessaggioReferenziato.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getDataOraMessaggioReferenziato() {
        return dataOraMessaggioReferenziato;
    }

    /**
     * Imposta il valore della proprietà dataOraMessaggioReferenziato.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setDataOraMessaggioReferenziato(XMLGregorianCalendar value) {
        this.dataOraMessaggioReferenziato = value;
    }

    /**
     * Recupera il valore della proprietà tipologiaMessaggioReferenziato.
     * 
     * @return
     *     possible object is
     *     {@link StTipologiaMessaggioReferenziato }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public StTipologiaMessaggioReferenziato getTipologiaMessaggioReferenziato() {
        return tipologiaMessaggioReferenziato;
    }

    /**
     * Imposta il valore della proprietà tipologiaMessaggioReferenziato.
     * 
     * @param value
     *     allowed object is
     *     {@link StTipologiaMessaggioReferenziato }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setTipologiaMessaggioReferenziato(StTipologiaMessaggioReferenziato value) {
        this.tipologiaMessaggioReferenziato = value;
    }

    /**
     * Recupera il valore della proprietà mittenteMessaggioReferenziato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getMittenteMessaggioReferenziato() {
        return mittenteMessaggioReferenziato;
    }

    /**
     * Imposta il valore della proprietà mittenteMessaggioReferenziato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setMittenteMessaggioReferenziato(String value) {
        this.mittenteMessaggioReferenziato = value;
    }

}
