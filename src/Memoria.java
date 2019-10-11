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
public class Memoria {
    private String[] dados = new String[100];
    
    public Memoria(){
        for(int i=0; i<100; i++){
            dados[i]="0";
        }
        dados[0] = "soma10";
        dados[1] = "sub 12";
        dados[2] = "mult5";
        
        dados[10] = "8";
        
    }

    public String getDados(int end) {
        return dados[end];
    }

    public void setDados(int end, String dados) {
        this.dados[end] = dados;
    }
    
    
}
