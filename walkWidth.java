import java.util.*;
public class walkWidth {
    static int walkWidth(int[] a, int k) {
        int width = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= k) {
                width += 1;
            } else {
                width += 2;
            }
        }
        return width; // <- NOW it's outside the loop and always returns
    }
    
    

        public static void main(String[]args){
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int K=s.nextInt();
            int[]a=new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=s.nextInt();
            }
            System.out.println(walkWidth(a, K));



        }
    }
    

