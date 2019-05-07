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
public class Tabela {
    private int nr;
    private int tr;
    private int tbloco;
    private int VRai;
    private boolean tipo_atributo;
    private int fi;
    private int N;
    
    public Tabela(){
        
    }

    public int getNr() {
        return nr;
    }

    public int getTr() {
        return tr;
    }

    public int getTbloco() {
        return tbloco;
    }

    public int getVRai() {
        return VRai;
    }

    public boolean isTipo_atributo() {
        return tipo_atributo;
    }

    public int getFi() {
        return fi;
    }

    public int getN() {
        return N;
    }
    
    public void setNr(int nr) {
        this.nr = nr;
    }

    public void setTr(int tr) {
        this.tr = tr;
    }

    public void setTbloco(int tbloco) {
        this.tbloco = tbloco;
    }

    public void setVRai(int VRai) {
        this.VRai = VRai;
    }

    public void setTipo_atributo(boolean tipo_atributo) {
        this.tipo_atributo = tipo_atributo;
    }

    public void setFi(int fi) {
        this.fi = fi;
    }

    public void setN(int N) {
        this.N = N;
    }
}
