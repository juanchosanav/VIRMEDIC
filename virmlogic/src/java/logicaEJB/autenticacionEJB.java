/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaEJB;

import javax.ejb.Stateless;
import modeloVO.loginVO;

/**
 *
 * @author SANRUS
 */
@Stateless
public class autenticacionEJB implements autenticacionEJBLocal {

    public boolean autentificar(loginVO usuario) {
        System.out.println("Hola desde autenticar");

        return true;

    }
    
}
