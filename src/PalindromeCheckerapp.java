public class PalindromeCheckerapp {
    public static void main (String[] args){
        String pal="madam";
        int n=pal.length();
        String temp="";
        for(int i=(n-1);i>=0;i--){
            temp += pal.charAt(i);
        }
        if(temp.equals(pal)){
            System.out.println("yes 'madam' is palindrome ");
        }
        else{
            System.out.println("no 'madam' is not palindrome");
        }


    }
}
