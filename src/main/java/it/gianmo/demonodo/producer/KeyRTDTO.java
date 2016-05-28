package it.gianmo.demonodo.producer;

/**
 * Created by Utente on 28/05/2016.
 */
public class KeyRTDTO {

    private String iuv;
    private String ccp;
    private String idDominio;

    public String getIuv() {
        return iuv;
    }

    public void setIuv(String iuv) {
        this.iuv = iuv;
    }

    public String getCcp() {
        return ccp;
    }

    public void setCcp(String ccp) {
        this.ccp = ccp;
    }

    public String getIdDominio() {
        return idDominio;
    }

    public void setIdDominio(String idDominio) {
        this.idDominio = idDominio;
    }

    public KeyRTDTO(String iuv, String ccp, String idDominio) {
        this.iuv = iuv;
        this.ccp = ccp;
        this.idDominio = idDominio;
    }
}
