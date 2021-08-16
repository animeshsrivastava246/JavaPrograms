package OOPs;

public class InheritanceMain {
    public static void main(String[] args) {
        InheritanceChild c1 = new InheritanceChild();
        c1.game();
        InheritanceChild2 c2 = new InheritanceChild2();
        c2.game2();
        c2.name = "Annu";
        System.out.println(c2.name);
        c1.eat();
        c2.eat();
        c1.walk();
        InheritanceChild p = new InheritanceChild();
        InheritanceParent p1 = p;
        p1.eat();
        InheritanceChild P = (InheritanceChild)p1;
        P.game();
        boolean IS = P instanceof InheritanceChild;
        System.out.println(IS);
    }
}