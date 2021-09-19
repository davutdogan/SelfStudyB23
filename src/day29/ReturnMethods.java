package day29;

public class ReturnMethods {
    public static void main(String[] args) {
        String str="Java";
        String  reverseStr=(str);

    }



    public static  String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
       return  result;
    }

    public static void isPalindrome(String str){
        String reversedStr=reverse(str);
        if (reversedStr.equals(str)){
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+"is not palindrome");
        }

    }
}
