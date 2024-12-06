package inheritance;

public class InheritanceDemo {
    private int a;
    private int b;


    public InheritanceDemo(int a, int b) {
        this.a = a;
        this.b = b;

    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }
}
 class InheritanceD extends InheritanceDemo{
     private int c;
     private int d;
     public InheritanceD(int a, int b, int c, int d) {
         super(a, b);
         this.c=c;
         this.d=d;

     }
     @Override
     public String toString() {
         return "InheritanceD [a=" + getA() + ", b=" + getB() + ", c=" + c + ", d=" + d + "]";
     }

     public static void main(String[] args){
         InheritanceD obj = new InheritanceD(3,4,5,6);
         System.out.println(obj);


     }
 }
