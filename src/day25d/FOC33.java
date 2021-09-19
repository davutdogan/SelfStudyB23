package day25d;

public class FOC33 {
    public static void main(String[] args) {
        int n[]={1,1,2,3,3,4};

        for (int j = 0; j <=n.length-1 ; j++) {
            int element=n[j];
            int count=0;
            for (int i = 0; i <=n.length-1 ; i++) {
                if (n[i]==element){
                    count++;
                }
            }if (count==1){
                System.out.print(element+" ");
            }
        }
    }
}
