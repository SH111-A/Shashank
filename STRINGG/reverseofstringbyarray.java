package STRINGG;

public class reverseofstringbyarray {
    static String reverse(String s){
        char[] c = s.toCharArray();
        int i=0;int j=c.length-1;
        while(i<=j){
            char temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return new String(c);

    }
    public static void main(String[] args) {
        String s="abcde";
        System.out.println(s);
        s=reverse(s);
        System.out.println(s);
    }
    
}
