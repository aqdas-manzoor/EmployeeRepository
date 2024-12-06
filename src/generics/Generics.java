package generics;

public class Generics<T>{
    private T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args){
        Generics<Integer> integer= new Generics<>();
        integer.setValue(10);
        System.out.println(integer.getValue());
    }

}
