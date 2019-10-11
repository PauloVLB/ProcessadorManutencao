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
public class Barramento {
    private int end;
    private String dado;
    private boolean barramentoAtivo;
    private boolean recebendo;
    
    public Barramento(){
        dado =  new String();
    }
    
    public void envirDado(int end, String dado){
        this.end = end;
        this.dado = dado;
        this.recebendo=false;
        barramentoAtivo=true;
    }
    
    public void receberDado(int end){
        this.end=end;
        this.recebendo=true;        
        barramentoAtivo=true;
    }

    public int getEnd() {
        return end;
    }

    public String getDado() {
        return dado;
    }

    public boolean isBarramentoAtivo() {
        return barramentoAtivo;
    }

    public boolean isRecebendo() {
        return recebendo;
    }
    

    public void setEnd(int end) {
        this.end = end;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public void setBarramentoAtivo(boolean barramentoAtivo) {
        this.barramentoAtivo = barramentoAtivo;
    }

    void fim() {
        barramentoAtivo=false;
    }
    
    
}
