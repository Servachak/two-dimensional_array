import java.util.Scanner;

/**
 * Created by adavi on 28.11.2017.
 */
public class Main {
    static int array_NxM[][];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        System.out.print("Количество строк: ");
        int n = in.nextInt();
        System.out.print("Количество столбцов: ");
        int m = in.nextInt();
        array_NxM = new int [n][m];

        for (int i=0; i<n; i++){
            for( int j=0; j<m; j++){
                array_NxM[i][j]= (int)(Math.random()*10);
                System.out.print(array_NxM[i][j]);
            }
            System.out.println();
        }

        int b=(int)(Math.random()*10);
        System.out.println();
        System.out.println(b);

    }
}
