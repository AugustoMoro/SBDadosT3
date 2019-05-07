/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Augusto
 */
public class Resultado {
    private int fator_bloco;
    private double cardinalidade;
    private int n_blocos;
    private int busca_linear;
    private int busca_binaria;
    private int hi;
    private int busca_index_primario;
    private int busca_index_secundario;
    private int laco_aninhado_melhor_caso;
    private int laco_aninhado_pior_caso;
    private int laco_aninhado_indice;
    
    public Resultado(){
        
    }

    public int getFator_bloco() {
        return fator_bloco;
    }
    
    public int getLacoMelhorCaso(){
        return laco_aninhado_melhor_caso;
    }
    
    public int getLacoPiorCaso(){
        return laco_aninhado_pior_caso;
    }
    
    public int getLacoIndice(){
        return laco_aninhado_indice;
    }
    
    public double getCardinalidade() {
        return cardinalidade;
    }

    public int getN_blocos() {
        return n_blocos;
    }

    public int getBusca_linear() {
        return busca_linear;
    }

    public int getBusca_binaria() {
        return busca_binaria;
    }

    public int getHi() {
        return hi;
    }

    public int getBusca_index_primario() {
        return busca_index_primario;
    }

    public int getBusca_index_secundario() {
        return busca_index_secundario;
    }

    public void setFator_bloco(int fator_bloco) {
        this.fator_bloco = fator_bloco;
    }

    public void setCardinalidade(double cardinalidade) {
        this.cardinalidade = cardinalidade;
    }

    public void setN_blocos(int n_blocos) {
        this.n_blocos = n_blocos;
    }

    public void setBusca_linear(int busca_linear) {
        this.busca_linear = busca_linear;
    }

    public void setBusca_binaria(int busca_binaria) {
        this.busca_binaria = busca_binaria;
    }

    public void setHi(int hi) {
        this.hi = hi;
    }

    public void setBusca_index_primario(int busca_index_primario) {
        this.busca_index_primario = busca_index_primario;
    }

    public void setBusca_index_secundario(int busca_index_secundario) {
        this.busca_index_secundario = busca_index_secundario;
    }

    public void setLaco_aninhado_melhor_caso(int laco_aninhado_melhor_caso) {
        this.laco_aninhado_melhor_caso = laco_aninhado_melhor_caso;
    }

    public void setLaco_aninhado_pior_caso(int laco_aninhado_pior_caso) {
        this.laco_aninhado_pior_caso = laco_aninhado_pior_caso;
    }

    public void setLaco_aninhado_indice(int laco_aninhado_indice) {
        this.laco_aninhado_indice = laco_aninhado_indice;
    }
    
    
    
    
}
