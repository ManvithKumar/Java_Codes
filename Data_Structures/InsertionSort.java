public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {7,6,5,4,3,2,1};
        int index = arr.length;
        for(int i=1;i<index;i++)
        {
            int value = arr[i];
            while(arr[i-1] > arr[i] && i>0 && i<index-1)
            {
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i=i-1;
            }
        }
        
    }
}
