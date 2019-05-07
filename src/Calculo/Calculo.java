/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo;

import jdk.nashorn.internal.objects.NativeMath;
import static jdk.nashorn.internal.objects.NativeMath.log;

/**
 *
 * @author Augusto
 */
public class Calculo {
    public Calculo(){
        
    }
    
    public int fator_bloco(int tbloco,int tr){
        return ((int)(tbloco/(tr*1.0)));
    }
    
    public double cardinalidade(int nR,int VRai){
        return (nR/(VRai * 1.0));
    }
    
    public int n_blocos(int nr,int fator_bloco){
        return (int)Math.round(nr/(fator_bloco*1.0));
    }
    
    public int busca_linear(int n_blocos, boolean tipo_atributo){
        if(tipo_atributo)
            return (int)Math.round(n_blocos/2.0);
        else
            return n_blocos;
    }
    
    public int busca_binaria(int n_blocos,double cardinalidade,int fator_bloco,boolean tipo_atributo){
        if(tipo_atributo)
            return (int)Math.round(Math.log(n_blocos)/Math.log(2));
        else{
            int a = (int)Math.round(Math.log(n_blocos)/Math.log(2));
            int b = (int)Math.round(cardinalidade/(fator_bloco*1.0));
            return (a + b - 1);
        }
    }
    
    public int numero_niveis(int fi,int N,int VRai){
        int a = (int)Math.round(VRai/(N*1.0));
        int hi = (int)Math.round(Math.log(a)/Math.log(fi));
        return hi;
    }
    
    public int busca_index_indice_primario(int hi,boolean tipo_atributo,double cardinalidade,int fator_bloco){
        if(tipo_atributo)
            return (hi + 1);
        else{
            int a = (int)Math.round(cardinalidade/(fator_bloco * 1.0));
            return (hi + a);
        }
    }
    
    public int busca_index_indice_secundario(int hi,double cardinalidade,boolean tipo_atributo){
        if(tipo_atributo){
            return (hi + 1);
        } else {
            return (int)Math.round(hi + 1.0 + cardinalidade);
        }
    }
    
    public int laco_aninhado_melhor_caso(int br, int bs){
        return (br + bs);
    }
    
    public int laco_aninhado_pior_caso(int br, int bs){
        int v1 = br + br * bs;
        int v2 = bs + bs * br;
        if(v1 < v2)
            return v1;
        else
            return v2;
    }
    
    public int laco_aninhado_com_indice(int br, int nr, int his){
        return (br + nr * (his + 1));
    }
}
