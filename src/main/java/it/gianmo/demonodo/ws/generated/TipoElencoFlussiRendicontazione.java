
package it.gianmo.demonodo.ws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipoElencoFlussiRendicontazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="tipoElencoFlussiRendicontazione"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totRestituiti" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idRendicontazione" type="{http://ws.pagamenti.telematici.gov/}tipoIdRendicontazione" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoElencoFlussiRendicontazione", propOrder = {
    "totRestituiti",
    "idRendicontazione"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
public class TipoElencoFlussiRendicontazione {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    protected int totRestituiti;
    @XmlElement(nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    protected List<TipoIdRendicontazione> idRendicontazione;

    /**
     * Recupera il valore della proprietà totRestituiti.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public int getTotRestituiti() {
        return totRestituiti;
    }

    /**
     * Imposta il valore della proprietà totRestituiti.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public void setTotRestituiti(int value) {
        this.totRestituiti = value;
    }

    /**
     * Gets the value of the idRendicontazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idRendicontazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdRendicontazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoIdRendicontazione }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public List<TipoIdRendicontazione> getIdRendicontazione() {
        if (idRendicontazione == null) {
            idRendicontazione = new ArrayList<TipoIdRendicontazione>();
        }
        return this.idRendicontazione;
    }

}
