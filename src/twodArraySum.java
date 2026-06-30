import java.util.*;
public class twodArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                int val=arr[i][j];
                sum+=val;
            }
        }
        System.out.println(sum);


    }
}
