import java.util.Stack;

public class GetDiagonals{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[][] twoD_arr = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<twoD_arr.length;i++)
        {
            for(int j=0;j<twoD_arr.length;j++)
            {
                System.out.print(" "+twoD_arr[i][j]);
            }
        System.out.println(" ");
        }
        for(int i=0;i<twoD_arr.length;i++)
        {
           stack.push(twoD_arr[i][i]);
        }
        for(int i=0;i<twoD_arr.length;i++)
        {
           stack.push(twoD_arr[i][twoD_arr.length-i-1]);
        }
        System.out.println("Diagonal Elements are:-");
        System.out.println(stack);
    }
}