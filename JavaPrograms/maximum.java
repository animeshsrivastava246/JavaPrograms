import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Enter 3 nos.");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        max = a>b ? a>c?a:c : b>c?b:c ;
        System.out.println("Maximum of 3 numbers is "+max);
        sc.close();
    }
}