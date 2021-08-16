package OOPs;

public class InheritanceChild extends InheritanceParent {
    public void game(){
        System.out.println("Playing game 1");
    }
    public void eat(){
        System.out.println("Not Eating");
        super.eat();
    }
}