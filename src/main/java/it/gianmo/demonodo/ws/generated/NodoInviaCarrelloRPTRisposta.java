
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per nodoInviaCarrelloRPTRisposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="nodoInviaCarrelloRPTRisposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.pagamenti.telematici.gov/}risposta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="esitoComplessivoOperazione" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaErroriRPT" type="{http://ws.pagamenti.telematici.gov/}listaErroriRPT" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodoInviaCarrelloRPTRisposta", propOrder = {
    "esitoComplessivoOperazione",
    "url",
    "listaErroriRPT"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
public class NodoInviaCarrelloRPTRisposta
    extends Risposta
{

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    protected String esitoComplessivoOperazione;
    @XmlElement(defaultValue = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    protected String url;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    protected ListaErroriRPT listaErroriRPT;

    /**
     * Recupera il valore della proprietà esitoComplessivoOperazione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public void setEsitoComplessivoOperazione(String value) {
        this.esitoComplessivoOperazione = value;
    }

    /**
     * Recupera il valore della proprietà url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public String getUrl() {
        return url;
    }

    /**
     * Imposta il valore della proprietà url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Recupera il valore della proprietà listaErroriRPT.
     * 
     * @return
     *     possible object is
     *     {@link ListaErroriRPT }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public void setListaErroriRPT(ListaErroriRPT value) {
        this.listaErroriRPT = value;
    }

}
