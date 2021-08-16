package OOPs;

public class Constructors {
    Constructors(){
        System.out.println("Constructors Object Created!");
    }
    public static void main(String[] args) {
        Constructors ob = new Constructors();
        ob.equals(ob);
        car obj = new car(4,6);
        car obj1 = new car();
        System.out.println(obj.wheels+" "+obj.lights+" "+obj.seats);
        System.out.println(obj1.wheels+" "+obj1.lights+" "+obj1.seats);
    }
}
class car{
    int wheels,lights,seats;
    car(int n,int seats){
        wheels = n;
        this.seats = seats;
        lights = 2;
    }
    car(){
        wheels = 4;
        seats = 2;
        lights = 2;
    }
}