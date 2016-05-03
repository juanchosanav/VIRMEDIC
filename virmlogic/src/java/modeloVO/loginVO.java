/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloVO;

import java.util.Date;

/**
 *
 * @author SANRUS
 */
public class loginVO {
    
    private String lousuario;
    private String locontraseña;
    private Date lofecharegis;
    private Date lofecultingr;

    public String getLousuario() {
        return lousuario;
    }

    public String getLocontraseña() {
        return locontraseña;
    }

    public Date getLofecharegis() {
        return lofecharegis;
    }

    public Date getLofecultingr() {
        return lofecultingr;
    }

    public void setLousuario(String lousuario) {
        this.lousuario = lousuario;
    }

    public void setLocontraseña(String locontraseña) {
        this.locontraseña = locontraseña;
    }

    public void setLofecharegis(Date lofecharegis) {
        this.lofecharegis = lofecharegis;
    }

    public void setLofecultingr(Date lofecultingr) {
        this.lofecultingr = lofecultingr;
    }
    
    
    
}
