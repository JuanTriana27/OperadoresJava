public class OperadorInstanceOf {

    public static void main(String[] args) {

        Integer var1 = 6;
        boolean b1 = var1 instanceof Integer;
        System.out.println("b1 = " + b1);
        
        String str = "Esto es una cadena";
        boolean b2 = str instanceof Object;
        System.out.println("b2 = " + b2);
    }
}
