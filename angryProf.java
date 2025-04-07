import java.util.*;
public class angryProf {
    static String angryProfessor(int k,int[]a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=0){
                count++;
            }
        }
        if(count>=k){
            return"NO";
        }else{
            return"yes";
        }
        
    }public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }
        System.out.println(angryProfessor(k,a));
    }

    
}
