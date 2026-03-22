import java.util.Scanner;

public class MatrixSum {
          Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
                sum += A[i][j];
            }
        }

        System.out.println("Sum = " + sum);
    }

}
