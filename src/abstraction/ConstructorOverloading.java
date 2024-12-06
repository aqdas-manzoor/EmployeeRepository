package abstraction;

/**
 * Constructor overloading using this() keyword --this() keyword is used to invoke another constructor within the same class
 */
public class ConstructorOverloading {
    private int a;
    private int b;
    private int c;
    private int d;
    public ConstructorOverloading(){
        this(0,0);
    }
    public ConstructorOverloading(int a, int b){
      this(a,b,0,0);
    }
    public ConstructorOverloading(int a, int b, int c, int d){
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
    }

    @Override
    public String toString() {
        return "ConstructorOverloading{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public static  void main(String[] args){
        ConstructorOverloading constructorOverloading = new ConstructorOverloading(3,5,6,7);
        System.out.println(constructorOverloading);


    }




}
