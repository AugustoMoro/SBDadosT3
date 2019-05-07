/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Resultado;
import View.ResultadoLaco;

/**
 *
 * @author Augusto
 */
public class ResultadoLacoController {
    private Resultado res;
    private ResultadoLaco resLaco;
    public ResultadoLacoController(Resultado res){
        this.res = res;
        this.resLaco = new ResultadoLaco();
        this.resLaco.setVisible(true);
        this.resLaco.getjTextField1().setText(Integer.toString(this.res.getLacoMelhorCaso()));
        this.resLaco.getjTextField2().setText(Integer.toString(this.res.getLacoPiorCaso()));
        this.resLaco.getjTextField3().setText(Integer.toString(this.res.getLacoIndice()));
        
    }
}
