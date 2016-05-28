package it.gianmo.demonodo.ws.psp;

import it.gianmo.demonodo.ws.generated.*;

import javax.annotation.Generated;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-28T20:39:19.709+02:00
 * Generated source version: 3.1.5
 * 
 */
@WebService(targetNamespace = "http://PuntoAccessoPSP.spcoop.gov.it", name = "FespPsp")
@XmlSeeAlso({ObjectFactory.class, ObjectFactory.class})
@Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:19.709+02:00", comments = "Apache CXF 3.1.5")
public interface FespPsp {

    @WebMethod(action = "pspChiediListaRT")
    @Action(input = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspChiediListaRT", output = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspChiediListaRTRisposta")
    @RequestWrapper(localName = "pspChiediListaRT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspChiediListaRT")
    @ResponseWrapper(localName = "pspChiediListaRTResponse", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspChiediListaRTResponse")
    @WebResult(name = "pspChiediListaRTResponse", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:19.709+02:00")
    public ChiediListaRTResponse pspChiediListaRT(
        @WebParam(name = "identificativoRichiedente", targetNamespace = "")
        java.lang.String identificativoRichiedente,
        @WebParam(name = "identificativoIntermediarioPSP", targetNamespace = "")
        java.lang.String identificativoIntermediarioPSP,
        @WebParam(name = "identificativoCanale", targetNamespace = "")
        java.lang.String identificativoCanale,
        @WebParam(name = "modelloPagamento", targetNamespace = "")
        java.lang.Integer modelloPagamento
    );

    @WebMethod(action = "pspChiediRT")
    @Action(input = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspChiediRT", output = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspChiediRTRisposta")
    @RequestWrapper(localName = "pspChiediRT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspChiediRT")
    @ResponseWrapper(localName = "pspChiediRTResponse", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspChiediRTResponse")
    @WebResult(name = "pspChiediRTResponse", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:19.709+02:00")
    public ValoreRT pspChiediRT(
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "")
        java.lang.String identificativoUnivocoVersamento,
        @WebParam(name = "codiceContestoPagamento", targetNamespace = "")
        java.lang.String codiceContestoPagamento
    );

    @WebMethod(action = "pspInviaRPT")
    @Action(input = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspInviaRPT", output = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspInviaRPTRisposta")
    @RequestWrapper(localName = "pspInviaRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspInviaRPT")
    @ResponseWrapper(localName = "pspInviaRPTResponse", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspInviaRPTResponse")
    @WebResult(name = "pspInviaRPTResponse", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:19.709+02:00")
    public EsitoPspInviaRPT pspInviaRPT(
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoPSP", targetNamespace = "")
        java.lang.String identificativoPSP,
        @WebParam(name = "identificativoIntermediarioPSP", targetNamespace = "")
        java.lang.String identificativoIntermediarioPSP,
        @WebParam(name = "identificativoCanale", targetNamespace = "")
        java.lang.String identificativoCanale,
        @WebParam(name = "modelloPagamento", targetNamespace = "")
        java.lang.Integer modelloPagamento,
        @WebParam(name = "elementoListaRPT", targetNamespace = "")
        java.util.List<TipoElementoListaRPT> elementoListaRPT
    );

    @WebMethod(action = "pspInviaAckRT")
    @Action(input = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspInviaAckRT", output = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspInviaAckRTRisposta")
    @RequestWrapper(localName = "pspInviaAckRT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspInviaAckRT")
    @ResponseWrapper(localName = "pspInviaAckRTResponse", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspInviaAckRTResponse")
    @WebResult(name = "pspInviaAckRTResponse", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:19.709+02:00")
    public TipoInviaAckRTResponse pspInviaAckRT(
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "")
        java.lang.String identificativoUnivocoVersamento,
        @WebParam(name = "codiceContestoPagamento", targetNamespace = "")
        java.lang.String codiceContestoPagamento,
        @WebParam(name = "ackRT", targetNamespace = "")
        CtMessaggioDiAcknowledgement ackRT
    );

    @WebMethod(action = "pspNotificaCancellazioneRPT")
    @Action(input = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspNotificaCancellazioneRPT", output = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspNotificaCancellazioneRPTRisposta")
    @RequestWrapper(localName = "pspNotificaCancellazioneRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspNotificaCancellazioneRPT")
    @ResponseWrapper(localName = "pspNotificaCancellazioneRPTResponse", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspNotificaCancellazioneRPTResponse")
    @WebResult(name = "pspNotificaCancellazioneRPTResponse", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:19.709+02:00")
    public ValoreNotificaCancellazioneRPT pspNotificaCancellazioneRPT(
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "")
        java.lang.String identificativoUnivocoVersamento,
        @WebParam(name = "codiceContestoPagamento", targetNamespace = "")
        java.lang.String codiceContestoPagamento
    );

    @WebMethod(action = "pspInviaRichiestaStorno")
    @Action(input = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspInviaRichiestaStorno", output = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspInviaRichiestaStornoRisposta")
    @RequestWrapper(localName = "pspInviaRichiestaStorno", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspInviaRichiestaStorno")
    @ResponseWrapper(localName = "pspInviaRichiestaStornoResponse", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspInviaRichiestaStornoResponse")
    @WebResult(name = "pspInviaRichiestaStornoResponse", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:19.709+02:00")
    public TipoInviaRichiestaStornoResponse pspInviaRichiestaStorno(
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "")
        java.lang.String identificativoUnivocoVersamento,
        @WebParam(name = "codiceContestoPagamento", targetNamespace = "")
        java.lang.String codiceContestoPagamento,
        @WebParam(name = "rr", targetNamespace = "")
        byte[] rr
    );

    @WebMethod(action = "pspInviaCarrelloRPT")
    @Action(input = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspInviaCarrelloRPT", output = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspInviaCarrelloRPTRisposta")
    @RequestWrapper(localName = "pspInviaCarrelloRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspInviaCarrelloRPT")
    @ResponseWrapper(localName = "pspInviaCarrelloRPTResponse", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspInviaCarrelloRPTResponse")
    @WebResult(name = "pspInviaCarrelloRPTResponse", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:19.709+02:00")
    public EsitoPspInviaCarrelloRPT pspInviaCarrelloRPT(
        @WebParam(name = "identificativoPSP", targetNamespace = "")
        java.lang.String identificativoPSP,
        @WebParam(name = "identificativoIntermediarioPSP", targetNamespace = "")
        java.lang.String identificativoIntermediarioPSP,
        @WebParam(name = "identificativoCanale", targetNamespace = "")
        java.lang.String identificativoCanale,
        @WebParam(name = "modelloPagamento", targetNamespace = "")
        java.lang.Integer modelloPagamento,
        @WebParam(name = "parametriProfiloPagamento", targetNamespace = "")
        java.lang.String parametriProfiloPagamento,
        @WebParam(name = "listaRPT", targetNamespace = "")
        TipoListaRPT listaRPT
    );

    @WebMethod(action = "pspChiediAvanzamentoRPT")
    @Action(input = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspChiediAvanzamentoRPT", output = "http://nodoPSP.fesp.it/ws/FespPsp/PSP/pspChiediAvanzamentoRPTRisposta")
    @RequestWrapper(localName = "pspChiediAvanzamentoRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspChiediAvanzamentoRPT")
    @ResponseWrapper(localName = "pspChiediAvanzamentoRPTResponse", targetNamespace = "http://ws.pagamenti.telematici.gov/", className = "gov.telematici.pagamenti.ws.PspChiediAvanzamentoRPTResponse")
    @WebResult(name = "pspChiediAvanzamentoRPTResponse", targetNamespace = "")
    @Generated(value = "org.apache.cxf.tools.wsdlto.WSDLToJava", date = "2016-05-28T20:39:19.709+02:00")
    public ValoreAvanzamentoRPT pspChiediAvanzamentoRPT(
        @WebParam(name = "identificativoDominio", targetNamespace = "")
        java.lang.String identificativoDominio,
        @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "")
        java.lang.String identificativoUnivocoVersamento,
        @WebParam(name = "codiceContestoPagamento", targetNamespace = "")
        java.lang.String codiceContestoPagamento
    );
}