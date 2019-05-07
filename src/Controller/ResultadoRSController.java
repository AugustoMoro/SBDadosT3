/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Resultado;
import View.ResultadoRS;

/**
 *
 * @author Augusto
 */
public class ResultadoRSController {
    private Resultado res;
    private ResultadoRS resR;
    public ResultadoRSController(Resultado res){
        this.res = res;
        this.resR = new ResultadoRS();
        this.resR.setVisible(true);
        this.resR.getjTextField1().setText(Integer.toString(this.res.getFator_bloco()));
        this.resR.getjTextField2().setText(Double.toString(this.res.getCardinalidade()));
        this.resR.getjTextField3().setText(Integer.toString(this.res.getN_blocos()));
        this.resR.getjTextField4().setText(Integer.toString(this.res.getBusca_linear()));
        this.resR.getjTextField5().setText(Integer.toString(this.res.getBusca_binaria()));
    }
}
