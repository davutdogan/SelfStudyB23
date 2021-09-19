package day11;

public class office {
    public static void main(String[] args) {
        String word="2juMp41EEkd4s4";
        int upperChars=0;
        String upperCase="";
        for (int i = 0; i <word.length() ; i++) {
            if (word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                upperChars++;
                upperCase+=word.charAt(i);

            }


        }
    }
}
