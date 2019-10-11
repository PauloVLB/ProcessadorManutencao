public class ULA {
    
    public final static int SOMA = 0;
    public final static int SUB = 1;
    public final static int DIV = 2;
    public final static int MULT = 3;
    public final static int MAIOR = 4;
    public final static int MENOR = 5;
    public final static int IGUAL = 6;
    
    private static int operacao;
    private static double registrador;
    private static double acumulador;
    
    private ULA(){}
    public static void setOp(int operacao){ULA.operacao = operacao;}
    public static void setReg(int registrador){ULA.registrador = registrador;}
    public static void setAcc(int acumulador){ULA.acumulador = acumulador;}
    
    public static void clock(){
        switch(operacao){
            case SOMA:
                acumulador += registrador;
                break;
            case SUB:
                acumulador -= registrador;
                break;
            case DIV:
                acumulador /= registrador;
                break;
            case MULT:
                acumulador *= registrador;
                break;
            case MAIOR:
                acumulador = acumulador > registrador ? 1:0;
                break;
            case MENOR:
                acumulador = acumulador < registrador ? 1:0;
                break;
            case IGUAL:
                acumulador = acumulador == registrador ? 1:0;
                break;
        }
    }
    
    public static double getAcc(){return acumulador;}
    public static boolean getEstado(){return acumulador == 0;}
}
