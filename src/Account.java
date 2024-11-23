public class Account {




    public static void main(String[] args){
//     for(int i=1; i<=100; i++){
//         System.out.print(i);
//         System.out.print(" ");
//
//     }
//     int i=1;
//    while(i<=100){
//         System.out.print(i);
//        System.out.print(" ");
//         i++;
//    }
//    int a=1;
//    do{
//
//        System.out.print(a);
//        System.out.print(" ");
//       a++;
//    }
//    while (a<=100);
//        Scanner scanner = new Scanner(System.in);
//        int table = scanner.nextInt();
//   for(int b=1; b<=10; b++){
//      System.out.println(table+" * "+b+" = "+(table*b));
//
//   }
//  String originalValue="Hello World";
//   String reverse= "";
//
//        for (int c = originalValue.length() - 1; c >= 0; c--) {
//            reverse += originalValue.charAt(c);
//
//    }
//        System.out.println(reverse);

//        String a="HelloWorld";
//        char b= a.charAt(7);
//         System.out.println(b);
//      System.out.println(a.length());
//      System.out.println(a.lastIndexOf('d'));

//      String c="Aqdas Manzoor";
//      if(c.contains("das")){
//          System.out.println("pass");
//      }else{
//          System.out.println("fail");
//      }
//      if(c.startsWith("Aqdas")){
//          System.out.println("pass");
//      }
//      if(c.endsWith("Manzoor")){
//          System.out.println("pass");
//      }
//  String birthDate="25/11/1982";
//  int startingIndex=birthDate.indexOf("1982");
//        System.out.println(startingIndex);
//        System.out.println(birthDate.substring(startingIndex));
     String newDate=String.join("/","10","09","1999");
        System.out.println(newDate);
        newDate="25";
       newDate= newDate.concat("/");
       newDate= newDate.concat("10");
        System.out.println(newDate);
       newDate="2a".concat("/").concat("11").concat("/").concat("12").concat("/");
        System.out.println(newDate);
        System.out.println(newDate.replace("/","---"));
//        System.out.println(newDate.replace("2","00"));
        System.out.println(newDate.replaceFirst("2","a"));
        System.out.println(newDate.replaceAll("1","7"));
        System.out.println("ABC\n".repeat(3));
        System.out.println("  ABC\t".repeat(3).indent(-1));
String name= "Hello Worrlddd!!!!";
        System.out.println(name.substring(5));
      String abc="Hello\t" + "world";
        System.out.println(abc);
        StringBuilder stringBuilder = new StringBuilder("Hello"+" World");
        stringBuilder.append("Bye");
        System.out.println(stringBuilder);

}
}
