import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0-4");
        int x = sc.nextInt();
        switch(x){
            case 0: case 1: 
                System.out.println("You are last.");
                break;
            case 2:
                System.out.println("You are first");
                break;
            case 3:
            case 4:
                System.out.println("You are a looser");
                break;
            default:
                System.out.println("Are you idiot?");
        }
        sc.close();
    }
}
