package arrays;

import java.util.Scanner;

public class arraybasic{
    public int[] delete(int arr[], int delete){
        Scanner sc = new Scanner(System.in);
        if(delete==arr[arr.length-1]){
            int newarr[] = new int[arr.length-1];
            for(int i=0; i<arr.length-1;i++){
                newarr[i]=arr[i];
            }
            return newarr;
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]==delete){
                return swap(arr,i);
            }
        }
        return arr;
    }

    public int[] swap(int arr[], int index){
        int newarr[] = new int[arr.length-1];
        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            newarr[i]=arr[i];
        }
        return newarr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[5];
        // int arr[]={1,2,3,4,5};
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
        int delete=sc.nextInt();
        arraybasic ob1= new arraybasic();
        arr=ob1.delete(arr,delete);
        System.out.println(arr);
    }
}