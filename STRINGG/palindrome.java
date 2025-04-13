package STRINGG;

public class palindrome {
    static String reverse(String s){
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t=t+s.charAt(i);
        }
        return t;
    }
    static boolean isPalindrome(String s){
        if(s.equals(reverse(s))){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s="tap";
        System.out.println(isPalindrome(s));
    }
    
}
