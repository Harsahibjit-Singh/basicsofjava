package patterns;
public class butterfly{
    public static void main(String[] args){
        int k=1;
        for(int i=1;i<6;i++){
            for(int j=1;j<11;j++){
                if(j<=k||j>=11-k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           k++;
            System.out.println();
        }
        k=4;
        for(int i=5;i>=1;i--){
            for(int j=1;j<11;j++){
                if(j<=k||j>=11-k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
           k--;
           System.out.println();
        }
    }
}