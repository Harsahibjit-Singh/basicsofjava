package arrays;
import java.util.*;
public class search {
    public int linearsearch(int arr[], int search){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return i;
            }
        }
        return -1;
    }

    public int binarysearch(int arr[], int search){
        int start=0;
        int last=arr.length-1;//to match indices
        while(start<=last){
        int mid=(start+last)/2;
        if(search==arr[mid])
            return mid;
        else if(search<arr[mid]){
            last=mid-1; // to ignore mid element
        }
        else 
        start=mid+1; // to ignore mid element
        }
    return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter?");
        int arrsize=sc.nextInt();
        int arr[]=new int[arrsize];
        for(int i=0;i<arrsize;i++){
            System.out.println("Enter the element no. "+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched?");
        int search = sc.nextInt();
        search linear= new search();
        System.out.println("Linear Search Result");
        // int index=linear.linearsearch(arr, search);
        int index=linear.binarysearch(arr, search);
        if(index!=-1)
        System.out.println("Element found at index "+index);
        else
        System.out.println("Element not present in given array");
    }
}
