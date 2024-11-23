public class Human{
    private String eat;
    private String speak;

    public Human(String eat, String speak) {
        this.eat=eat;
        this.speak=speak;
    }

    public static void main(String[] args)
    {
        Human human = new Human("food","yes");
        System.out.println(human);
    }


}