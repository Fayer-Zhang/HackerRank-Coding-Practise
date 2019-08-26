import java.util.Scanner;

public class StdinAndStdoutII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        System.out.print("String: ");
        while (scan.hasNextLine()) {
            
            String s=scan.nextLine();
            System.out.print(s);
            
        }
    
        System.out.println("");
        System.out.println("Double: " + d);
        System.out.print("Int: " + i);
        
        scan.close();
    }
}

