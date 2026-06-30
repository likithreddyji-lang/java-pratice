import java.util.Scanner;
public class minArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new  int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int val:arr){
            if(val<min){
                min=val;
            }
        }
        System.out.println(min);
    }
}
