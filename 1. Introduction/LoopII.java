import java.util.*;
import java.util.Vector;

class LoopII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Vector<Vector<Integer>> v= new Vector<Vector<Integer>>();
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int x=a;
            Vector<Integer> w=new Vector<Integer>();
            
            for (int j=0; j<n; j++)
            {
                x=x+(int)Math.pow(2,j)*b;
                w.addElement(x);    
            }
            
            v.addElement(w);
        }

        for(int i=0; i<v.size();i++)
        {
            
            for (int j=0; j<v.get(i).size();j++){
                System.out.print(v.get(i).get(j));
                System.out.print(" ");  
            }
            System.out.println("");
        }

        in.close();
    }
}

