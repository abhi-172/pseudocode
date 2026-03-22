import java.util.Scanner;

public class MinArray {
         Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        int min = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] < min)
                min = a[i];
        }

        System.out.println("Minimum = " + min);
    }

}
