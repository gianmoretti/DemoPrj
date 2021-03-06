package it.gianmo.demonodo.ws.pa;

import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.Generated;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-28T20:39:22.572+02:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "PagamentiTelematiciRTservice", 
                  wsdlLocation = "file:/C:/Users/Utente/IdeaProjects/DemoPrj/src/main/resources/wsdl/ec/PaPerNodo.wsdl",
                  targetNamespace = "http://NodoPagamentiSPC.spcoop.gov.it/servizi/PagamentiTelematiciRT") 
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00", comments = "Apache CXF 3.1.5")
public class PagamentiTelematiciRTservice extends Service {

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public final static URL WSDL_LOCATION;

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public final static QName SERVICE = new QName("http://NodoPagamentiSPC.spcoop.gov.it/servizi/PagamentiTelematiciRT", "PagamentiTelematiciRTservice");
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public final static QName PPTPort = new QName("http://NodoPagamentiSPC.spcoop.gov.it/servizi/PagamentiTelematiciRT", "PPTPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Utente/IdeaProjects/DemoPrj/src/main/resources/wsdl/ec/PaPerNodo.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PagamentiTelematiciRTservice.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Utente/IdeaProjects/DemoPrj/src/main/resources/wsdl/ec/PaPerNodo.wsdl");
        }
        WSDL_LOCATION = url;
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public PagamentiTelematiciRTservice(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public PagamentiTelematiciRTservice(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public PagamentiTelematiciRTservice() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public PagamentiTelematiciRTservice(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public PagamentiTelematiciRTservice(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public PagamentiTelematiciRTservice(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns PagamentiTelematiciRT
     */
    @WebEndpoint(name = "PPTPort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public PagamentiTelematiciRT getPPTPort() {
        return super.getPort(PPTPort, PagamentiTelematiciRT.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PagamentiTelematiciRT
     */
    @WebEndpoint(name = "PPTPort")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:22.572+02:00")
    public PagamentiTelematiciRT getPPTPort(WebServiceFeature... features) {
        return super.getPort(PPTPort, PagamentiTelematiciRT.class, features);
    }

}
