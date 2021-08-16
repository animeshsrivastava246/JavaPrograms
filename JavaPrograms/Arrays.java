public class Arrays {
    public static void main(String args[]){
        int a[] = new int[5];
        for(int i = 0 ; i<5 ; i++)
            a[i] = i*i;
        float[] b;
        b = new float[5];
        b[2] = 6.25f;
        String s[];
        s = new String[5];
        for(int i = 0 ; i<5 ; i++)
            s[i] = "string"+Integer.toString(i);
        char t[] = {'a','b','c','d','e'};
        int L = t.length;
        for(int i = 0 ; i<L ; i++)    
            System.out.println(a[i] +"\t"+ s[i]+"\t\t"+b[i]+"\t"+t[i]);
    }
}