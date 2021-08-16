package MyCollectionFramework;

import java.io.*;
class Prime 
{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t,n;
        System.out.println("Enter the value of t");
        t = Integer.parseInt(in.readLine());
        for(int i=0; i<t; i++)
        {
            System.out.println("Enter Numbers to check prime or not");
            n = Integer.parseInt(in.readLine());
            int count =0;
            for(int div=2; div*div<=n; div++)
            {
                if(n%div == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
                System.out.println("Prime");
            else
                System.out.println("Not A Prime");
        }
    }
}