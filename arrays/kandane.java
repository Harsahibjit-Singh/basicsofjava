package arrays;

import java.util.Scanner;

public class kandane {
    public int kandane(int arr[]){
        int maxsum=arr[0];
        int currentsum=arr[0];
        for(int i=0;i<arr.length;i++){
            currentsum=Math.max(arr[i],currentsum+arr[i]);
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements u want to enter:");
        int arrlen=sc.nextInt();
        int arr[]= new int[arrlen];
        for(int i=0;i<arrlen;i++){
            System.out.println("Enter element no. "+(i+1));
            arr[i]=sc.nextInt();
        }
        kandane obj=new kandane();
        int sum =obj.kandane(arr);
        System.out.println(sum);
    }
}
