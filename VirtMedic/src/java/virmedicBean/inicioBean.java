/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virmedicBean;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import logicaEJB.autenticacionEJB;
import modeloVO.loginVO;

/**
 *
 * @author SANRUS
 */

@ManagedBean

public class inicioBean {
    private loginVO loginUsuario = new loginVO();
    
    @EJB
    private autenticacionEJB autenticar;

    public loginVO getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(loginVO loginUsuario) {
        this.loginUsuario = loginUsuario;
    }
    
    public String ingreso(){
         
         //Llamar al EJB de autenticacion
         
         if(autenticar.autentificar(loginUsuario))
            return "Menuprincipal.xhtml";
         else
             return "";
            
         
     }
}
