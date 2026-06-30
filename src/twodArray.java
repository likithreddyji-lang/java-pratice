import java.util.*;
public class twodArray {
    //edi normal 2d array ki retrival
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println(arr[i][j]);
            }

        }

    }
}
