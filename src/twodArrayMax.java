import java.util.*;
public class twodArrayMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=arr[0][0];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int val=arr[i][j];
                if(val>max){
                    max=val;
                }

            }
        }
        System.out.println(max);

    }
}
