import java.util.*;

public class Subarray {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        int negCount=0;
        for(int i=0; i<n;i++){
            a[i]=scan.nextInt();
            int num=a[i];
            if(num<0){
                negCount++;
            }
            for(int j=i-1;j>=0;j--){
                num=num+a[j];
                if(num<0){
                    negCount++;
                }
            }
        }
        System.out.println(negCount);
        scan.close();
    }
}