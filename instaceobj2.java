class Car {
String name;
String model;
int speed;
String color;


void carInfo(){
    System.out.println("Car Name " + name);
    System.out.println("Car model " + model);
    System.out.println("Car speed " + speed);
    System.out.println("Car color " + color);
}

}
    

 public class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.name = "Swift";
        car1.model = "EF223";
        car1.speed = 180;
        car1.color = "voilet";
       car1.carInfo();    
    }
    
}
