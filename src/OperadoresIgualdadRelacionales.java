public class OperadoresIgualdadRelacionales {

    public static void main(String[] args) {
        
        //Operadores Igualdad y Distinto
        int num1 = 3;
        int num2 = 5;
        
        boolean igualdad = num1 == num2;
        System.out.println("igualdad = " + igualdad);

        boolean distinto = num1 != num2;
        System.out.println("distinto = " + distinto);

        if (distinto){
            System.out.println("Son iguales? = " + igualdad);
        }

        boolean mayor = num1 > num2;
        System.out.println("mayor = " + mayor);

        boolean menor = num1<num2;
        System.out.println("menor = " + menor);

        boolean mayorigual = num1>=num2;
        System.out.println("mayorigual = " + mayorigual);

        boolean menorigual = num1<=num2;
        System.out.println("mayorigual = " + menorigual);

        //ejercicio
        float var1 = 2, var2 = 4;
        boolean mayorEjercicio = var1>var2;
        if(mayorEjercicio){
            System.out.println("esta es una sentencia if = " + mayorEjercicio);
        }else{
            System.out.println("Es menor var1 = " + mayorEjercicio);
        }
    }
}
