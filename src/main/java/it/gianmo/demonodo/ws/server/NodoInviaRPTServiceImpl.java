package it.gianmo.demonodo.ws.server;

import it.gianmo.demonodo.producer.CanaliDTO;
import it.gianmo.demonodo.producer.CanaliProducer;
import it.gianmo.demonodo.ws.generated.*;
import it.gianmo.demonodo.ws.pa.PagamentiTelematiciRPT;

import javax.activation.DataHandler;
import javax.jws.WebParam;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import java.math.BigInteger;

/**
 * Created by X230 on 23/05/2016.
 */
public class NodoInviaRPTServiceImpl implements PagamentiTelematiciRPT {


    @Override
    public NodoInviaRPTRisposta nodoInviaRPT(@WebParam(partName = "bodyrichiesta", name = "nodoInviaRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/") NodoInviaRPT bodyrichiesta, @WebParam(partName = "header", name = "intestazionePPT", targetNamespace = "http://ws.pagamenti.telematici.gov/ppthead", header = true) IntestazionePPT header) {
        try {
            CanaliProducer.getSingleInstance().publishMesssage(new CanaliDTO(bodyrichiesta.getIdentificativoCanale()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void nodoChiediInformativaPSP(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(name = "identificativoPSP", targetNamespace = "") String identificativoPSP, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "xmlInformativa", targetNamespace = "") Holder<DataHandler> xmlInformativa) {

    }

    @Override
    public void nodoChiediQuadraturaPA(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(name = "identificativoFlusso", targetNamespace = "") String identificativoFlusso, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "xmlQuadratura", targetNamespace = "") Holder<DataHandler> xmlQuadratura) {

    }

    @Override
    public void nodoInviaRichiestaStorno(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "") String identificativoUnivocoVersamento, @WebParam(name = "codiceContestoPagamento", targetNamespace = "") String codiceContestoPagamento, @WebParam(name = "rr", targetNamespace = "") byte[] rr, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "esito", targetNamespace = "") Holder<String> esito) {

    }

    @Override
    public void nodoChiediElencoFlussiRendicontazione(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(name = "identificativoPSP", targetNamespace = "") String identificativoPSP, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "elencoFlussiRendicontazione", targetNamespace = "") Holder<TipoElencoFlussiRendicontazione> elencoFlussiRendicontazione) {

    }

    @Override
    public void nodoChiediCopiaRT(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "") String identificativoUnivocoVersamento, @WebParam(name = "codiceContestoPagamento", targetNamespace = "") String codiceContestoPagamento, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "tipoFirma", targetNamespace = "") Holder<String> tipoFirma, @WebParam(mode = WebParam.Mode.OUT, name = "rt", targetNamespace = "") Holder<DataHandler> rt) {

    }

    @Override
    public NodoInviaCarrelloRPTRisposta nodoInviaCarrelloRPT(@WebParam(partName = "bodyrichiesta", name = "nodoInviaCarrelloRPT", targetNamespace = "http://ws.pagamenti.telematici.gov/") NodoInviaCarrelloRPT bodyrichiesta, @WebParam(partName = "header", name = "intestazioneCarrelloPPT", targetNamespace = "http://ws.pagamenti.telematici.gov/ppthead", header = true) IntestazioneCarrelloPPT header) {
        return null;
    }

    @Override
    public void nodoChiediFlussoRendicontazione(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(name = "identificativoPSP", targetNamespace = "") String identificativoPSP, @WebParam(name = "identificativoFlusso", targetNamespace = "") String identificativoFlusso, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "xmlRendicontazione", targetNamespace = "") Holder<DataHandler> xmlRendicontazione) {

    }

    @Override
    public void nodoChiediElencoQuadraturePA(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "listaQuadrature", targetNamespace = "") Holder<TipoListaQuadrature> listaQuadrature) {

    }

    @Override
    public void nodoChiediListaPendentiRPT(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(name = "rangeDa", targetNamespace = "") XMLGregorianCalendar rangeDa, @WebParam(name = "rangeA", targetNamespace = "") XMLGregorianCalendar rangeA, @WebParam(name = "dimensioneLista", targetNamespace = "") BigInteger dimensioneLista, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "listaRPTPendenti", targetNamespace = "") Holder<TipoListaRPTPendenti> listaRPTPendenti) {

    }

    @Override
    public void nodoChiediSceltaWISP(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(name = "keyPA", targetNamespace = "") String keyPA, @WebParam(name = "keyWISP", targetNamespace = "") String keyWISP, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "effettuazioneScelta", targetNamespace = "") Holder<StEffettuazioneScelta> effettuazioneScelta, @WebParam(mode = WebParam.Mode.OUT, name = "identificativoPSP", targetNamespace = "") Holder<String> identificativoPSP, @WebParam(mode = WebParam.Mode.OUT, name = "identificativoIntermediarioPSP", targetNamespace = "") Holder<String> identificativoIntermediarioPSP, @WebParam(mode = WebParam.Mode.OUT, name = "identificativoCanale", targetNamespace = "") Holder<String> identificativoCanale, @WebParam(mode = WebParam.Mode.OUT, name = "tipoVersamento", targetNamespace = "") Holder<StTipoVersamento> tipoVersamento) {

    }

    @Override
    public void nodoChiediStatoRPT(@WebParam(name = "identificativoIntermediarioPA", targetNamespace = "") String identificativoIntermediarioPA, @WebParam(name = "identificativoStazioneIntermediarioPA", targetNamespace = "") String identificativoStazioneIntermediarioPA, @WebParam(name = "password", targetNamespace = "") String password, @WebParam(name = "identificativoDominio", targetNamespace = "") String identificativoDominio, @WebParam(name = "identificativoUnivocoVersamento", targetNamespace = "") String identificativoUnivocoVersamento, @WebParam(name = "codiceContestoPagamento", targetNamespace = "") String codiceContestoPagamento, @WebParam(mode = WebParam.Mode.OUT, name = "fault", targetNamespace = "") Holder<FaultBean> fault, @WebParam(mode = WebParam.Mode.OUT, name = "esito", targetNamespace = "") Holder<EsitoChiediStatoRPT> esito) {

    }
}
