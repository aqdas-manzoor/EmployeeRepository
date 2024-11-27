final class IntegerTwo {

    private final int a;
    private final int b;

    IntegerTwo(int a,  int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args){
        IntegerTwo integerTwo= new IntegerTwo(3,4);
        System.out.println(integerTwo.getA());
        System.out.println(integerTwo.getB());
    }
}
