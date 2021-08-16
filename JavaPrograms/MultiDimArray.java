public class MultiDimArray {
    public static void main(String args[]){
        int a[][][] = new int [5][4][6];
        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<a[i].length ; j++){
                for(int k=0 ; k<a[i][j].length ; k++){
                    a[i][j][k] = (i*100 + j*10 + k);
                    System.out.print(a[i][j][k]+"  ");
                }
                System.out.println();
            }
            System.out.println("\n\n");
        }
        System.out.println("\n");
        int b[][]={{1,2,3},{4,5},{6,7,8,9}};
        for(int j=0 ; j<b.length ; j++){
            System.out.print("\t");
            for(int k=0 ; k<b[j].length ; k++){
                b[j][k] = (j*10 + k);
                System.out.print(b[j][k]+"  ");
            }
            System.out.println();
        }
    }
}