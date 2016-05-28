
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per nodoChiediElencoQuadraturePARisposta complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="nodoChiediElencoQuadraturePARisposta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ws.pagamenti.telematici.gov/}risposta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaQuadrature" type="{http://ws.pagamenti.telematici.gov/}tipoListaQuadrature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodoChiediElencoQuadraturePARisposta", propOrder = {
    "listaQuadrature"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
public class NodoChiediElencoQuadraturePARisposta
    extends Risposta
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    protected TipoListaQuadrature listaQuadrature;

    /**
     * Recupera il valore della proprietà listaQuadrature.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaQuadrature }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public TipoListaQuadrature getListaQuadrature() {
        return listaQuadrature;
    }

    /**
     * Imposta il valore della proprietà listaQuadrature.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaQuadrature }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public void setListaQuadrature(TipoListaQuadrature value) {
        this.listaQuadrature = value;
    }

}
