import java.util.Stack;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] twoD_arr = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(twoD_arr, 4, 4);
        
    }
    static Stack<Integer> spiralMatrix(int arr[][],int r,int c){
        int top =0;
        int bottom=r-1;
        int left = 0;
        int right = c-1;
        Stack<Integer> spiral = new Stack<Integer>();
        int size1 = r*c,size2 = 0;
        while(size2<size1){
            for(int i=left;i<=right && size2<size1;i++)
            {
                spiral.push(arr[top][i]);
                size2++;
            }
        top++;
            for(int i=top;i<bottom && size2<size1;i++)
            {
                spiral.push(arr[i][right]);
                size2++;
            }
        right--;
            for(int i =right;i>left && size2<size1;i--){
                spiral.push(arr[bottom][i]);
                size2++;
            }
        bottom--;
        for(int i=bottom;i>=top && size2<size1;i--)
        {
            spiral.push(arr[i][left]);
            size2++;
        }
        left++;
        }

        return spiral;
    }
}
