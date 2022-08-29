
import java.util.Scanner;

public class Transpoz {


    public static void main(String[] args) {


        int[][] x = makeMatris();

        tOString(x);

        System.out.println();

        int[][] y = transpoz(x);

        tOString(y);

        
    }













    public static int[][] makeMatris(){
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini girin:");
        int n = input.nextInt();
        System.out.println("Sutun sayisini girin:");
        int k = input.nextInt();
        int[][] matris = new int[n][k];
        for (int i = 0; i < n; i++){
            for(int j =0; j<k;j++){
                System.out.println("Matrisin "+i+".satirinin "+j+".sutununun elemai:");
                int x =input.nextInt();
                matris[i][j]= x;
            }
        }
        return matris;
    }


    public static void tOString(int[][] arr){
        for (int i =0; i < arr.length; i++){
                System.out.println();
            for (int j = 0; j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }

    public static int[][] transpoz(int[][]arr){
        int row = 0;
        int col = 0;

        for (int i =0; i < arr.length; i++) {
            row += 1;
            for (int j = 0; j < arr[i].length; j++) {
                col += 1;
            }
        }
        col /= arr.length;

        int[][] tran = new int[col][row];

        for (int i =0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tran[j][i]=arr[i][j];
            }
        }
        return tran;
    }
}
