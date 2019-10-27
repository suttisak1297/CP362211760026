package Lab10;

public class Ex1 {

    public  static  void  B (int X) {
        System.out.println("Hello B "+X);
    }//B
    public static void main(String[] args) {
        System.out.println("Hello main");
        A();
        A();
        B(10);
        int S = C(10,20);
        System.out.println(S);
        System.out.println(C(50,50)*5);
    }//main
    public  static  void  A () {
       System.out.println("Hello A");
    }//A
    public static int C  (int X, int Y){
        int Z =X+Y;
            System.out.println("Hello C"+Z);
            B(Z);
            return Z;
    }//C




}//class
