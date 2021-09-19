package day25h;

public class FOC {
    public static void main(String[] args) {
        int number[]={1,1,2,3,3,4};
        int element=number[0];
        int count=0;
        for (int i = 0; i <=number.length-1 ; i++) {
            if (number[i]==element){
                count++;
            }
        }
        if (count==1){
            System.out.println(element);
        }
    }
}
