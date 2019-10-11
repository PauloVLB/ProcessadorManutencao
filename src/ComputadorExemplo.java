/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lennedy.form;
import lennedy.form.cpu.Cpu;
/**
 *
 * @author lenne
 */
public class ComputadorExemplo implements InterfaceForm{
    private DadosCpu dadosCpu;
    private Barramento dadosBarramento;
    private Cpu cpu;
    
    public ComputadorExemplo(){
        dadosCpu= new DadosCpu();
        dadosBarramento = new Barramento();
        cpu = new Cpu();
    }

    public void clock(){
        dadosBarramento = cpu.clock(dadosBarramento);
        
    }  

    public DadosCpu getDadosCpu(){
        dadosCpu = cpu.getDadosCpu();
        return dadosCpu;
    }
    
    public Barramento getDadosBarramento(){
        return dadosBarramento;
    }
}
