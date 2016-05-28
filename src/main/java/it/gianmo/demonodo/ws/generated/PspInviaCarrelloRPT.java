
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per pspInviaCarrelloRPT complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="pspInviaCarrelloRPT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificativoPSP" type="{http://ws.pagamenti.telematici.gov/}stText35" minOccurs="0"/&gt;
 *         &lt;element name="identificativoIntermediarioPSP" type="{http://ws.pagamenti.telematici.gov/}stText35" minOccurs="0"/&gt;
 *         &lt;element name="identificativoCanale" type="{http://ws.pagamenti.telematici.gov/}stText35" minOccurs="0"/&gt;
 *         &lt;element name="modelloPagamento" type="{http://ws.pagamenti.telematici.gov/}stModelloPagamento" minOccurs="0"/&gt;
 *         &lt;element name="parametriProfiloPagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaRPT" type="{http://ws.pagamenti.telematici.gov/}tipoListaRPT"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pspInviaCarrelloRPT", propOrder = {
    "identificativoPSP",
    "identificativoIntermediarioPSP",
    "identificativoCanale",
    "modelloPagamento",
    "parametriProfiloPagamento",
    "listaRPT"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class PspInviaCarrelloRPT {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoPSP;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoIntermediarioPSP;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoCanale;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected Integer modelloPagamento;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String parametriProfiloPagamento;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected TipoListaRPT listaRPT;

    /**
     * Recupera il valore della proprietà identificativoPSP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoPSP() {
        return identificativoPSP;
    }

    /**
     * Imposta il valore della proprietà identificativoPSP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoPSP(String value) {
        this.identificativoPSP = value;
    }

    /**
     * Recupera il valore della proprietà identificativoIntermediarioPSP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoIntermediarioPSP() {
        return identificativoIntermediarioPSP;
    }

    /**
     * Imposta il valore della proprietà identificativoIntermediarioPSP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoIntermediarioPSP(String value) {
        this.identificativoIntermediarioPSP = value;
    }

    /**
     * Recupera il valore della proprietà identificativoCanale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoCanale() {
        return identificativoCanale;
    }

    /**
     * Imposta il valore della proprietà identificativoCanale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoCanale(String value) {
        this.identificativoCanale = value;
    }

    /**
     * Recupera il valore della proprietà modelloPagamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public Integer getModelloPagamento() {
        return modelloPagamento;
    }

    /**
     * Imposta il valore della proprietà modelloPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setModelloPagamento(Integer value) {
        this.modelloPagamento = value;
    }

    /**
     * Recupera il valore della proprietà parametriProfiloPagamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getParametriProfiloPagamento() {
        return parametriProfiloPagamento;
    }

    /**
     * Imposta il valore della proprietà parametriProfiloPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setParametriProfiloPagamento(String value) {
        this.parametriProfiloPagamento = value;
    }

    /**
     * Recupera il valore della proprietà listaRPT.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public TipoListaRPT getListaRPT() {
        return listaRPT;
    }

    /**
     * Imposta il valore della proprietà listaRPT.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setListaRPT(TipoListaRPT value) {
        this.listaRPT = value;
    }

}
