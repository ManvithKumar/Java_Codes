public class SwapArray {
    public static void main(String[] args) {
        int[][] twoD_arr = { {1,2,3},{4,5,6},{7,8,9} };
        for(int i=0;i<twoD_arr.length;i++)
        {
            for(int j=0;j<twoD_arr.length;j++)
            {
                System.out.print(" "+twoD_arr[i][j]);
            }
        System.out.println(" ");
        }
        System.out.println("-------After Swapping-----------");
        diagonals(twoD_arr);
    }
    static void diagonals(int two[][])
    {
      int n=two.length;
      for(int i=0;i<two.length;i++)
      {
        int temp = two[i][i];
        two[i][i]=two[i][n-i-1];
        two[i][n-i-1]=temp;

      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
            System.out.print(" "+two[i][j]);
        }
        System.out.println(" ");
      }
    }
    
   
}
