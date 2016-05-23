package it.gianmo.demonodo.domain;

/**
 * Created by X230 on 23/05/2016.
 */
public class ChiavePagamento {

    String idDominio;
    String iuv;
    String ccp;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChiavePagamento that = (ChiavePagamento) o;

        if (idDominio != null ? !idDominio.equals(that.idDominio) : that.idDominio != null) return false;
        if (iuv != null ? !iuv.equals(that.iuv) : that.iuv != null) return false;
        return ccp != null ? ccp.equals(that.ccp) : that.ccp == null;

    }

    @Override
    public int hashCode() {
        int result = idDominio != null ? idDominio.hashCode() : 0;
        result = 31 * result + (iuv != null ? iuv.hashCode() : 0);
        result = 31 * result + (ccp != null ? ccp.hashCode() : 0);
        return result;
    }
}
