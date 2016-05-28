
package it.gianmo.demonodo.ws.generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per stTipologiaMessaggioReferenziato.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="stTipologiaMessaggioReferenziato"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RPT"/&gt;
 *     &lt;enumeration value="RT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "stTipologiaMessaggioReferenziato")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-28T08:39:19+02:00", comments = "JAXB RI v2.2.11")
public enum StTipologiaMessaggioReferenziato {

    RPT,
    RT;

    public String value() {
        return name();
    }

    public static StTipologiaMessaggioReferenziato fromValue(String v) {
        return valueOf(v);
    }

}
