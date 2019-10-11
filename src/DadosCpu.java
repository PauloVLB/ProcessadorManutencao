/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lennedy.form;

/**
 *
 * @author lenne
 */
public class DadosCpu {
    private int pc;
    private int mar;
    private String mbr;
    private String ir;
    private int acc;
    
    private int subInstrucao;
    private boolean novaInstrucao;

    public void setSubInstrucao(int subInstrucao) {
        this.subInstrucao = subInstrucao;
    }

    public void setNovaInstrucao(boolean novaInstrucao) {
        this.novaInstrucao = novaInstrucao;
    }   

    public int getSubInstrucao() {
        return subInstrucao;
    }

    public boolean isNovaInstrucao() {
        return novaInstrucao;
    }

    public int getPc() {
        return pc;
    }

    public int getMar() {
        return mar;
    }

    public String getMbr() {
        return mbr;
    }

    public String getIr() {
        return ir;
    }

    public int getAcc() {
        return acc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public void setMar(int mar) {
        this.mar = mar;
    }

    public void setMbr(String mbr) {
        this.mbr = mbr;
    }

    public void setIr(String ir) {
        this.ir = ir;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }
    
    
}
