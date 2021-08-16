import java.util.Scanner;
public class inputting 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        float x = sc.nextFloat();
        System.out.println(x+" was the input.");
        sc.close();
    }
}
