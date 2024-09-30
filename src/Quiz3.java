public class Quiz3 {

    public static void main(String[] args) {
        int var1 = 1*3*3*3+4;
        System.out.println("var1 = " + var1);
        
        int w = 2;
        w = 3*(10- --w)+ w++;
        System.out.println("w = " + w);
        
        int y=2,x=1,a=1,b=2;
        boolean flag = (y>x&&a<b);
        if(y>x || a<b){
            System.out.println("flag = " + flag);
        }
    }
}
