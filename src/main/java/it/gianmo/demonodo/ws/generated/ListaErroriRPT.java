
package it.gianmo.demonodo.ws.generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per listaErroriRPT complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="listaErroriRPT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fault" type="{http://ws.pagamenti.telematici.gov/}faultBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaErroriRPT", propOrder = {
    "fault"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
public class ListaErroriRPT {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    protected List<FaultBean> fault;

    /**
     * Gets the value of the fault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultBean }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T09:00:48+02:00", comments = "JAXB RI v2.2.11")
    public List<FaultBean> getFault() {
        if (fault == null) {
            fault = new ArrayList<FaultBean>();
        }
        return this.fault;
    }

}
