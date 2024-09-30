public class OperadoresLogicos {

    public static void main(String[] args) {
        
        boolean logicoAnd = true && true && true && true;
        System.out.println("logicoAnd = " + logicoAnd);

        boolean flag = true;
        logicoAnd = (4>3) && (flag == true) && (4*4)==16;
        System.out.println("flag = " + logicoAnd);
        
        boolean logicoOr = false || false || false || true;
        System.out.println("logicoOr = " + logicoOr);
        logicoOr = (4>3) && (flag == true) && (4*4)==16;
        System.out.println("logicoOr = " + logicoOr);
        
        boolean combinacionOper = (false || false)&& true || false;
        System.out.println("combinacionOper = " + combinacionOper);


        //ejercicio
        int numCervezas = 10, edad = 18;
        boolean permitido = (edad>=18) && (numCervezas>=1);
        if(permitido){
            System.out.println("Esta Persona Puede Tomar Cerveza");
            numCervezas--;
            System.out.println("Cervezas = " + numCervezas);
        }
        
    }
}
