package OOPs;

public class ExceptionHandling {
    public static void main(String[] args){
        try {
            int a=5,b=0;
            int ans = a/b;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()+" error occured, please check your code!");
        } try {
            Thread.sleep(3000);
        } catch (InterruptedException e){}
        finally{
            System.out.println("Sorry for inconvenience");
        }
        //fun1();
    }
    static void fun1(){
        boolean isDanger = true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("Danger coming!!!!");
        }
    }
}