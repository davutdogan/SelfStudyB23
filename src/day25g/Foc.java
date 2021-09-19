package day25g;

public class Foc {
    public static void main(String[] args) {
        int []n={1,1,2,3,3,4};
        for (int j = 0; j <n.length-1 ; j++) {
            int element=n[j];
            int count=0;

            for (int i = 0; i <n.length ; i++) {
                if (n[i]==element){
                    count++;
                }
            }
            if (count==1){
                System.out.println(element);
            }

        }
    }
}
