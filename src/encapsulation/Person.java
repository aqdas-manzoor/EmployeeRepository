package encapsulation;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
        public static void main(String[] args) {
         Person person = new Person("John", 30);
         System.out.println(person.getName());
         System.out.println(person.getAge());
         person.setName("Aqdas");
         person.setAge(20);
         System.out.println(person.getName());
         System.out.println(person.getAge());

        }
}
