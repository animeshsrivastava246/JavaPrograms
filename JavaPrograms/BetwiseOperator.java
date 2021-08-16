public class BetwiseOperator
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f ;
        a = 5;
        b = 6;
        c = a & b;//and
        d = a | b;//or
        e = b >> 1;//right shift by 1(dividing by 2)
        f = a << 1;//left shift by 1(multiply by 2)
        System.out.println(c+" "+d+" "+e+" "+f);
    }
}