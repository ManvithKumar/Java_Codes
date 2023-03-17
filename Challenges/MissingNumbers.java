import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,5,6,8};
        HashSet<Integer> hp = new HashSet<>();
        HashSet<Integer> hp1 = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            hp.add(arr[i]);
        }
        for(int i =1;i<arr.length+1;i++)
        {
            if(!hp.contains(i)){
                System.out.println(i);
            }
        }
        // System.out.println(hp1);
    }
}
