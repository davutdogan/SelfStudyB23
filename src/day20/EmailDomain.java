package day20;

public class EmailDomain {
    public static void main(String[] args) {
        String email="Velideli@gmail.com";
        int indexOf=email.indexOf("@")+1;
        String domain=email.substring(indexOf);
        System.out.println("domain = " + domain);
    }
}
