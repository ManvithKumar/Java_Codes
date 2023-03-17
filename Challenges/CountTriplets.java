public class CountTriplets {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7};
        int index[] = new int[100];
        int count =0;
        for(int i=0;i<index.length;i++)
        {
            index[i] = 0;
        }
        for(int i=0;i<arr.length;i++)
        {
            index[arr[i]] = 1;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;i<arr.length;j++)
            {
                if(index[arr[i]+arr[j]]==1){
                    count++;
                }
            }
        }
        System.out.println(count);



    }
}
