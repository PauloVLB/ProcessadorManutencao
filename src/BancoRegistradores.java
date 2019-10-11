public class BancoRegistradores {
    private static int pc;
    private static Object mbr;
    private static int mar;
    private static String ir;
    private static int acc;

    public static String getIr() {return ir;}
    public static void setIr(String ir) {BancoRegistradores.ir = ir;}
    
    public static Object getMbr() {return mbr;}
    public static void setMbr(Object mbr) {BancoRegistradores.mbr = mbr;}
        
    public static int getPc() {return pc;}
    public static void setPc(int pc) {BancoRegistradores.pc = pc;}
    
    public static int getMar() {return mar;}
    public static void setMar(int mar) {BancoRegistradores.mar = mar;}

    public static int getAcc() {return acc;}
    public static void setAcc(int acc) {BancoRegistradores.acc = acc;}
    
}
