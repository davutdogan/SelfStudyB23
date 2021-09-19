package day13;

public class email {
    public static void main(String[] args) {
        String email="John_Daniel@apple.com";
        int beginningIndex=email.indexOf("@")+1;
        int endinIndex=email.indexOf(".");

        String domain=email.substring(beginningIndex,endinIndex);
        System.out.println("domain = " + domain);
    }
}
