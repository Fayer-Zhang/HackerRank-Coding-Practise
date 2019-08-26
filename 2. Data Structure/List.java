import java.util.LinkedList;
import java.util.Scanner;


public class List {

    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        int N=scan.nextInt();
        LinkedList<Integer> l=new LinkedList<>();

        for(int i=0; i<N; i++){
            int value=scan.nextInt();
            l.add(value);  // Insert value into the end of the list   
        }

        int Q=scan.nextInt();
        for(int i=0; i<Q; i++){
            String z=scan.next();
            if (z.equals("Insert")){
                int index=scan.nextInt();
                int value=scan.nextInt();
                l.add(index,value);
            }else{
                int index=scan.nextInt();
                l.remove(index);
            }
        }
        scan.close();
        
        for(Integer num : l ){
            System.out.print(num+" ");
        }
    }
}
