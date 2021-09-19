package day16;

public class foch {
    public static void main(String[] args) {
        String str = "aabcccdcccccccccccc";

        char ch='a';
        int frefuency=0;

        for (int i = 0; i <=str.length()-1 ; i++) {
            char each=str.charAt(i);
            if (each==ch){
                frefuency++;
            }


        }
        System.out.println("frefuency = " + frefuency);


    }
}
