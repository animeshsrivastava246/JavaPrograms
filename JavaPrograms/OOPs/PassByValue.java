package OOPs;

public class PassByValue {
    public static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }
    public static void main(String[] args) {
        int a=10,b=5;
        System.out.println("a & b = "+a+" & "+b);
        swap(a,b);
        System.out.println("a & b = "+a+" & "+b);
        
        PassByReference p = new PassByReference();
        PassByReference q = new PassByReference();
        p.val = 2;
        q.val = 3;
        System.out.println("p.val & q.val = "+p.val+" & "+q.val);
        swap(p,q);
        System.out.println("p.val & q.val = "+p.val+" & "+q.val);

        System.out.println("Val of p = "+p.val);
        changeVal(p);
        System.out.println("Val of p = "+p.val);
    }
    public static void swap(PassByReference u,PassByReference v){
        PassByReference temp = u;
        u = v;
        v = temp;
    }
    public static void changeVal(PassByReference c){
        c.val = 100;
    }
}
class PassByReference{
    int val;
}
