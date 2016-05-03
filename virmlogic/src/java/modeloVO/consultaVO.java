/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloVO;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author SANRUS
 */
public class consultaVO {
private Integer conumerocons;
private BigDecimal cousuaidenti;
private Integer coespecodigo;
private BigDecimal comedicoiden;
private Date cofecharegis;
private Date cofechaatenc;
private String coetapa;

    public Integer getConumerocons() {
        return conumerocons;
    }

    public BigDecimal getCousuaidenti() {
        return cousuaidenti;
    }

    public Integer getCoespecodigo() {
        return coespecodigo;
    }

    public BigDecimal getComedicoiden() {
        return comedicoiden;
    }

    public Date getCofecharegis() {
        return cofecharegis;
    }

    public Date getCofechaatenc() {
        return cofechaatenc;
    }

    public String getCoetapa() {
        return coetapa;
    }

    public void setConumerocons(Integer conumerocons) {
        this.conumerocons = conumerocons;
    }

    public void setCousuaidenti(BigDecimal cousuaidenti) {
        this.cousuaidenti = cousuaidenti;
    }

    public void setCoespecodigo(Integer coespecodigo) {
        this.coespecodigo = coespecodigo;
    }

    public void setComedicoiden(BigDecimal comedicoiden) {
        this.comedicoiden = comedicoiden;
    }

    public void setCofecharegis(Date cofecharegis) {
        this.cofecharegis = cofecharegis;
    }

    public void setCofechaatenc(Date cofechaatenc) {
        this.cofechaatenc = cofechaatenc;
    }

    public void setCoetapa(String coetapa) {
        this.coetapa = coetapa;
    }


}
