import java.util.*;

public class LoopI {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N>=2 && N<=20){
            for(int i=1; i<11; i++){
                System.out.println(N+" x "+i+" = "+ N*i);
            }
        }
        
        scanner.close();
    }
}
