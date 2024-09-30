public class OperadorNegacion {

    public static void main(String[] args) {
        
        boolean flag = true;
        System.out.println("flag = " + flag);

        if(flag){
            System.out.println("Flag es Verdadero una Sola Vez: " + flag);
            //flag = !flag;
            System.out.println("Ahora flag es: " + flag);
        }

        if(flag){
            System.out.println("Flag no se va a Imprimir " + flag);
        }
        System.out.println("Fin del Programa");
    }
}
