package OOPs;

class Cars{
    String type;
    int seats;
    public void start(){
        System.out.println("Car is starting.");
    }
    void fuel(){
        System.out.println("Fuel is full");
    }
}
class Bikes{
    String brand;
    int seats;
    void IncSeats(int n){
        seats += n;
    }
}
public class MainClass {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        Bikes bike1 = new Bikes();
        car1.fuel();
        bike1.brand = "Ninja" ;
        System.out.println(bike1.brand);
    }
}