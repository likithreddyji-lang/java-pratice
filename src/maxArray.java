import java.util.*;
public class maxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int arr[]=new int[5];
            for(int i=0;i<5;i++){
                arr[i]=sc.nextInt();
            }
            int max=arr[0];
            for(int val:arr){
                if(val>max){
                    max=val;
                }
            }
        System.out.println(max);



    }

}
