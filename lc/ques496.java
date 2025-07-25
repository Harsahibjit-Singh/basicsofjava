package lc;
class ques496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // HashMap<String,String> hm = new HashMap<>();
        int result[]=new int[nums1.length];
        int i=0;
        for(i=0;i<nums1.length;i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j]){
                    if(j + 1 < nums2.length && nums2[j]<nums2[j+1]){
                        result[i]=nums2[j+1];
                    }
                    else{
                        result[i]=-1;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ques496 q1 = new ques496();
        int nums1[]={3,5};
        int nums2[]={1,2,3,4,5};
        int arr[]=q1.nextGreaterElement(nums1,nums2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}