
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per nodoChiediListaPendentiRPTRisposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="nodoChiediListaPendentiRPTRisposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.pagamenti.telematici.gov/}risposta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaRPTPendenti" type="{http://ws.pagamenti.telematici.gov/}tipoListaRPTPendenti" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodoChiediListaPendentiRPTRisposta", propOrder = {
    "listaRPTPendenti"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
public class NodoChiediListaPendentiRPTRisposta
    extends Risposta
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    protected TipoListaRPTPendenti listaRPTPendenti;

    /**
     * Recupera il valore della proprietà listaRPTPendenti.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaRPTPendenti }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public TipoListaRPTPendenti getListaRPTPendenti() {
        return listaRPTPendenti;
    }

    /**
     * Imposta il valore della proprietà listaRPTPendenti.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaRPTPendenti }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public void setListaRPTPendenti(TipoListaRPTPendenti value) {
        this.listaRPTPendenti = value;
    }

}
