package arrays;

import java.util.Scanner;

public class sorting {
    public int[] bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
        return arr;
    }
    public int[] selectionsort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int max=i;
            for(int j=i;j<arr.length;j++){
            if(arr[j]>arr[max]){
                max=j;
            }
            }
            if(max!=i){
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            }
        }
        return arr;
    }





    public int[] insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want to enter?");
        int arrsize=sc.nextInt();
        int arr[] = new int [arrsize];
        for(int i=0;i<arrsize;i++){
            System.out.println("Enter element no. "+(i+1));
            arr[i]=sc.nextInt();
        }
        // int arr[] ={1,4,5,2,3};
        sorting raw=new sorting();
        int [] bubblearr=raw.bubblesort(arr);
        System.out.println("Bubble Sort:");
        for(int i=0;i<bubblearr.length;i++){
            System.out.print(bubblearr[i]+" ");
        }
        int [] selectionarr=raw.selectionsort(arr);

        System.out.println();
        System.out.println("Selection Sort:");
        for(int i=0;i<selectionarr.length;i++){
            System.out.print(selectionarr[i]+" ");
        }

        int [] insertionarr=raw.insertionsort(arr);

        System.out.println();
        System.out.println("Insertion Sort:");
        for(int i=0;i<insertionarr.length;i++){
            System.out.print(insertionarr[i]+" ");
        }
    }
}
