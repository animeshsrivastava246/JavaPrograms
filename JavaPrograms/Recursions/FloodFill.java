//package Recursions;
public class FloodFill{
    public static void main(String[] args) {
        int x[][] ={{1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,0,0},
                    {1,0,0,1,1,0,1,1},
                    {1,2,2,2,2,0,1,0},
                    {1,1,1,2,2,0,1,0},
                    {1,1,1,2,2,2,2,0},
                    {1,1,1,1,1,2,1,1},
                    {1,1,1,1,1,2,2,1}};
        floodFill(x, 4, 3, 7, 2);
        floodFill(x, 0, 0, 8, 1);
        printMat(x);
    }
    static void floodFill(int a[][],int r, int c, int toFill, int prevFill){
        int rows = a.length;
        int cols = a[0].length;
        if(r<0||r>=rows || c<0||c>=cols) return;
        if(a[r][c] != prevFill) return;
        a[r][c] = toFill;
        floodFill(a, r-1, c, toFill, prevFill);
        floodFill(a, r, c-1, toFill, prevFill);
        floodFill(a, r+1, c, toFill, prevFill);
        floodFill(a, r, c+1, toFill, prevFill);
    }
    static void printMat(int temp[][]){
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++)
                System.out.print(temp[i][j]+" ");
            System.out.println();
        }
    }
}