package day10;

public class EmailDomain {
    public static void main(String[] args) {
        String email="John_Danile@apple.com";
        int beginningIndex=email.indexOf("@")+1;
        int endingIndex=email.indexOf(".");
        String domain=email.substring(beginningIndex,endingIndex);
        System.out.println("domain = " + domain);
    }
}
