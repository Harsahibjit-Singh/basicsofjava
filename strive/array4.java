package strive;

import java.util.ArrayList;
import java.util.HashMap;

public class array4 {
    public static void main(String args[]){
        int nums[]= {2,0,2,1,1,0};
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
                hm.putIfAbsent(nums[i],new ArrayList());
                hm.get(nums[i]).add(nums[i]);
        }
        System.out.print("[");
        if(hm.containsKey(0)){
            System.out.print(hm.get(0).toString().replace("[", "").replace("]", ""));
        }
        if(hm.containsKey(1)){
            System.out.print(", ");
            System.out.print(hm.get(1).toString().replace("[", "").replace("]", ""));
        
        }
        if(hm.containsKey(2)){
            System.out.print(", ");
            System.out.print(hm.get(2).toString().replace("[", "").replace("]", ""));
        }
        System.out.print("]");
    }

}
