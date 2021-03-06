package it.gianmo.demonodo.ws.pa;

import it.gianmo.demonodo.ws.generated.*;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-28T21:00:48.325+02:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://NodoPagamentiSPC.spcoop.gov.it/servizi/PagamentiTelematiciRPT", name = "PagamentiTelematiciRPT")
@XmlSeeAlso({ObjectFactory.class, ObjectFactory.class, ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00", comments = "Apache CXF 3.1.5")
public interface PagamentiTelematiciRPT {

    @WebMethod(action = "nodoInviaRPT")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoInviaRPTRichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoInviaRPTRisposta")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "nodoInviaRPTRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", partName = "bodyrisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public NodoInviaRPTRisposta nodoInviaRPT(
        @WebParam(partName = "bodyrichiesta", name = "nodoInviaRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/")
        NodoInviaRPT bodyrichiesta,
        @WebParam(partName = "header", name = "intestazionePPT", targetNamespace = "http://ws.pagamenti.telematici.gov/ppthead", header = true)
        IntestazionePPT header
    );

    @WebMethod(action = "nodoChiediInformativaPSP")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediInformativaPSPRichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediInformativaPSPRisposta")
    @RequestWrapper(localName = "nodoChiediInformativaPSP", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediInformativaPSP")
    @ResponseWrapper(localName = "nodoChiediInformativaPSPRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediInformativaPSPRisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoChiediInformativaPSP(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoPSP", targetNamespace = "")
        java.lang.String identificativoPSP,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "xmlInformativa", targetNamespace = "")
        javax.xml.ws.Holder<javax.activation.DataHandler> xmlInformativa
    );

    @WebMethod(action = "nodoChiediQuadraturaPA")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediQuadraturaPARichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediQuadraturaPARisposta")
    @RequestWrapper(localName = "nodoChiediQuadraturaPA", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediQuadraturaPA")
    @ResponseWrapper(localName = "nodoChiediQuadraturaPARisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediQuadraturaPARisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoChiediQuadraturaPA(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoFlusso", targetNamespace = "")
        java.lang.String identificativoFlusso,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "xmlQuadratura", targetNamespace = "")
        javax.xml.ws.Holder<javax.activation.DataHandler> xmlQuadratura
    );

    @WebMethod(action = "nodoInviaRichiestaStorno")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoInviaRichiestaStorno", output = "http://ws.pagamenti.telematici.gov/PPT/nodoInviaRichiestaStornoRisposta")
    @RequestWrapper(localName = "nodoInviaRichiestaStorno", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoInviaRichiestaStorno")
    @ResponseWrapper(localName = "nodoInviaRichiestaStornoRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoInviaRichiestaStornoRisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoInviaRichiestaStorno(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "")
        java.lang.String identificativoUnivocoVersamento,
        @WebParam(name = "codiceContestoPagamento", targetNamespace = "")
        java.lang.String codiceContestoPagamento,
        @WebParam(name = "rr", targetNamespace = "")
        byte[] rr,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "esito", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> esito
    );

    @WebMethod(action = "nodoChiediElencoFlussiRendicontazione")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediElencoFlussiRendicontazioneRichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediElencoFlussiRendicontazioneRisposta")
    @RequestWrapper(localName = "nodoChiediElencoFlussiRendicontazione", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediElencoFlussiRendicontazione")
    @ResponseWrapper(localName = "nodoChiediElencoFlussiRendicontazioneRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediElencoFlussiRendicontazioneRisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoChiediElencoFlussiRendicontazione(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoPSP", targetNamespace = "")
        java.lang.String identificativoPSP,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "elencoFlussiRendicontazione", targetNamespace = "")
        javax.xml.ws.Holder<TipoElencoFlussiRendicontazione> elencoFlussiRendicontazione
    );

    @WebMethod(action = "nodoChiediCopiaRT")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediCopiaRTRichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediCopiaRTRisposta")
    @RequestWrapper(localName = "nodoChiediCopiaRT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediCopiaRT")
    @ResponseWrapper(localName = "nodoChiediCopiaRTRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediCopiaRTRisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoChiediCopiaRT(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "")
        java.lang.String identificativoUnivocoVersamento,
        @WebParam(name = "codiceContestoPagamento", targetNamespace = "")
        java.lang.String codiceContestoPagamento,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "tipoFirma", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> tipoFirma,
        @WebParam(mode = WebParam.Mode.OUT, name = "rt", targetNamespace = "")
        javax.xml.ws.Holder<javax.activation.DataHandler> rt
    );

    @WebMethod(action = "nodoInviaCarrelloRPT")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoInviaCarrelloRPTRichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoInviaCarrelloRPTRisposta")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "nodoInviaCarrelloRPTRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", partName = "bodyrisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public NodoInviaCarrelloRPTRisposta nodoInviaCarrelloRPT(
        @WebParam(partName = "bodyrichiesta", name = "nodoInviaCarrelloRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/")
        NodoInviaCarrelloRPT bodyrichiesta,
        @WebParam(partName = "header", name = "intestazioneCarrelloPPT", targetNamespace = "http://ws.pagamenti.telematici.gov/ppthead", header = true)
        IntestazioneCarrelloPPT header
    );

    @WebMethod(action = "nodoChiediFlussoRendicontazione")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediFlussoRendicontazioneRichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediFlussoRendicontazioneRisposta")
    @RequestWrapper(localName = "nodoChiediFlussoRendicontazione", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediFlussoRendicontazione")
    @ResponseWrapper(localName = "nodoChiediFlussoRendicontazioneRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediFlussoRendicontazioneRisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoChiediFlussoRendicontazione(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoPSP", targetNamespace = "")
        java.lang.String identificativoPSP,
        @WebParam(name = "identificativoFlusso", targetNamespace = "")
        java.lang.String identificativoFlusso,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "xmlRendicontazione", targetNamespace = "")
        javax.xml.ws.Holder<javax.activation.DataHandler> xmlRendicontazione
    );

    @WebMethod(action = "nodoChiediElencoQuadraturePA")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediElencoQuadraturePARichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediElencoQuadraturePARisposta")
    @RequestWrapper(localName = "nodoChiediElencoQuadraturePA", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediElencoQuadraturePA")
    @ResponseWrapper(localName = "nodoChiediElencoQuadraturePARisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediElencoQuadraturePARisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoChiediElencoQuadraturePA(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "listaQuadrature", targetNamespace = "")
        javax.xml.ws.Holder<TipoListaQuadrature> listaQuadrature
    );

    @WebMethod(action = "nodoChiediListaPendentiRPT")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediListaPendentiRPTRichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediListaPendentiRPTRisposta")
    @RequestWrapper(localName = "nodoChiediListaPendentiRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediListaPendentiRPT")
    @ResponseWrapper(localName = "nodoChiediListaPendentiRPTRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediListaPendentiRPTRisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoChiediListaPendentiRPT(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "rangeDa", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar rangeDa,
        @WebParam(name = "rangeA", targetNamespace = "")
        javax.xml.datatype.XMLGregorianCalendar rangeA,
        @WebParam(name = "dimensioneLista", targetNamespace = "")
        java.math.BigInteger dimensioneLista,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "listaRPTPendenti", targetNamespace = "")
        javax.xml.ws.Holder<TipoListaRPTPendenti> listaRPTPendenti
    );

    @WebMethod(action = "nodoChiediSceltaWISP")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediSceltaWISPRichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediSceltaWISPRisposta")
    @RequestWrapper(localName = "nodoChiediSceltaWISP", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediSceltaWISP")
    @ResponseWrapper(localName = "nodoChiediSceltaWISPRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediSceltaWISPRisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoChiediSceltaWISP(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "keyPA", targetNamespace = "")
        java.lang.String keyPA,
        @WebParam(name = "keyWISP", targetNamespace = "")
        java.lang.String keyWISP,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "effettuazioneScelta", targetNamespace = "")
        javax.xml.ws.Holder<StEffettuazioneScelta> effettuazioneScelta,
        @WebParam(mode = WebParam.Mode.OUT, name = "identificativoPSP", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> identificativoPSP,
        @WebParam(mode = WebParam.Mode.OUT, name = "identificativoIntermediarioPSP", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> identificativoIntermediarioPSP,
        @WebParam(mode = WebParam.Mode.OUT, name = "identificativoCanale", targetNamespace = "")
        javax.xml.ws.Holder<java.lang.String> identificativoCanale,
        @WebParam(mode = WebParam.Mode.OUT, name = "tipoVersamento", targetNamespace = "")
        javax.xml.ws.Holder<StTipoVersamento> tipoVersamento
    );

    @WebMethod(action = "nodoChiediStatoRPT")
    @Action(input = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediStatoRPTRichiesta", output = "http://ws.pagamenti.telematici.gov/PPT/nodoChiediStatoRPTRisposta")
    @RequestWrapper(localName = "nodoChiediStatoRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediStatoRPT")
    @ResponseWrapper(localName = "nodoChiediStatoRPTRisposta", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.NodoChiediStatoRPTRisposta")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T21:00:48.325+02:00")
    public void nodoChiediStatoRPT(
        @WebParam(name = "identificativoIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoIntermediarioPA,
        @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "")
        java.lang.String identificativoStazioneIntermediarioPA,
        @WebParam(name = "password", targetNamespace = "")
        java.lang.String password,
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "")
        java.lang.String identificativoUnivocoVersamento,
        @WebParam(name = "codiceContestoPagamento", targetNamespace = "")
        java.lang.String codiceContestoPagamento,
        @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "")
        javax.xml.ws.Holder<FaultBean> fault,
        @WebParam(mode = WebParam.Mode.OUT, name = "esito", targetNamespace = "")
        javax.xml.ws.Holder<EsitoChiediStatoRPT> esito
    );
}
