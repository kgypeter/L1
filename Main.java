import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, count = 1;
        float  var, average, sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();

        while (count <= n) {
            var = sc.nextInt();
            sum += var;
            count ++;
        }

        average = sum/n;

        System.out.println("The Average is: " + average);
        System.out.println("Hello world!");
    }

}