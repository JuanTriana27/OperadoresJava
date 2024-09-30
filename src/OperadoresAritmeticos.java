public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        //orden de presedencia
        int var1 = (1+2+3+4+5)/2;
        System.out.println("var1 = " + var1);
        
        int var2 = (4*4)+3;
        System.out.println("var2 = " + var2);
        
        int var3 = (2 * 3) % 3 + 2 / 2 - 1;
        System.out.println("var3 = " + var3);
        
        int var4 = 3*(3+4)+2*(1+1);
        System.out.println("var4 = " + var4);

        int mul = 2*3;
        int r = (mul/2)+4;
        System.out.println("El resultado es: "+r);
    }
}
