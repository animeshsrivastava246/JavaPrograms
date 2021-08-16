public class SortingPRG {
    public static void main(String args[]) {
    int a[] = {9,8,7,10,1,2,0,3,-4,-5,-6};
    {
        System.out.println("Bubble Sorting :");
        for(int i=0 ; i<a.length-1 ; i++){
            boolean sorted = true;
            for(int j=0 ; j<(a.length-1)-i ; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) break;
        }
        System.out.println("Sorted array:");
        for(int i:a)
            System.out.print(i+"  ");
        System.out.println("\n");
    }
    {
        System.out.println("Selection Sorting :");
        for(int i=0 ; i<a.length-1 ; i++){
            int minInd = i;
            for(int j=i ; j<a.length ; j++)
                if(a[j]<a[minInd])
                    minInd = j;
            int temp=a[i] ;
            a[i]=a[minInd] ;
            a[minInd]=temp ;
        }
        for(int item:a)
            System.out.print(item+"  ");
        System.out.println("\n");
    }
    }
}