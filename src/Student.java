public class Student {

    private int id;
    private String name;
    private String dOB;


    public Student(int id, String name, String dOB) {

        this.id=id;
        this.name=name;
        this.dOB=dOB;
    }

    public String getName() {
        return name;
    }

    public String getdOB() {
        return dOB;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args){

    for(int i=1; i<=5; i++){
        Student student=new Student(1+i,switch (i){
            case 1 -> "hina";
            case 2 -> "aqdas" ;
            case 3 -> "maira";
            case 4 -> "qalb";
            case 5 -> "fazal";
            default -> "talha";},"10=091999");
        System.out.println(student.getdOB());
        System.out.println(student.getId());
        System.out.println(student.getName());








    }


}}