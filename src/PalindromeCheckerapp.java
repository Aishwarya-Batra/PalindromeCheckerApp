public class PalindromeCheckerapp {
    public static void main (String[] args){
        System.out.println("Welcome to Palindrome checker app management system");
        System.out.println("version1.0");
        System.out.println("system initialise succesfully");

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
