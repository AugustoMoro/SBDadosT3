/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Calculo.Calculo;
import Model.Resultado;
import Model.Tabela;
import View.Frame;

/**
 *
 * @author Augusto
 */
public class FrameController {
    private Frame frm;
    private Resultado resR, resS;
    private Tabela tR, tS;
    public FrameController(){
        this.frm = new Frame(this);
        this.frm.setVisible(true);
        this.resR = new Resultado();
        this.resS = new Resultado();
    }
    
    public void calcularR(Tabela t){
        this.tR = t;
        Calculo c = new Calculo();
        this.resR.setFator_bloco(c.fator_bloco(t.getTbloco(),t.getTr()));
        this.resR.setCardinalidade(c.cardinalidade(t.getNr(), t.getVRai()));
        this.resR.setN_blocos(c.n_blocos(t.getNr(), this.resR.getFator_bloco()));
        this.resR.setBusca_linear(c.busca_linear(this.resR.getN_blocos(), t.isTipo_atributo()));
        this.resR.setBusca_binaria(c.busca_binaria(this.resR.getN_blocos(), this.resR.getCardinalidade(), this.resR.getFator_bloco(), t.isTipo_atributo()));
        this.resR.setHi(c.numero_niveis(t.getFi(), t.getN(), t.getVRai()));
        this.resR.setBusca_index_primario(c.busca_index_indice_primario(this.resR.getHi(), t.isTipo_atributo(), this.resR.getCardinalidade(), this.resR.getFator_bloco()));
        this.resR.setBusca_index_secundario(c.busca_index_indice_secundario(this.resR.getHi(), this.resR.getCardinalidade(), t.isTipo_atributo()));
        ResultadoRSController resRCtrl = new ResultadoRSController(this.resR);
    }
    
    public void calcularS(Tabela t){
        this.tS = t;
        Calculo c = new Calculo();
        this.resS.setFator_bloco(c.fator_bloco(t.getTbloco(),t.getTr()));
        this.resS.setCardinalidade(c.cardinalidade(t.getNr(), t.getVRai()));
        this.resS.setN_blocos(c.n_blocos(t.getNr(), this.resS.getFator_bloco()));
        this.resS.setBusca_linear(c.busca_linear(this.resS.getN_blocos(), t.isTipo_atributo()));
        this.resS.setBusca_binaria(c.busca_binaria(this.resS.getN_blocos(), this.resS.getCardinalidade(), this.resS.getFator_bloco(), t.isTipo_atributo()));
        this.resS.setHi(c.numero_niveis(t.getFi(), t.getN(), t.getVRai()));
        this.resS.setBusca_index_primario(c.busca_index_indice_primario(this.resS.getHi(), t.isTipo_atributo(), this.resS.getCardinalidade(), this.resS.getFator_bloco()));
        this.resS.setBusca_index_secundario(c.busca_index_indice_secundario(this.resS.getHi(), this.resS.getCardinalidade(), t.isTipo_atributo()));
        ResultadoRSController rsCtrl = new ResultadoRSController(this.resS);
    }
    
    public void calcularRS(){
        Calculo c = new Calculo();
        this.resR.setLaco_aninhado_melhor_caso(c.laco_aninhado_melhor_caso(this.resR.getN_blocos(), this.resS.getN_blocos()));
        this.resR.setLaco_aninhado_pior_caso(c.laco_aninhado_pior_caso(this.resR.getN_blocos(), this.resS.getN_blocos()));
        this.resR.setLaco_aninhado_indice(c.laco_aninhado_com_indice(this.resR.getN_blocos(), this.tR.getNr(), this.resS.getHi()));
        ResultadoLacoController resLacCtrl = new ResultadoLacoController(this.resR);
    }
}
