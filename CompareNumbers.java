import java.util.Scanner;

public class CompareNumbers {
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println("A is greater than B");
        else if (a < b)
            System.out.println("A is less than B");
        else
            System.out.println("Both numbers are equal");

}
