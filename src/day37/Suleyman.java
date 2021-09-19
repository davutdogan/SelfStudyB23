package day37;

public class Suleyman {
    public static void main(String[] args) {
        String name = "suleymannnn";
        for (int i = 0; i <=name.length()-1 ; i++) {
            char ch=name.charAt(i);
            int frequency=0;
            for (int j = 0; j <=name.length()-1; j++) {
                if (name.charAt(j)==ch){
                    frequency++;
                }
            }
            System.out.println(ch+"="+frequency);
        }
    }
}
