
import java.util.ArrayList;

public class UnidadeDeControle {
    
    
    private static ArrayList memoria = new ArrayList();
    
    public static void buscar(){
        BancoRegistradores.setMar(BancoRegistradores.getPc());
        BancoRegistradores.setPc(BancoRegistradores.getPc() + 1);
        BancoRegistradores.setMbr(memoria.get(BancoRegistradores.getMar()));
        BancoRegistradores.setIr((String) BancoRegistradores.getMbr());
    }
    
    public static void decodificar(){
        String instrucao = BancoRegistradores.getIr();
        
        switch(instrucao) {
            
                
        }
    }
    public static void buscarDados(){}
    public static void executar(){}
    public static void salvarDados(){}
}
