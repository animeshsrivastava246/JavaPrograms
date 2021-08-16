package MyCollectionFramework;

public class Pairs<A, B> {
    A x;
    B y;
    public Pairs(A x, B Y){
        this.x = x;
        y = Y;
    }
    public void getInfo(){
        System.out.println(x+" and "+y);
    }
}
