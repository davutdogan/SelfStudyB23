package day34;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";
        int num = Integer.parseInt(str);

        String s = "2.5";
        Double d = Double.parseDouble(s);

        String s1 = "AAAA123#$%";

        String letter = "";
        String digits = "";
        String sCha = "";

        for (char each : s1.toCharArray()) {
            if (Character.isDigit(each)) {
            digits+=each;
            }else if (Character.isLetter(each)){
                letter+=each;
            }else{
                sCha+=each;
            }
        }
        System.out.println("sCha = " + sCha);
        System.out.println("digits = " + digits);
        System.out.println("letter = " + letter);
    }
}
