
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per paaInviaEsitoStorno complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="paaInviaEsitoStorno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificativoIntermediarioPA" type="{http://ws.pagamenti.telematici.gov/}stText35"/&gt;
 *         &lt;element name="identificativoStazioneIntermediarioPA" type="{http://ws.pagamenti.telematici.gov/}stText35"/&gt;
 *         &lt;element name="identificativoDominio" type="{http://ws.pagamenti.telematici.gov/}stText35"/&gt;
 *         &lt;element name="identificativoUnivocoVersamento" type="{http://ws.pagamenti.telematici.gov/}stText35"/&gt;
 *         &lt;element name="codiceContestoPagamento" type="{http://ws.pagamenti.telematici.gov/}stText35"/&gt;
 *         &lt;element name="er" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paaInviaEsitoStorno", propOrder = {
    "identificativoIntermediarioPA",
    "identificativoStazioneIntermediarioPA",
    "identificativoDominio",
    "identificativoUnivocoVersamento",
    "codiceContestoPagamento",
    "er"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
public class PaaInviaEsitoStorno {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoIntermediarioPA;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoStazioneIntermediarioPA;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoDominio;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoUnivocoVersamento;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    protected String codiceContestoPagamento;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    protected byte[] er;

    /**
     * Recupera il valore della proprietà identificativoIntermediarioPA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoIntermediarioPA() {
        return identificativoIntermediarioPA;
    }

    /**
     * Imposta il valore della proprietà identificativoIntermediarioPA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoIntermediarioPA(String value) {
        this.identificativoIntermediarioPA = value;
    }

    /**
     * Recupera il valore della proprietà identificativoStazioneIntermediarioPA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoStazioneIntermediarioPA() {
        return identificativoStazioneIntermediarioPA;
    }

    /**
     * Imposta il valore della proprietà identificativoStazioneIntermediarioPA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoStazioneIntermediarioPA(String value) {
        this.identificativoStazioneIntermediarioPA = value;
    }

    /**
     * Recupera il valore della proprietà identificativoDominio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public void setCodiceContestoPagamento(String value) {
        this.codiceContestoPagamento = value;
    }

    /**
     * Recupera il valore della proprietà er.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public byte[] getEr() {
        return er;
    }

    /**
     * Imposta il valore della proprietà er.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:22+02:00", comments = "JAXB RI v2.2.11")
    public void setEr(byte[] value) {
        this.er = value;
    }

}
