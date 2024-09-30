public class OperadoresIncrementales {

    public static void main(String[] args) {
        
        int c;
        c = 5;

        System.out.println("c = " + c);
        System.out.println("c++ = " + c++); //postincremento c-> 5
        System.out.println("c = " + c);

        c=5;
        System.out.println("c = " + c); //c-> 5
        System.out.println("++c = " + ++c);//preincremento, c->6
        System.out.println("c = " + c);

        c = 5;
        System.out.println("c = " + c); //c-> 5
        System.out.println("c = " + c--); //postincremento c->5
        System.out.println("c = " + c); //c-> 4

        c = 5;
        System.out.println("c = " + c);
        System.out.println("c = " + --c); //predecrementoc-> 4
        System.out.println("c = " + c); //c-> 4
    }
}