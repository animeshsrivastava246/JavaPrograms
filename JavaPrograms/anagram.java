import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        System.out.println("Enter two strings to check anagram:");
        a = sc.next();
        b = sc.next();
        a = a.toLowerCase();//to remove case diff error
        b = b.toLowerCase();
        int check[] = new int[256];
        boolean isAnagram = true;
        if(a.length()==b.length()){
            for(char c:a.toCharArray()){
                int ind = (int)c;//checking ASCII Value
                check[ind]++;
            }
            for(char c:b.toCharArray()){
                int ind = (int)c;//checking ASCII Value
                check[ind]--;
            }
            for(int i=0 ; i<256 ; i++){
                if(check[i] != 0){
                    isAnagram = false;
                    break;
                }
            }
        }
        if(isAnagram) System.out.println("Anagram");
        else System.out.println("Not Anagram");
        sc.close();
    }
}
