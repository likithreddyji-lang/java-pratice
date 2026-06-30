import java.util.*;
public class arrayMul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int mul=1;
        for(int val:arr){
            mul*=val;

        }
        System.out.println(mul);

    }
}
