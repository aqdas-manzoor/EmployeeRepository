interface OS{
    void spec();
}

class Windows implements OS{
    public void spec(){
        System.out.println("Windows");
    }
}
class Linux implements OS{
    public void spec(){
        System.out.println("Linux");
    }
}
class Mac implements OS{
    public void spec(){
        System.out.println("Mac");
    }
}
class MainOS{
    public static void main(String[] args) {
      FactoryDesignPattern fdp =new FactoryDesignPattern();
      OS os =fdp.MethodToAccess("Windows");
        os.spec();

    }
}
 class FactoryDesignPattern {
    public OS MethodToAccess(String s){
        if(s.equals("Windows")){
          return  new Windows();
        }
        else if (s.equals("Linux")){
           return new Linux();
        } else if (s.equals("Mac")){
          return  new Mac();
        }
        return null;
    }

}
