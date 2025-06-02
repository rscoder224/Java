class Student {
    String name;
    int age;


void showInfo(){
    System.out.println(name + " is " + age + " years old" );
}

}



public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Shaurya";
        s1.age = 22;
        s1.showInfo();
        Student s2 = new Student();
        s2.name = "Divyanshu";
        s2.age = 19;
           s2.showInfo();
    }
}
