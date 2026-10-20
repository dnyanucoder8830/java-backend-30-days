public class Vehicle {
    public void Start(){
        System.out.println("the vehicle is started");
    }
}
class Bike extends Vehicle{
    public void ride(){
        System.out.println("bike ride is on");
    }
}
class run{
    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.Start();
        obj.ride();

    }
}
