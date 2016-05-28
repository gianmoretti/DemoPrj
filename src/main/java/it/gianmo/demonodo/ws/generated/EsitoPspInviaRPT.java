
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per esitoPspInviaRPT complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="esitoPspInviaRPT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esitoComplessivoOperazione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identificativoCarrello" type="{http://ws.pagamenti.telematici.gov/}stText35" minOccurs="0"/&gt;
 *         &lt;element name="parametriPagamentoImmediato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaErroriRPT" type="{http://ws.pagamenti.telematici.gov/}listaErroriRPT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitoPspInviaRPT", propOrder = {
    "esitoComplessivoOperazione",
    "identificativoCarrello",
    "parametriPagamentoImmediato",
    "listaErroriRPT"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public class EsitoPspInviaRPT {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String esitoComplessivoOperazione;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String identificativoCarrello;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected String parametriPagamentoImmediato;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    protected ListaErroriRPT listaErroriRPT;

    /**
     * Recupera il valore della proprietà esitoComplessivoOperazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getEsitoComplessivoOperazione() {
        return esitoComplessivoOperazione;
    }

    /**
     * Imposta il valore della proprietà esitoComplessivoOperazione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setEsitoComplessivoOperazione(String value) {
        this.esitoComplessivoOperazione = value;
    }

    /**
     * Recupera il valore della proprietà identificativoCarrello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getIdentificativoCarrello() {
        return identificativoCarrello;
    }

    /**
     * Imposta il valore della proprietà identificativoCarrello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setIdentificativoCarrello(String value) {
        this.identificativoCarrello = value;
    }

    /**
     * Recupera il valore della proprietà parametriPagamentoImmediato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public String getParametriPagamentoImmediato() {
        return parametriPagamentoImmediato;
    }

    /**
     * Imposta il valore della proprietà parametriPagamentoImmediato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setParametriPagamentoImmediato(String value) {
        this.parametriPagamentoImmediato = value;
    }

    /**
     * Recupera il valore della proprietà listaErroriRPT.
     * 
     * @return
     *     possible object is
     *     {@link ListaErroriRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public ListaErroriRPT getListaErroriRPT() {
        return listaErroriRPT;
    }

    /**
     * Imposta il valore della proprietà listaErroriRPT.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaErroriRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
    public void setListaErroriRPT(ListaErroriRPT value) {
        this.listaErroriRPT = value;
    }

}
