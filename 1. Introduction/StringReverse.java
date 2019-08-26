import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer B=new StringBuffer(A);
        B.reverse();

        int count = 0;
        for (int i=0; i<A.length(); i++){
            if (A.charAt(i)==B.charAt(i)){
                count++;
            }
        }
        
        if (count==A.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}



