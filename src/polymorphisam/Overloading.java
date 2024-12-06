package polymorphisam;

public class Overloading {
 public Overloading(){


 }
    public int add(int a, int b){
        return a+b;
    }


    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(double b, double a){

     return b+a;
    }

public static void main(String[] args){

        Overloading overloading = new Overloading();
       int addition1= overloading.add(3,5);
        int addition2= overloading.add(6,9,9);
        double addition3= overloading.add(10.0,10);
        System.out.println(addition2);
        System.out.println(addition1);
        System.out.println(addition3);



}

}
